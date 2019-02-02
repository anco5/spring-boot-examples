package com.example.app.service;

import com.example.app.domain.Users;
import com.example.app.mapper.UsersMapper;
import com.example.app.util.PasswordHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersMapper userMapper;

    @Autowired
    private PasswordHash hash;

    public List<Users> findAll() {
        return userMapper.findAll();
    }

    public void insert(Users users) {
        try {
            String hashPassword = hash.passwordToHash(users.getPassword());
            users.setPassword(hashPassword);
        } catch (Exception e) {
            // Hash error
        }

        userMapper.insert(users);
    }

    public Users findByID(long id) {
        return userMapper.findById(id);
    }

    public void update(Users users) {
        try {
            String hashPassword = hash.passwordToHash(users.getPassword());
            users.setPassword(hashPassword);
        } catch (Exception e) {
            // Hash error
        }

        userMapper.update(users);
    }
}
