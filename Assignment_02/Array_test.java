/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

import java.util.Scanner;

import java.util.Random;

/**
 * This program asks for the size of a 2D integer array, m rows and n columns
 * and populates it with random numbers from 0 to mn-1. Then it checks if is
 * consecutive in any of the following patterns: horizontal, vertical, and two 
 * diagonal directions. It also gives test cases to show each pattern and the
 * programs effectiveness.
 * @author Yesenia Morales
 */
public class Array_test {

    /**
     * @param args the command line arguments
     * This method throws an Illegal Argument Exception when at least one of 
     * the two integers is less than 4
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter two numbers greater than or equal to 4: ");
        int m = in.nextInt();
        int n = in.nextInt();
        int mn = m * n;
        if (mn < 16)
            throw new IllegalArgumentException("Wrong array size!!");
        int j;
        int[][] arr = new int[m][n];
        for (int[] arr1 : arr) {
            for (j = 0; j < arr1.length; j++) {
                int ra = rand.nextInt(mn);
                arr1[j] = ra;
                System.out.printf(arr1[j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Horizontally consecutive: " + horizontal(arr));
        System.out.println("Vertically consecutive: " + vertical(arr));
        System.out.println("Diagonally consecutive left to right: " + diagonalLeftToRight(arr));
        System.out.println("Diagonally consecutive right to left: " + diagonalRightToLeft(arr));
        System.out.println(" ");
        System.out.println("Test Cases: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        testCases();
    }

    /**
     * This method creates test cases to check the following methods correctness
     */
    public static void testCases() {
        int[][] arr1 = {{2, 5, 3, 5, 6, 3, 2}, {2, 7, 2, 6, 4, 0, 7}, {9, 3, 9, 8, 7, 6, 10}};
        displayArray(arr1);
        System.out.println("Horizontally consecutive: " + horizontal(arr1));
        System.out.println(" ");
        

        int[][] arr2 = {{2, 4, 5, 9, 3}, {2, 2, 4, 6, 5}, {3, 7, 5, 2, 3}, {4, 6, 7, 2, 1}, {5, 3, 4, 2, 9}};
        displayArray(arr2);
        System.out.println("Vertically consecutive: " + vertical(arr2));
        System.out.println(" ");
        

        int[][] arr3 = {{1, 5, 6, 7, 8, 3}, {3, 2, 4, 4, 3, 1},
            {7, 6, 3, 3, 3, 6}, {3, 1, 5, 6, 2, 2}, {4, 6, 8, 6, 3, 5}};
        displayArray(arr3);
        System.out.println("Diagonally consecutive left to right: " + diagonalLeftToRight(arr3));
        System.out.println(" ");
        
        int[][] arr4 = {{6,6,7,6,4},{1,5,5,4,1},{6,4,4,2,7},{3,8,3,2,3}, {5,4,6,7,2}};
        displayArray(arr4);
        System.out.println("Diagonally consecutive right to left: " + diagonalRightToLeft(arr4));
        System.out.println(" ");

    }
    
