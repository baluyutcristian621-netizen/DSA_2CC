/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chano_program;

import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class rps {
   public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    System.out.println("[Rock] =1");
    System.out.println("[Paper] =2");
    System.out.println("[Scissor] =3");
    
    System.out.println("Enter Player 1");
     int p1 = input.nextInt();
     
    System.out.println("Enter Player 2");
     int p2 = input.nextInt();
     
     if (p1==1 && p2==1)
     {
         System.out.println("Draw");
     }
     
     else if (p1==1 && p2==2)
     {
         System.out.println("Player 2 Wins");
     } 
     
     else if (p1==1 && p2==3)
     {
         System.out.println("Player 1 Wins");
     } 
     
     else if (p2==2 && p1==1)
     {
         System.out.println("Player 2 Wins ");
     }
     
     else if (p2==2 && p1==2)
     {
         System.out.println("Draw");
     }
     else if (p2==2 && p1==3)
     {
         System.out.println("Player 1 Wins");
     }
     
     else if (p2==3 && p2==1)
     {
         System.out.println("Player 1 Wins");
     }
     
     else if (p1==3 && p2==2)
     {
         System.out.println("Player 1 Wins");
     }
     
     else if (p1==3 && p2==3)
     {
         System.out.println("Draw");
     }
     
     }
}
