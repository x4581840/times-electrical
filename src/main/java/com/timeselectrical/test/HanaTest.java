package com.timeselectrical.test;

import java.sql.*;

/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-13 13:44
 * @Version 1.0
 **/

public class HanaTest {
    public static String connectionString = "jdbc:sap://172.23.1.123:39015";
    public static String user = "SYSTEM";
    public static String password = "Ankki@2009";

    public static void main(String[] argv) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString, user, password);
        } catch (SQLException e) {
            System.err.println("Connection Failed. User/Passwd Error? Message: " + e.getMessage());
            return;
        }
        if (connection != null) {
            try {
                System.out.println("Connection to HANA successful!");
                Statement stmt = connection.createStatement();
                ResultSet resultSet = stmt.executeQuery("select 'hello world' from dummy");
                resultSet.next();
                String hello = resultSet.getString(1);
                System.out.println(hello);
            } catch (SQLException e) {
                System.err.println("Query failed!");
            }
        }
    }
}
