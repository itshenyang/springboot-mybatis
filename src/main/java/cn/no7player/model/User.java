package cn.no7player.model;

import org.apache.ibatis.type.Alias;

/**
 * Created by zl on 2015/8/27.
 */
public class User {
    private String u_nickname;
    private String u_pwd;

    public String getU_nickname() {
        return u_nickname;
    }

    public void setU_nickname(String u_nickname) {
        this.u_nickname = u_nickname;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }
}
