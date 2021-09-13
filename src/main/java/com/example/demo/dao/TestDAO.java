package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.member;
import com.example.demo.mapperInterface.MyMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDAO {
    
    @Autowired
    public MyMapper mapper;

    public List<member> getList(){
        return mapper.showList();
    }
}
