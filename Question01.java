/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.Scanner;

/**
 * Question 01
 * @author Yesenia
 * This program finds and prints pairs of positive integers (i, j) 
 * that fit the form i < j < n and(i^2+j^2+ 1)/(ij) is an integer
 */
public class Question01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        allpairs(n);
    }
    
/**
 * This method calculates ordered pairs that satisfy the equation
 * This method throws an Illegal Argument Exception when n is less than 1
 * @param n is the integer 
 */
    public static void allpairs(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("wrong number");
        }
        for (int j = 1; j < n; j++) {
            for (int i = 1; i < j; i++) {
                //checks whether the given equation is divided evenly
                if (((Math.pow(j, 2) + Math.pow(i, 2) + 1) % (i * j)) == 0) {
                    System.out.printf("\n (%d,%d)", i, j);
                }
            }
        }
    }
}
