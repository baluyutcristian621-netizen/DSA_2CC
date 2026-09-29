/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baluyut_2c;

import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class dsa_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner
        //Basic Output Syntax
        System.out.println("Hello World!");
        System.out.println("JHARED REUVEN S FACUN");
        System.out.println("Section 2C");    
        // Comment
        System.out.println("Enter a number 1: ");
        int x = input.nextInt();
        System.out.println("Enter a number 2: ");
        int y = input.nextInt();
        
        int sum, diff, prod, quo;
        sum = x + y;
        diff = x - y;
        prod = x * y;
        quo = x / y;
        
        System.out.println("The sum is: "+sum);
        System.out.println("The difference is: "+diff);
        System.out.println("The product is: "+prod);
        System.out.println("The quotient is: "+quo);
    }
    
}
