/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 * This program reverses a given integer by using a recursive method.
 * @author Yesenia Morales
 */
public class Int_reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 = 123456;
        System.out.println("Original: " + number1);
        System.out.print("Reversed: ");
        System.out.println(reverse(number1));
        System.out.println("");
        int number2 = 9014 ;
        System.out.println("Original: " + number2);
        System.out.print("Reversed: ");
        System.out.println(reverse(number2));
        System.out.println("");
        int number3 = 4321;
        System.out.println("Original: " + number3);
        System.out.print("Reversed: ");
        System.out.println(reverse(number3));
        System.out.println("");
       
    }

   /**
    * This method takes an integer and reverses the number by recursively checking.
    * This method throws an Illegal Argument Exception when the integer being 
    * passed is not positive.
    * @param num an integer
    * @return an integer representing the reversed original integer
    */
    public static int reverse(int num) {
        if (num < 0)
            throw new IllegalArgumentException("Wrong Number");
        if (num < 10) {
            return num;
        } else {
            System.out.print(num % 10);
            return reverse(num / 10);
        }
    }
}
