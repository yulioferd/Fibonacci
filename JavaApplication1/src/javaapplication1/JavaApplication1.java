/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    //add fibonacci of sum
    public static void main(String[] args) {
       int n=0, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int sum = 0; 
        int num = s.nextInt();
        System.out.print("Fibonacci:");
        for(int i = 1; i <= num; i++)
        {
          
            sum+=c;
            a = b;
            b = c;
            c = a + b;
            
            
        }
        System.out.print(sum);
    }
    }
   
