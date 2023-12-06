package com.example.springbootfirst.service;

import com.example.springbootfirst.dao.User;
import com.example.springbootfirst.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public List<User> findAll(int id){
        return userMapper.findAll(id);

    }
}
