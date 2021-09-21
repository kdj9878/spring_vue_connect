package com.example.demo.controller;


import com.example.demo.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "token")
public class TokenController {
    
    @Autowired

    @PostMapping(value = "/getToken")
    public void getToken(MemberDTO mDto){

        
    }
}
