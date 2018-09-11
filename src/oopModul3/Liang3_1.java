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
//
public class Liang3_1 {

    public static void Main() {
        //Declaring variable
        double firstRoot;
        double secondRoot;
        double discriminant;
        double[] userInput = new double[3];
        String[] userInputRequest = new String[]{"Enter a value for a ", "Enter a value for b ", "Enter a value for c "};

        //initializing instances
        Scanner input = new Scanner(System.in);

        //Getting user input
        for (int i = 0; i < userInput.length; i++) {
            while (true) {
                System.out.println(userInputRequest[i]);
                if (input.hasNextDouble() || input.hasNextInt()) {
                    userInput[i] = input.nextDouble();
                    break;
                } else {
                    input.next();
                }
            }
        }

        //Calculating discriminant
        discriminant = Math.pow(userInput[1], 2) - (4 * userInput[0] * userInput[2]);
        //Calculating roots
        if (discriminant > 0) {
            firstRoot = (0 - userInput[1] + Math.sqrt(Math.pow(userInput[1], 2) - (4 * userInput[0] * userInput[2]))) / (2 * userInput[0]);
            secondRoot = (0 - userInput[1] - Math.sqrt(Math.pow(userInput[1], 2) - (4 * userInput[0] * userInput[2]))) / (2 * userInput[0]);
            //printing result
            System.out.println("The first root is " + firstRoot + "\nThe second root is " + secondRoot);
        } else if (discriminant == 0) {
            firstRoot = (0 - userInput[1] + Math.sqrt(Math.pow(userInput[1], 2) - (4 * userInput[0] * userInput[2]))) / (2 * userInput[0]);
            secondRoot = (0 - userInput[1] - Math.sqrt(Math.pow(userInput[1], 2) - (4 * userInput[0] * userInput[2]))) / (2 * userInput[0]);
            System.out.println("The only root is " + firstRoot);
        } else {
            System.out.println("There are no roots");
        }

        //Enable for debug
//        System.out.println(userInput[0]);
//        System.out.println(userInput[1]);
//        System.out.println(userInput[2]);
//          System.out.println(discriminant);
    }
}
