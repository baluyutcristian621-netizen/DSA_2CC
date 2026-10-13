/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bryan_program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/** 
 *
 * @author CL2-PC
 */
public class MsconnectAccess {
    private static final String URL =
            "jdbc:ucanaccess://C://Users//CL2-PC//Documents//bryy.accdb";

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            con = DriverManager.getConnection(URL);

            System.out.println("Database connected successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("UCanAccess Driver not found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }

        return con;
    }
}
