/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

import java.util.Scanner;

/**
 *Question 02
 * @author Yesenia
 * This program approximates the are of a circle of a given radius using
 * the area of rectangles.
 */
public class Question02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a radius: ");
        double radius = in.nextDouble();
        
        System.out.print("Enter number of rectangles (higher amount for better accuracy) :  ");
        int numberOfRectangles = in.nextInt();
        
        System.out.println("Area of a circle with radius " + radius +
                " is " + circleArea(radius, numberOfRectangles));
    }
    
    /**
     * This method calculates the width of each rectangle and uses that to 
     * calculate the area of each rectangle to finally calculate the area.
     * This method throws two Illegal Argument Exceptions when the radius is 
     * negative and when the rectangles are less than 1.
     * @param radius is the radius of the circle
     * @param numOfRectangles is the number of rectangles 
     * @return the area of the circle
     */
    public static double circleArea(double radius, int numOfRectangles) {
        if (radius < 0) 
            throw new IllegalArgumentException("negative radius!!");
        
        if (numOfRectangles < 1) 
            throw new IllegalArgumentException("wrong number of rectangles!!");
        
        double widthOfRectangle = radius / numOfRectangles;
        double heightOfRectangle;
        double area = 0;
        
        for (double x = 0; x <= radius; x += widthOfRectangle) {
           heightOfRectangle = Math.sqrt((radius * radius) - (x * x));
           area += heightOfRectangle * widthOfRectangle;
        }
     return area * 4;
    }
    
}
