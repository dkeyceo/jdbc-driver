package com.dkey.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static final String DB_DRIVER="com.mysql.jdbc.Driver";
    private static final String DB_URL="jdbc:mysql://localhost:3306/dictions";
    private static final String DB_USER="dim";
    private static final String DB_PASSWORD="dim";

    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            System.out.println("Connection is OK");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return connection;
    }
}
