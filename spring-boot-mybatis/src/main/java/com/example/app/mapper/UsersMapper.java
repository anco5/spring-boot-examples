package com.example.app.mapper;

import com.example.app.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UsersMapper {
    List<Users> findAll();

    void insert(Users users);

    Users findById(long id);

    void update(Users users);

    void lock(Users users);
}
