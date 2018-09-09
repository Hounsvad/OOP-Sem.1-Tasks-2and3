/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodul2;

/**
 *
 * @author Pinnacle F
 */
import java.util.Scanner;

public class Liang2_6Alternate {

    public static void Main() {
        //Starting instances
        Scanner input = new Scanner(System.in);

        //Declaring variables
        int sum = 1;
        
            
        while (true) {
            //Getting user input
            System.out.print("Enter a whole number: ");
            if (input.hasNextInt()) {
                char[] userInput = input.next().toCharArray();
                //Calculating output
                for (char cipher : userInput) {
                    sum *= Character.getNumericValue(cipher);
                    //Sum *= (int)chipher - '0'
                }
                //Printing output to console
                System.out.printf("All the digits multilied is %d %n", sum);
                break;
            }
        }
    }
}
