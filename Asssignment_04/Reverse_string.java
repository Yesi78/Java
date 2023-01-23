/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

/**
 * This program reverses a string  by calling a reverse method and within that 
 * calls a private helper method that uses recursion to reverse the string.
 * @author Yesenia Morales
 */
public class Reverse_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println("Original String: " + str1);
        System.out.println("Reversed String: " + reverse1(str1));
        System.out.println("");
        String str2 = "Airplanes in the night sky like shooting stars.";
        System.out.println("Original String: " + str2);
        System.out.println("Reversed String: " + reverse1(str2));
        System.out.println("");
        String str3 = "Ichiraku Ramen";
        System.out.println("Original String: " + str3);
        System.out.println("Reversed String: " + reverse1(str3));
        System.out.println("");
    }
    
    /**
     * This is a public method that drives the reversal of a string by passing 
     * a StringBuffer to a private method.
     * @param str a String
     * @return a reversed String
     */
    public static String reverse1(String str) {
        StringBuffer sb = new StringBuffer(str);
        String revstr = reverse2(sb);
        return revstr;
    }
    
    /**
     * This is a private method that helps the string be reversed by using 
     * a recursive routine.
     * @param sb a StringBuffer
     * @return a String that has been reversed 
     */
    private static String reverse2(StringBuffer sb) {
        if (sb.length() == 1) {
            return sb.toString();
        }
        return reverse2(new StringBuffer(sb.substring(1))) + sb.charAt(0);
    }
    
}
