/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 * This program does a linear search of an array using generics.
 * @author Yesenia Morales
 */
public class Linear_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] a1 = {10, 5, 56, 67, 4, 59, 13};
        System.out.println(search(a1, 67)); // prints 3
        System.out.println(search(a1, 10000)); // prints -1
        Circle[] a2 = {new Circle(20), new Circle(3), new Circle(15),new Circle(45)};
        System.out.println(search(a2, new Circle(3))); // prints 1
        System.out.println(search(a2, new Circle(5))); // print -1
    }
    
    /**
     * This method does a search of the elements of the array and compares them
     * to the key element to be found.
     * @param <T> a generic of any type 
     * @param list an array of type T
     * @param key of type T
     * @return an integer related to the index or -1 if it was not found
     */
    public static <T extends Comparable<? super T>> int search(T[] list, T key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0)
                return i;
        }
        return -1;
    }
}
