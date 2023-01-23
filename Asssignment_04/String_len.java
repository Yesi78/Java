/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 * This method finds the length of a given string by passing it to a recursive 
 * method.
 * @author Yesenia Morales
 */
public class String_len {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "CSC 230";
        System.out.println(str1);
        System.out.println("Length: " + lengthOfStr(str1));
        System.out.println("");
        String str2 = "";
        System.out.println(str2);
        System.out.println("Length: " + lengthOfStr(str2));
        System.out.println("");
        String str3 = "Travel around the world.";
        System.out.println(str3);
        System.out.println("Length: " + lengthOfStr(str3));
        System.out.println("");
        String str4 = "Watch Netflix all day";
        System.out.println(str4);
        System.out.println("Length: " + lengthOfStr(str4));
        System.out.println("");
    }
    
    /**
     * This method finds the length of the string by recursively 
     * @param a a String
     * @return an integer value representing the length
     */
    public static int lengthOfStr(String a){
        if (a.equals(""))
            return 0;
        return lengthOfStr(a.substring(1)) + 1;
    }
    
}
