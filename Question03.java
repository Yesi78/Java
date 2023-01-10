/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

import java.util.Scanner;

/**
 *Question 03
 * @author Yesenia
 * This program allows someone to enter a non negative integer and separates
 * the integer into its digits in order to display them separated. 
 */
public class Question03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        System.out.println(separate(number));
    }
    
    /**
     * This method separates the integer given into a string of its digits separated by tabs
     * This method throws an Illegal Argument Exception when the integer is negative
     * @param n is the integer entered
     * @return the string of individual digits separated by tabs each
     */
    public static String separate(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Wrong number!!");
        int x = n;
        String m = "";
        int digits = 0;
        while (x > 0) {
            digits++;
            x /= 10;
        }
        
        for(int i = digits; i >= 1; i--) {
            int values = n % (int) Math.pow(10, i);
            
            values /= Math.pow(10, i - 1);
            
            m += values + "     ";
            
        }
        return m;
    }
}
