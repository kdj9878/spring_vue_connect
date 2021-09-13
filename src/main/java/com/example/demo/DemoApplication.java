package com.example.demo;

import java.util.List;


import com.example.demo.dao.TestDAO;
import com.example.demo.dto.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan(basePackages = "com.example.demo.mapperInterface.*")
@SpringBootApplication
public class DemoApplication {

	@Autowired
	public TestDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value = "/about")
	public List<member> aboutPage(){
		for (member m : dao.getList()) {
			System.out.println(m.getL_no());
			System.out.println(m.getL_name());
			System.out.println("--------------------");
		}


		return dao.getList();
	}


}
