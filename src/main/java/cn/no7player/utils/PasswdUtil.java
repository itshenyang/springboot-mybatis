package cn.no7player.utils;

/**
 * Created by Huan on 2017/2/16.
 */
public class PasswdUtil {

    private static String SUFIX = "lanmao20131316";

    public static String encode(String passwdM) {
        return LanCodec.encrypt(SUFIX + passwdM);
    }

}
