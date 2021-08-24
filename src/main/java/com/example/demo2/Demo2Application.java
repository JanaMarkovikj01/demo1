package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.sql.*;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Demo2Application.class, args);
        String targetID = null;

        //database part
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from gods");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                targetID = resultSet.getString("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema", "root", "root");
            Statement statement = connection.createStatement();
            PreparedStatement prepared = connection.prepareStatement("SELECT * FROM powers WHERE god_fk = ?;");
            prepared.setString(1, targetID);
            ResultSet rs = prepared.executeQuery();


            while (rs.next()) {
                System.out.println(rs.getString("standardPower"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
