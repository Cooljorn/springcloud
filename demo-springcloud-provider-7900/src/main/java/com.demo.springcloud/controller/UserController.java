package com.demo.springcloud.controller;

import com.css.springcloud.microservicecloudapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
//    @Autowired
//    UserDao userDao;

    @RequestMapping("/{id}")
    public User findById(@PathVariable Long id){
//        User findOne = userDao.findOne(id);
        User findOne=null;
        return findOne;
    }
}
