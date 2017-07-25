package com.jackie.controller;

import com.jackie.entity.User;
import com.jackie.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by lwxzbh on 2017/7/24.
 */
@Controller
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    public @ResponseBody User testUserDao(@PathVariable int id){
        User user = userMapper.findById(id);
        return user;
    }
    @RequestMapping(value = "/insertUser/{id}")
    public @ResponseBody String insertUser(@PathVariable int id){
        User user = new User(id+"","WEN-XIANG LEE",23);
        userMapper.insertUser(user);
        return "SUCCESS";
    }
}
