package com.example.demo.mapperInterface;

import com.example.demo.security.CostomUserDetail;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {


    CostomUserDetail getUserById(String member_name);
    
}
