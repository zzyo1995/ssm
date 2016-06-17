package com.zzyo.service;


import com.zzyo.bean.User;

import java.util.List;

/**
 * Created by zzyo on 2016/6/15.
 */
public interface UserService {

    List<User> findUsers() throws Exception ;
}
