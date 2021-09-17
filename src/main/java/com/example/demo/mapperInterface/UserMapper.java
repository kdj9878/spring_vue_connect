package com.example.demo.mapperInterface;

import com.example.demo.dto.MemberDTO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    MemberDTO getUserDetailWithAuthentication(String username);
    
}
