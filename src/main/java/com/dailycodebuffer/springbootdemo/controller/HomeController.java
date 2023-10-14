package com.dailycodebuffer.springbootdemo.controller;


import com.dailycodebuffer.springbootdemo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "hello";
    }

    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("arun");
        user.setEmailId("arunarangan10@gmai");

        return user;
    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id, @PathVariable("id2") String name) {
        return "The path variable is : " + id + ":" + name;
    }

    @GetMapping("/query")
    public String requestParam(@RequestParam String name,
                               @RequestParam(name = "email", required = false, defaultValue = "") String emailId) {

        return "name is : " + name + " Email is : " + emailId;
    }
}
