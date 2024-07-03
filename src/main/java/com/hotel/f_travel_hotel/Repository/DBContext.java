package com.hotel.f_travel_hotel.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    public static String user = "root";
    public static String password = "duy129171";
    public static String url = "jdbc:mysql://localhost:3306/f_travel";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


    public static void main(String[] args) {
        try {
            Connection connection = DBContext.getConnection();
            if (connection != null) {
                System.out.println("Success");
            } else {
                System.out.println("Again");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}