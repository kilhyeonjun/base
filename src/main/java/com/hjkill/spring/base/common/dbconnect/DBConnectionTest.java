package com.hjkill.spring.base.common.dbconnect;

import java.sql.*;

public class DBConnectionTest {
    public static void main(String[] args){
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306?serverTimezone=UTC",
                    "root",
                    ""
            );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(
                    "show databases"
            );
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
