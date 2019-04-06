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
    public static void main(String[] args) {
       int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        long fibo [] = new long [n];
        fibo[0]=1;
        fibo[1]=1;
        System.out.print("Fibonacci series");
        for(int i = 2; i < n; i++)
        {
           fibo [i] = fibo[i-1] + fibo [i-2];
        }
        for (int i = fibo.length ; i!= 0; i--) {
            System.out.print(" "+ fibo[i-1]);
        }
    }
    }
