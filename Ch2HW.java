/*
Author: Darren Woodward
Date: 9/04/2017
Assignment: Ch2 Homework #1
Purpose: Calculate various measurments of fuel efficientcy based from user input data  
 */
//package Ch2Package;

//import util for user input data
import java.util.*;

public class Ch2HW {

    public static void main(String[] args) {
        //Declaring variables that the user data will be placed into 
        double fuelCapacity;
        double fuelRemaining;
        double fuelEffic;
        double costPerGallon;
        Scanner in = new Scanner(System.in);
        
        //Form header 
        System.out.println("Enter the following information:");
        System.out.println("--------------------------------");
        
        //Prompting the user to input data for fuel
        System.out.println("Capacity of Gas Tank: ");
        fuelCapacity = in.nextDouble();
        System.out.println("Gas Remaining: ");
        fuelRemaining = in.nextDouble();
        System.out.println("Vehicle Fuel Efficiency (mpg): ");
        fuelEffic = in.nextDouble();
        System.out.println("Cost of Gas Per Gallon): ");
        costPerGallon = in.nextDouble();
        
        //Calculations based from user input data
        System.out.println("--------------------------------");
        
        //Gas used
        System.out.println("Gas used (Gallons): " + (fuelCapacity - fuelRemaining)+ " gal.");
        //Cost of Gas Used
        System.out.println("Cost of Gas Used: $"+ ((fuelCapacity - fuelRemaining)*costPerGallon));
        //Cost of gas per 100 miles
        System.out.println("Cost of gas per 100 miles: $" + ((100 / fuelEffic)*costPerGallon));
        //Driving distance on remaining fuel
        System.out.println("Driving Distance on remaing fuel: " + (fuelRemaining * fuelEffic) + " miles");
        
        System.out.println("=================================");
        
    }
    
}
