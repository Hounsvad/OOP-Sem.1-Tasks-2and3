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
    public static final int secInHour = 3600;

    public static void Main() {
        //Initialization of class instances
        Scanner input = new Scanner(System.in);

        //Declaration of variables
        int hours = 0;
        int days = 0;
        int years = 0;
        int seconds = 0;
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
                break;
            } catch (Exception e) {
                input.next();
                System.out.println(e);
            }
        }

        //Calculating result
        years = (int) (userInput / secInYear);
        days = (int) ((userInput % secInYear) / secInDay);
        hours = (int) (((userInput % secInYear) % secInDay) / secInHour);
        seconds = (int) (((userInput % secInYear) % secInDay) % secInHour);

        System.out.println(
                "The input were " + userInput
                + "\nThe number of years is: " + years
                + "\nand " + days
                + " days\nand " + hours
                + " hours\nand " + seconds
                + " seconds.");
    }
}
