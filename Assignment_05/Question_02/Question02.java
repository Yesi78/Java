/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

import java.util.Arrays;

/**
 * This program does a binary search of an array using generics.
 * @author Yesenia Morales
 */
public class Question02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] a1 = {10, 5, 56, 67, 4, 59, 13};
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println(bsearch(a1, 67)); // prints 6
        System.out.println(bsearch(a1, 4)); // prints 0
        System.out.println(bsearch(a1, 10000)); // prints -1
        Circle[] a2 = {new Circle(20) {}, new Circle(3) {}, new Circle(15) {},new Circle(45) {}};
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
        System.out.println(bsearch(a2, new Circle(3) {})); // prints 0
        System.out.println(bsearch(a2, new Circle(45) {})); // print 3
        System.out.println(bsearch(a2, new Circle(10000) {})); // print -1
        
    }
    
    /**
     * This method searches an array of type T, any type, by doing a binary search
     * and using Comparable of a wild card. This either returns the index where
     * it was found or it returns -1 if not found.
     * @param <T> A generic of any type
     * @param list an array of type T
     * @param key a type T
     * @return an integer representing an index or -1
     */
     public static <T extends Comparable<? super T>> int bsearch(T[] list, T key) {
         int first = 0;
         int last = list.length - 1;
         int middle = last / 2;
        while (first <= last) {
            if (list[middle].compareTo(key)< 0) {
                first = middle + 1;
            } else if (list[middle].compareTo(key) == 0) {
                return middle;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return -1;
    }
}
