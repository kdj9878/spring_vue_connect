package com.example.demo.DAO;

import com.example.demo.mapperInterface.UserMapper;
import com.example.demo.security.CostomUserDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {
    
    @Autowired
    private UserMapper usermapper;

    public CostomUserDetail getUserById(String member_name) {
        return usermapper.getUserById(member_name);
    }


}
