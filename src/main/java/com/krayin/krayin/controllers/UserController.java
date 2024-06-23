package com.krayin.krayin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krayin.krayin.entity.User;

@Controller
public class UserController {
    @GetMapping("/")
    @ResponseBody
    public User index() {
        return (new User(1, "Suraj Kashyap", "suraj.kashyap9911@gmail.com"));
    }
}
