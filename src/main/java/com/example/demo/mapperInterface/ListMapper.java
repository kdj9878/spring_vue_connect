package com.example.demo.mapperInterface;

import java.util.List;

import com.example.demo.dto.ListDTO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ListMapper {


    List<ListDTO> AllList();

    

}
