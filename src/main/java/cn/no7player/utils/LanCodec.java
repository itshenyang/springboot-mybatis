package cn.no7player.utils;

import org.junit.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by Huan on 2017/2/16.
 */
public class LanCodec {

    public static String encrypt(String code) {
        if (code != null && !code.equals("")) {
            String res = (new BASE64Encoder()).encodeBuffer(SecretUtils.encryptMode(code.getBytes()));
            return res.replace("\r", "").replace("\n", "");
        } else {
            return null;
        }
    }

    public static String decrypt(String code) {
        if (code != null && !code.equals("")) {
            try {
                byte[] e = SecretUtils.decryptMode((new BASE64Decoder()).decodeBuffer(code));
                return new String(e);
            } catch (IOException var2) {
                throw new RuntimeException("解密算法异常，code=" + code);
            }
        } else {
            return null;
        }
    }

    @Test
    public void main() {
        L.w(decrypt("Cn41IA9abmD3AZsh/BB/VzGssjhE3N+6w4wmcATCMRw="));
    }
}
