package com.example.demo.mapperInterface;

import java.util.List;

import com.example.demo.dto.member;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MyMapper{

    List<member> showList();
    











}