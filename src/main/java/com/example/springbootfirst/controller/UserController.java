package com.example.springbootfirst.controller;

import com.example.springbootfirst.dao.User;
import com.example.springbootfirst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/sqli")
    public List<User> getUser(int id){
        return userService.findAll(id);

    }
}
