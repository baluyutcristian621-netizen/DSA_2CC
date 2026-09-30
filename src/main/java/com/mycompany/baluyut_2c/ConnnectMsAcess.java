package com.mycompany.baluyut_2c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CL2-PC
 */
public class ConnnectMsAcess {
    public static Connection con(){
        
        try{
            String url = "jdbc:ucanaccess://C://Users//CL2-PC//Documents//myDB ";
            Connection conn = DriverManager.getConnection(url);
            return conn;

            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null; 
        
        
    
    }
    
}
