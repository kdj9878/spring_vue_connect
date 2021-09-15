package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/login")
@RestController
public class loginController {
    


    @GetMapping(value = "/do")
    public String login(){
        return "";
    }
}
