/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopModul3;

/**
 *
 * @author frederik
 */
import oopmodul2.*;
import java.util.Scanner;

public class MainInitializor {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void Main() {
        //Declaration of variables
        String[] list = new String[]{
            "Opgave B1",
            "Opgave B4",
            "Opgave B5",
            "Opgave 2.7",
            "Opgave 3.1",
            "Opgave 5.3",
            "Opgave 5.5",
            "Opgave 5.7"
        };

        int userInput = 0;
        boolean loop = true;

        //Initializing classes
        Scanner input = new Scanner(System.in);

        while (loop) {
            clearScreen();
            //Showing the assignemts
            System.out.println("List of completed assignments");
            for (int i = 1; i <= list.length; i++) {
                System.out.println(i + ". " + list[i - 1]);
            }

            //Getting user input
            while (Boolean.TRUE) {
                System.out.println("Enter a whole number correlating the assignments or type exit");

                if (input.hasNextInt()) {
                    userInput = input.nextInt();
                    if (!(userInput < 1 || userInput > list.length)) {
                        break;
                    } else {
                        System.out.println("Enter a number from the list");
                    }
                } else if (input.hasNext()) {
                    if (input.next().equalsIgnoreCase("exit")) {
                        userInput = 0;
                        break;
                    } else {
                        System.out.println("If you wish to quit enter exit");
                    }
                }

            }
            System.out.println("---------------------------|Start of " + list[userInput - 1] + "|---------------------------");
            switch (userInput) {
                case 1:
                    OPGB1.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 2:
                    OPGB4.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 3:
                    OPGB5.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 4:
                    Liang2_7.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 5:
                    Liang3_1.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 6:
                    Liang5_3.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 7:
                    Liang5_5.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 8:
                    Liang5_7.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 0:
                    loop = false;
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}
