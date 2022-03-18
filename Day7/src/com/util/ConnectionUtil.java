package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 

public class ConnectionUtil {

 

    public static Connection getConnection()
    {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

 

            String url = "jdbc:mysql://localhost:3306/TestEmp";

 

            con = DriverManager.getConnection(url, "root", "root");

 

            System.out.println("Connection Extablished.....");

 

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return con;
    }
}