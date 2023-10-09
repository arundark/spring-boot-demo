package com.dailycodebuffer.springbootdemo.controller;


import com.dailycodebuffer.springbootdemo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "hello";
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("arun");
        user.setEmailId("arunarangan10@gmai");

        return user;
    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id, @PathVariable("id2") String name){
        return "The path variable is : "+id +":"+ name;
    }
}
