/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopModul3;

/**
 *
 * @author Pinnacle F
 */
//Skriv et program, der givet en måneds nummer udskriver antallet af dage i denne måned.
import java.util.Scanner;

public class OPGB4 {

    public static void Main() {
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        int userInput;
        while (true) {
            System.out.println("Enter a value correlating to a month");
            if (input.hasNextInt()) {
                userInput = input.nextInt();
                if (!(userInput < 1 || userInput > 12)) {
                    System.out.printf("The number of days in the requested month is %d%n", month[userInput - 1]);
                    break;
                }
            }
        }
    }

}
