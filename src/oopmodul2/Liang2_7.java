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
//Importing packages
import java.util.Scanner;

public class Liang2_7 {

    public static final int secInYear = 31536000;
    public static final int secInDay = 86400;

    public static void Main() {
        //Initialization of class instances
        Scanner input = new Scanner(System.in);

        //Declaration of variables
        int hours = 0;
        int days = 0;
        int years = 0;
        int seconds = 0;

        int hoursRemainder = 0;
        int daysRemainder = 0;

        long userInput = 0;

        //Getting user input
        boolean loop = true;
        while (loop) {
            try {
                System.out.print("Enter a positive whole number of seconds: ");
                if (input.hasNextLong()) {
                    userInput = input.nextLong();
                } else {
                    throw new IllegalArgumentException("Input not a valid integer");
                }
            } catch (Exception e) {
                input.next();
                System.out.println(e);
            }
            loop = false;
        }

        //Calculating result
        years = (int) (userInput / 31536000);
        days = (int) ((userInput % 31536000) / 86400);
        hours = (int) (((userInput % 31536000) % 86400) / 3600);
        seconds = (int) (((userInput % 31536000) % 86400) % 3600);

        System.out.print(
                "The input were " + userInput
                + "\nThe number of years is: " + years
                + "\nand " + days
                + " days\nand " + hours
                + " hours\nand " + seconds
                + " seconds.");
    }
}
