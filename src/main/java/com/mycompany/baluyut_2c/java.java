/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baluyut_2c;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CL2-PC
 */
public class java {
    public static Connection conn() {
        try {
            String url = "jdbc:ucanaccess://C://Users//Windows//Documents//Database1.accdb";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
    }
    
}
