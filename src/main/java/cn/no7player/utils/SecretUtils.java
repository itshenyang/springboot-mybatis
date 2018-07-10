package cn.no7player.utils;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Huan on 2017/2/16.
 */
public class SecretUtils {

    private static final String Algorithm = "DESede";
    public static final String PASSWORD_CRYPT_KEY = "2013shan234ghail234afdanmaoruanjianjishuyouxiangongsibaadfnquan234suoyo234uweizheb234ijiu";

    public SecretUtils() {
    }

    public static byte[] encryptMode(byte[] src) {
        try {
            SecretKeySpec e3 = new SecretKeySpec(build3DesKey("2013shan234ghail234afdanmaoruanjianjishuyouxiangongsibaadfnquan234suoyo234uweizheb234ijiu"), "DESede");
            Cipher c1 = Cipher.getInstance("DESede");
            c1.init(1, e3);
            return c1.doFinal(src);
        } catch (NoSuchAlgorithmException var3) {
            var3.printStackTrace();
        } catch (NoSuchPaddingException var4) {
            var4.printStackTrace();
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return null;
    }

    public static byte[] decryptMode(byte[] src) {
        try {
            SecretKeySpec e3 = new SecretKeySpec(build3DesKey("2013shan234ghail234afdanmaoruanjianjishuyouxiangongsibaadfnquan234suoyo234uweizheb234ijiu"), "DESede");
            Cipher c1 = Cipher.getInstance("DESede");
            c1.init(2, e3);
            return c1.doFinal(src);
        } catch (NoSuchAlgorithmException var3) {
            var3.printStackTrace();
        } catch (NoSuchPaddingException var4) {
            var4.printStackTrace();
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return null;
    }

    public static byte[] build3DesKey(String keyStr) throws UnsupportedEncodingException {
        byte[] key = new byte[24];
        byte[] temp = keyStr.getBytes("UTF-8");
        if (key.length > temp.length) {
            System.arraycopy(temp, 0, key, 0, temp.length);
        } else {
            System.arraycopy(temp, 0, key, 0, key.length);
        }

        return key;
    }
}
