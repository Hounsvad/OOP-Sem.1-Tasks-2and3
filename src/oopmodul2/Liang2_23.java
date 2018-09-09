/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodul2;

/**
 *
 * @author frederik
 */
/**
 * Task (Cost of driving) Write a program that prompts the user to enter the
 * distance to drive, the fuel efficiency of the car in miles per gallon, and
 * the trice per gallon then display the cost of the trip
 *
 */
//importing
import java.util.Scanner;

public class Liang2_23 {

    public static void Main() {
        // initialize instances
        Scanner input = new Scanner(System.in);

        //Declaring variables
        double mpg = 0;
        double miles = 0;
        double ppg = 0;

        //Getting user input
        //Getting driving disctance
        while (Boolean.TRUE) {
            System.out.print("Enter the driving distance: ");
            try {
                if(input.hasNextDouble()){
                    miles = input.nextDouble();
                }else{
                    throw new Exception("");
                }
                break;
            } catch (Exception e) {
            }
        }
        //Getting miles per gallon
        while (Boolean.TRUE) {
            System.out.print("Enter the miles per gallon: ");
            try {
                if(input.hasNextDouble()){
                    mpg = input.nextDouble();
                }else{
                    throw new Exception("");
                }
                break;
            } catch (Exception e) {
            }
        }
        //Getting price per gallon
        while (Boolean.TRUE) {
            System.out.print("Enter the price per gallon: ");
            try {
                if(input.hasNextDouble()){
                    ppg = input.nextDouble();
                }else{
                    throw new Exception("");
                }
                break;
            } catch (Exception e) {
            }
        }
        
        System.out.println("The trip will take " + (miles / mpg) + " gallons and will cost " +  ((miles / mpg)*ppg));

    }
}
