/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopModul3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Pinnacle F
 */
//
public class Liang3_1 {

    public static void Main() {
        //Declaring variable
        double firstRoot = 0;
        double secondRoot = 0;
        double discriminant = 0;
        double[] userInput = new double[3];
        String[] userInputRequest = new String[]{"Enter a value for a ","Enter a value for b ","Enter a value for c "};
        
        //initializing instances
        Scanner input = new Scanner(System.in);

        //Getting user input
        for (int i = 0; i < userInput.length - 1; i++) {
            while (true) {
                System.out.println(userInputRequest[i]);
                if (input.hasNextDouble()||input.hasNextInt()) {
                    userInput[i] = input.nextDouble();
                } else {
                    input.next();
                }
            }
        }

        //Calculating discriminant
        //Calculating roots
        //Outputting result
        
        //Enable for debug
        System.out.println(userInput[0]);
        System.out.println(userInput[1]);
        System.out.println(userInput[2]);
    }
}
