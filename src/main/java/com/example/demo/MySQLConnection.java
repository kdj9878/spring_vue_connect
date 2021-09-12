package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://localhost:3307/test";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    
    public void test() throws Exception{
        Class.forName(DRIVER);
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
