package com.example.demo.DAO;

import java.util.List;

import com.example.demo.mapperInterface.ListMapper;
import com.example.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListDAO {
    
    @Autowired
    private ListMapper listMapper;

    public List<ListDTO> getList(){

        return listMapper.AllList();
    }
}
