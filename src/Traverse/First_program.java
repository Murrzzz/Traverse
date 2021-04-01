/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traverse;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class First_program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

     
        int a;
        int a1;
        int b=0;
        
        System.out.println("Enter the size of an Array");
        b=sc.nextInt();
        
        int i[]=new int[b];
        
        System.out.println("Enter the Elements");
        for(a=0;a<b;a++)
        {
       i[a]= sc.nextInt();
    
        }
        
        System.out.println("The Elements Are");
         for(a1=0;a1<b;a1++)
        {
        
        System.out.println(i[a1]);
                
        }
        
         
    }
    
}
