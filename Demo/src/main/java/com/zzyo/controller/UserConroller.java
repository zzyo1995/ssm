package com.zzyo.controller;

import com.zzyo.bean.User;
import com.zzyo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zzyo on 2016/6/15.
 */
@Controller
public class UserConroller {

    @Resource
    private UserService userService;

    @RequestMapping("/listusers")
    public ModelAndView findUser() throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
        List<User> users = userService.findUsers();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        //设置响应的jsp视图
        modelAndView.setViewName("findUser");

        System.out.print(users);
        return modelAndView;
    }
}
