/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 * 
 * @author Yesenia Morales
 */
public class Circle implements Comparable<Circle>{
    int r;
    
    /**
     * This is the constructor
     * @param r 
     */
    public Circle(int r) {
        this.r = r;
    }
    
    /**
     * 
     * @return a string
     */
    @Override
    public String toString() {
        return "Circle{" + "r=" + r + "}";
    }
    
    /**
     * This is the compareTo method
     * @param o a circle 
     * @return an integer of the comparison
     */
    @Override
    public int compareTo(Circle o) {
       return this.r - o.r;
    }
}
