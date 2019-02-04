package com.example.app.controller;

import com.example.app.domain.Users;
import com.example.app.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/signup")
    public String signUpForm(Users users) {
        return "add-user";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid Users users, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        usersService.insert(users);
        model.addAttribute("users", usersService.findAll());
        return "home";
    }

    @GetMapping("/edit/{id}")
    public String updateForm(@PathVariable("id") long id, Model model) {
        Users user = usersService.findByID(id);
        if (user == null) {
            return "home";
        }

        model.addAttribute("user", user);
        return "update-user";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid Users users, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "update-user";
        }
        usersService.update(users);
        return "home";
    }

    @GetMapping("/lock/{id}")
    public String lock(@PathVariable("id") long id, Model model) {
        Users users = usersService.findByID(id);
        usersService.lock(users);
        model.addAttribute("users", usersService.findAll());
        return "home";
    }



}