    /**
     * This method displays a given 2D array
     * @param a is a 2D integer array
     */
    public static void displayArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    /**
     * This method checks whether a 2D array is horizontally consecutive
     * @param a a 2D integer array
     * @return The Boolean value if the array is horizontally consecutive
     */
    public static boolean horizontal(int[][] a) {
        //loop to check if consecutively increasing
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = 0; j < a[i].length - 1; j++) {
                if (a[i][j] == a[i][j + 1] - 1) {
                    count++;
                }
            }
        }
        
        //loop to check if consecutively decreasing
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = 0; j < a[i].length - 1; j++) {
                if (a[i][j] == a[i][j + 1] + 1) {
                    count++;
                }
            }

        }
        return count >= 3;
    }
    
    /**
     * This method checks whether the given 2D array is vertically consecutive
     * @param a a 2D integer array
     * @return The Boolean value if the array is vertically consecutive
     */
    public static boolean vertical(int[][] a) {
        int count = 0;
        
        //loop to check if consecutively increasing
        for (int col = 0; col < a[0].length; col++) {
            count = 0;
            for (int row = 0; row < a.length - 1; row++) {
                if (a[row][col] == a[row + 1][col] - 1) {
                    count++;
                }

            }
            return count >= 3;
        }
        //loop to check if consecutively decreasing
        for (int col = 0; col < a[0].length; col++) {
            count = 0;
            for (int row = 0; row < a.length - 1; row++) {
                if (a[row][col] == a[row + 1][col] + 1) {
                    count++;
                }

            }
        }
        return count >= 3;
    }
    
    /**
     * This method checks whether the given 2D array is diagonally consecutive
     * from left to right.
     * @param a is a 2D integer array
     * @return The Boolean value if the array is diagonally consecutive
     */
    public static boolean diagonalLeftToRight(int[][] a) {
        int k;
        int rowCount = 0;
        int count;
        
        //loop to check if consecutively increasing 
        for (int row = 0; rowCount <= a.length * 2; row++) {    
            rowCount++;
            if (rowCount > a.length)
                row = 0;
            count = 0;
            k = row;
            for (int col = 0; col < a[0].length && k < a.length; col++) {
                if (rowCount > a.length) {
                    col = k + (rowCount - a.length);
                }
                while (k < a.length - 1 && col < a[0].length -1) {
                    if (a[k][col] == a[k + 1][col + 1] + 1) {
                        count++;
                        if (count >= 3) {
                            return true;
                        }                    
                    }
                    k++;
                    col++;
                }
            }
        }
           //loop to check if consecutively decreasing
           for (int row = 0; rowCount <= a.length * 2; row++) {    
            rowCount++;
            if (rowCount > a.length)
                row = 0;
            count = 0;
            k = row;
            for (int col = 0; col < a[0].length && k < a.length; col++) {
                if (rowCount > a.length) {
                    col = k + (rowCount - a.length);
                }
                while (k < a.length - 1 && col < a[0].length -1) {
                    if (a[k][col] == a[k + 1][col + 1] + 1) {
                        count++;
                        if (count >= 3) {
                            return true;
                        }                  
                    }
                    k++;
                    col++;
                }
        }
    }
           return false;
    }
    
    /**
     * This method checks whether the given array is diagonally consecutive from 
     * right to left 
     * @param a is a 2D integer array
     * @return the Boolean value if the array is diagonally consecutive
     */
    public static boolean diagonalRightToLeft(int[][] a) {
        int k;
        int rowCount = 0;
        int count;
        //loop to check if consecutively increasing
        for (int row = 0; rowCount <= a.length * 2; row++) {    
            rowCount++;
            if (rowCount > a.length)
                row = 0;
            count = 0;
            k = row;
            for (int col = a[0].length - 1; col >= 0 && k < a.length; col--) {
                if (rowCount > a.length) {
                    col = (a.length - 1) - (rowCount % a.length);
                }
                while (k < a.length - 1 && col > 0) {
                    if (a[k][col] == a[k + 1][col - 1] - 1) {
                        count++;
                        if (count >= 3) {
                            return true;
                        }                    
                    }
                    k++;
                    col--;
                }
            }
        }
        
        rowCount = 0;
        count = 0;
        //loop to check if consecutively decreasing
        for (int row = 0; rowCount <= a.length * 2; row++) {    
            rowCount++;
            if (rowCount > a.length)
                row = 0;
            count = 0;
            k = row;
            for (int col = a[0].length - 1; col >= 0 && k < a.length; col--) {
                if (rowCount > a.length) {
                    col = (a.length - 1) - (rowCount % a.length);
                }
                while (k < a.length - 1 && col > 0) {
                    if (a[k][col] == a[k + 1][col - 1] + 1) {
                        count++;
                        if (count >= 3) {
                            return true;
                        }                    
                    }
                    k++;
                    col--;
                }
            }
        }
        return false;
    }
}
    
