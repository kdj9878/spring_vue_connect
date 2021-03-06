package com.example.demo.controller;

import java.util.List;

import com.example.demo.DAO.ListDAO;
import com.example.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "movie")
public class MovieController {
    
    @Autowired
    private ListDAO listDao;

    @GetMapping("/getList")
    public List<ListDTO> showList(){
        
        return listDao.getList();
    }


}
