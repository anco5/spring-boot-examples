package com.example.app.domain;

import lombok.Data;

@Data
public class Users {
    private Long id;
    private String name;
    private String password;
    private String role;
    private boolean finished;
}
