/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 * This program takes a given array and sorts it. Then displays the sorted
 * integer array.
 * @author Yesenia Morsles
 */
public class sort_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        System.out.println("Test Cases:");
        System.out.println("");
        testCases();
        
    }
    
    /**
     * This method passes the given arrays as test cases to be sorted and displayed
     */
    public static void testCases() {
        int[] arr1 = {1, 7, 4, 0};
        int [] arr2 = {2, 4, 6, 3, 8, 10};
        int[] arr3 = {5, 2, 6, 7, 8, 9};
        int[] arr4 = {0,1,4,6,2,3,7,10};
        int[] arr5 = {10,14,16,9,2,0,12};
        int[] arr6 = {89,77,65,44,101,90,56};
        int[] arr7 = {-1,0,-5,7,9,-10,11,4,6};
        
        System.out.print("Original: ");
        displayArray(arr1);
        System.out.print("Sorted: ");
        displayArray(sort(arr1));
        System.out.println("");
        System.out.print("Original: ");
        displayArray(arr2);
        System.out.print("Sorted: ");
        displayArray(sort(arr2));
        System.out.println("");
        System.out.print("Original: ");
        displayArray(arr3);
        System.out.print("Sorted: ");
        displayArray(sort(arr3));
        System.out.println("");
        System.out.print("Original: ");
        displayArray(arr4);
        System.out.print("Sorted: ");
        displayArray(sort(arr4));
        System.out.println("");
        System.out.print("Original: ");
        displayArray(arr5);
        System.out.print("Sorted: ");
        displayArray(sort(arr5));
        System.out.println("");
        System.out.print("Original: ");
        displayArray(arr6);
        System.out.print("Sorted: ");
        displayArray(sort(arr6));
        System.out.println("");
        System.out.print("Original: ");
        displayArray(arr7);
        System.out.print("Sorted: ");
        displayArray(sort(arr7));
        System.out.println("");
    }

    /**
     * This method sorts the array through 
     * @param a the integer array
     * @return the sorted array
     */
    public static int[] sort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
        return a;
    }
/**
 * This method is used to display an array
 * @param a is an integer array 
 */
    public static void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
