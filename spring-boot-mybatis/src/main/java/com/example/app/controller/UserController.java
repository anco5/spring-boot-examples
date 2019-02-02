package com.example.app.controller;

import com.example.app.domain.Users;
import com.example.app.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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

    @PostMapping("/edit/{id}")
    public String updateForm(@PathVariable("id") long id, Model model) {
        Users user = usersService.findByID(id);
        if (user == null) {
            model.addAttribute("message", "Invalid user Id:" + id);
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
        usersService.update(id);
        model.addAttribute("message", "Update complete");
        return "home";
    }


}
