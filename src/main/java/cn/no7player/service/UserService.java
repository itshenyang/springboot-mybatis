package cn.no7player.service;

import cn.no7player.mapper.UserMapper;
import cn.no7player.model.User;
import cn.no7player.utils.LanCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "Exception")
    public User getUserInfo(){
        User user=userMapper.findUserInfo();

        //User user=null;
        return user;
    }

}
