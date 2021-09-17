package com.example.demo.DAO;

import com.example.demo.dto.MemberDTO;
import com.example.demo.mapperInterface.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailDAO implements UserDetailsService{
    
    @Autowired
    private UserMapper usermapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }
    public MemberDTO getUserDetail(String username){
        return usermapper.getUserDetailWithAuthentication(username);
    }
    
}
