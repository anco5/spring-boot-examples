package com.example.app.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Users {
    private Long id;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Password is mandatory")
    private String password;
    private boolean finished;
}
