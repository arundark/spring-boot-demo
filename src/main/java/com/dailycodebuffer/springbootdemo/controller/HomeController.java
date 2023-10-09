package com.dailycodebuffer.springbootdemo.controller;


import com.dailycodebuffer.springbootdemo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "hello";
    }

    @RequestMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("arun");
        user.setEmailId("arunarangan10@gmai");

        return user;
    }
}
