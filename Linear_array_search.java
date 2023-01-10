/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

import java.util.Arrays;


/**
 * This program does a linear search of a given value in an array recursively.
 * @author Yesenia Morales
 */
public class Linear_array_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60,70,80};
        System.out.println(Arrays.toString(arr1));
        System.out.println("The value is at position: " + search(arr1, 0, 30));
        System.out.println("");
        int[] arr2 = {1,20,13,34,5,19,89};
        System.out.println(Arrays.toString(arr2));
        System.out.println("The value is at position: " + search(arr2, 0, 0));
        System.out.println("");
        int[] arr3 = {1,0,4,-3,12,0};
        System.out.println(Arrays.toString(arr3));
        System.out.println("The value is at position: " + search(arr3, 0, -3));
        System.out.println("");
        int[] arr4 = {24,32,76,-1,-4,6};
        System.out.println(Arrays.toString(arr4));
        System.out.println("The value is at position: " + search(arr4, 0, 6));
        System.out.println("");
        
    }
    
    /**
     * This method does a linear search of a value in an integer array recursively
     * and returns its position or returns -1 if it is not found.
     * @param a an integer array
     * @param index an integer of the current index
     * @param v an integer of the value that is being searched for
     * @return an integer of the position in the array
     */
    public static int search(int[] a, int index, int v) {
        if (index >= a.length) {
            System.out.println("Value could not be found.");
            return -1;
        }
        if(a[index] == v)
            return index + 1;
        else
            return search(a, index + 1, v);
    }
}
