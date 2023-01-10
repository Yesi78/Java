/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.Scanner;

/**
 * This program allows the user to enter as many integers as they want and quit
 * by entering 0. Then it takes those numbers and stores them into an array that
 * then displayed.
 * @author Yesenia Morales
 */
public class Question01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getInts();
    }
    
    /**
     * This method is used to display the individual elements in the array
     * @param a is an integer array
     */
    public static void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    
    /**
     * This method allows the user to enter an unlimited amount of numbers and
     * quits when zero is entered. it also stores those numbers in an integer 
     * array and adjusts the size as needed.
     * @return an integer array
     */
    public static int[] getInts() {
        System.out.println("Enter as many numbers as you want and enter 0 to quit: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[1];
        int count = 0;
        int count2 = 0;
        while (num != 0) {
            count++; 
            if (count > arr.length)
                arr = resize(arr, arr.length * 2);
            for (int i = 0; i < arr.length; i++){
                if (count2 > count + 1)
                    arr[count - 1]= num;
                else
                    arr[arr.length - 1] = num;
                count2++;
            }
            num = in.nextInt();
        }
        System.out.println("Your array of numbers: ");
        displayArray(arr);
        return arr;
    }
    
    /**
     * This method copies the elements from the original array to the newly 
     * sized array
     * @param array is an integer array
     * @param newSize is the increased length of the array
     * @return an integer array
     */
    public static int[] resize(int[] array, int newSize) {
        int[] array2 = new int [newSize];
        for (int i = 0; i < array.length; i++)
            array2[i] = array[i];
        return array2;
    }
    
}
