package com.example.app.controller;

import com.example.app.domain.Users;
import com.example.app.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UsersService userService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("users", userService.findAll());
        return "home";
    }
}
