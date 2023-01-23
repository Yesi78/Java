/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author Yesenia Morales
 */
    public class Circle implements Comparable<Circle>{
    int r;
    
    /**
     * This is the constructor
     * @param r an integer
     */
    public Circle(int r) {
        this.r = r;
    }
    
    /**
     * This is the toString method 
     * @return a String
     */
    @Override
    public String toString() {
        return "Circle{" + "r=" + r + "}";
    }
    
    /**
     * This is the compareTo method
     * @param o a Circle 
     * @return an integer result of the comparison
     */
    @Override
    public int compareTo(Circle o) {
       return this.r - o.r;
    }
}
