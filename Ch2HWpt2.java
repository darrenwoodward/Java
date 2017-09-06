/*
Author: Darren Woodward
Date: 9/04/2017
Assignment: Ch2 Homework #1
Purpose: Calculate various measurments of a circle and sphere based from user radius input 
 */
//package Ch2Package;

//importing scanner for user input data
import java.util.Scanner;

public class Ch2HWpt2 {

    public static void main(String[] args) {
        
        //Establishing variables for calculations
        double circleRadius;
        double piValue = 3.14159;
        double circleArea; 
        Scanner in = new Scanner(System.in);
        
        //Prompting the user to input radius
        System.out.println("Enter a Radius: ");
        circleRadius = in.nextDouble();
        
        //Calculations for Area, Circumference, Sphere area, and Volume of a sphere 
        System.out.println("Circle Area: " + (piValue * (circleRadius * circleRadius)) + " units" );
        System.out.println("Circle Circumference: " + (2 * piValue * circleRadius));
        System.out.println("Sphere Surface Area: " + (4 * piValue * (circleRadius * circleRadius)) + " units");
        System.out.println("Volume of a Sphere: " + ((4.0 / 3) * piValue * circleRadius * circleRadius * circleRadius) + " units");
        
    }
    
}
