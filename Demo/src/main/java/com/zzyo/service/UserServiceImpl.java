package com.zzyo.service;

import com.zzyo.bean.User;
import com.zzyo.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zzyo on 2016/6/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    public List<User> findUsers() throws Exception {
        List<User> userList = userMapper.selectByExample(null);
        return userList;
        //return null;
    }
}
