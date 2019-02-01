package com.example.app.service;

import com.example.app.domain.Users;
import com.example.app.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersMapper userMapper;

    public List<Users> findAll() {
        return userMapper.findAll();
    }
}