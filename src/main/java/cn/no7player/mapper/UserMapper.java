package cn.no7player.mapper;

import cn.no7player.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zl on 2015/8/27.
 */
@Repository
public interface UserMapper {
    public User findUserInfo();
}
