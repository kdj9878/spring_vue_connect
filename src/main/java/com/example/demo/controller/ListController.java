package com.example.demo.controller;

import java.util.List;

import com.example.demo.DAO.ListDAO;
import com.example.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {
    
    @Autowired
    private ListDAO listDao;

    @GetMapping("/about")
    public List<ListDTO> showList(){
        
        return listDao.getList();
    }


}
