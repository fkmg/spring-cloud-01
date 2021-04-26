package com.sxt.controller;

import com.sxt.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/{id}")
    public User getUsers(@PathVariable Integer id){
        return new User(id,"zhangsan",20);
    }
}
