/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopModul3;

import java.util.Scanner;

/**
 *
 * @author Pinnacle F
 */
//(Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion),
//and displays the number of years and remaining days for the minutes. 
//For simplicity, assume that a year has 365 days.
public class Liang2_7 {

    public static final int secInYear = 31536000;
    public static final int secInDay = 86400;
    public static final int secInHour = 3600;

    public static void Main() {
        //Initialization of class instances
        Scanner input = new Scanner(System.in);

        //Declaration of variables
        int hours;
        int days;
        int years;
        int seconds;
        long userInput = 0;

        //Getting user input
        while (true) {
            System.out.print("Enter a positive whole number of seconds: ");
            if (input.hasNextLong()) {
                userInput = input.nextLong();
                break;
            }
        }

        //Calculating result
        years = (int) (userInput / secInYear);
        days = (int) ((userInput % secInYear) / secInDay);
        hours = (int) (((userInput % secInYear) % secInDay) / secInHour);
        seconds = (int) (((userInput % secInYear) % secInDay) % secInHour);

        //Outputting result
        System.out.println(
                "The input were " + userInput
                + "\nThe number of years is: " + years
                + "\nand " + days
                + " days\nand " + hours
                + " hours\nand " + seconds
                + " seconds.");
    }
}
