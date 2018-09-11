/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopModulBase;

import java.util.Scanner;

/**
 *
 * @author Pinnacle F
 */
public class MainInitializor {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        //Declaration of variables
        String[] list = new String[]{
            "Modul 2",
            "Modul 3"
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
                    if (userInput < 1 || userInput > list.length) {
                        System.out.println("Enter a number from the list");
                    }
                } else if (input.hasNext()) {
                    if (input.next().equalsIgnoreCase("exit")) {
                        userInput = 0;
                    } else {
                        System.out.println("If you wish to quit enter exit");
                    }
                }
                break;

            }
            switch (userInput) {
                case 1:
                    oopmodul2.MainInitializor.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 2:
                    oopModul3.MainInitializor.Main();
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
