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
import java.util.Scanner;

public class MainInitializor {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        //Declaration of variables
        String[] list = new String[]{
            "Opgave A1",
            "Opgave A2",
            "Opgave A3",
            "Opgave 2.1",
            "Opgave 2.2",
            "Opgave 2.6",
            "Opgave 2.6 Alternative solution",
            "Opgave 2.7",
            "Opgave 2.23"
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
                try {
                    System.out.println("Enter a whole number correlating the assignments or type exit");

                    if (input.hasNextInt()) {
                        userInput = input.nextInt();
                        if (userInput < 1 || userInput > list.length) {
                            System.out.println("Enter a number from the list");
                            throw new IllegalArgumentException("The entered value was out of bounds");
                        }
                    } else if (input.hasNext()) {
                        if (input.next().equalsIgnoreCase("exit")) {
                            userInput = 0;
                        } else {
                            System.out.println("If you wish to quit enter exit");
                            throw new IllegalArgumentException("The entered text was not exit");
                        }
                    }
                    break;
                } catch (Exception e) {
                    //System.out.println(e);
                }

            }
            System.out.println("---------------------------|Start of " + list[userInput - 1] + "|---------------------------");
            switch (userInput) {
                case 1:
                    OPGA1.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 2:
                    OPGA2.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 3:
                    OPGA3.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 4:
                    Liang2_1.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 5:
                    Liang2_2.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 6:
                    Liang2_6.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 7:
                    Liang2_6Alternate.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 8:
                    Liang2_7.Main();
                    System.out.println("---------------------------|End of " + list[userInput - 1] + "|---------------------------");
                    break;
                case 9:
                    Liang2_23.Main();
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
