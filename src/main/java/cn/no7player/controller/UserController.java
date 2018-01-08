package cn.no7player.controller;

import cn.no7player.model.User;
import cn.no7player.service.UserService;
import cn.no7player.utils.L;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
@RequestMapping(value="/users")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public User getUserInfo() {
        //L.w("user1 ="+user1.toString());
        User user = userService.getUserInfo();
        if(user!=null){
            L.w("user.getName():" + user.getU_nickname());
        }
        return user;
    }

}
