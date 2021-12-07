package com.why.serviceproviderframework;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args){
        String jdbcUrl = "jdbc:mysql://192.168.7.163:3308/mp-web?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&useSSL=false&failOverReadOnly=false&allowPublicKeyRetrieval=true&allowMultiQueries=true";
        String userName = "root";
        String password = "tjF9y9zM";
        try {

//            Class<?> mysqlDriver = Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement("select count(1) as count from mp_operator");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int count = resultSet.getInt("count");
                System.out.println(count);
            }

            System.out.println(resultSet);
        }  catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
