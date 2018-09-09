package oopmodul2;

/**
 * @author frederik
 */
import java.util.Scanner;

public class Liang2_6 {

    public static void Main() {

        //Initializing class instances
        Scanner input = new Scanner(System.in);

        //Declaring variabels
        short userInput = 0;
        short[] userInputArr = new short[4];
        short result = -1;

        //Ask for user input
        while (true) {
            //Try catch statement for error handeling
            try {
                //Ask user for input
                System.out.print("Enter a whole number between 0 and 1000 inclusivly: ");
                //Check for validity of userinput
                if (input.hasNextShort() == true) {
                    //Save user input in case of valid input
                    userInput = input.nextShort();
                } else {
                    //Throw exception in case of invalid input
                    throw new IllegalArgumentException("Input has to be a numbber between 0 and 1000");
                }

                //Uncomment for debug
                //System.out.println(userInput);
                //If the user input is out of bound throw exception
                if (userInput > 1000 || userInput < 0) {
                    throw new IllegalArgumentException("Input has to be a numbber between 0 and 1000");
                }
                //End the input request loop
                break;

            } catch (IllegalArgumentException e) {
                //In the event of illegal input
                System.out.println(e);
                input.next();
            } catch (Exception e) {
                //In the event of and unexpected error
                System.out.println("Error");
                input.next();
            }
        }

        //Use userinput
        userInputArr[0] = (short) (userInput / 1000);                       // gets the first digit
        userInputArr[1] = (short) ((userInput % 1000) / 100);               // gets the second digit
        userInputArr[2] = (short) (((userInput % 1000) % 100) / 10);        // gets the third digit
        userInputArr[3] = (short) ((((userInput % 1000) % 100) % 10) / 1);  // gets the fourth and last digit

        if (userInputArr[0] == 0) {               // if the number is less than 1000 the proceed else multiply all numbers
            if (userInputArr[1] == 0) {            // if the number is less than 100 then proceed else multiply all remaining numbers
                if (userInputArr[2] == 0) {       // if the number is less than 10 then proceed else multiply all remaining numbers
                    if (userInputArr[3] == 0) {    // if the number is less than 1 the the result is 0 else the result is the remaining number
                        result = 0;
                    } else {
                        result = userInputArr[3];
                    }
                } else {
                    result = (short) (userInputArr[2] * userInputArr[3]);
                }

            } else {
                result = (short) (userInputArr[1] * userInputArr[2] * userInputArr[3]);
            }
        } else {
            result = (short) (userInputArr[0] * userInputArr[1] * userInputArr[2] * userInputArr[3]);
        }

        //printing user input
        System.out.println("The user input were " + userInput
                + "\nThe numbers were " + userInputArr[0]
                + " " + userInputArr[1]
                + " " + userInputArr[2]
                + " " + userInputArr[3]
                + "\nThe result is " + result);
    }
}
