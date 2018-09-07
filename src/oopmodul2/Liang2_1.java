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
//imports
import java.util.Scanner;

public class Liang2_1 { 
    public static void Main() {
        System.out.println("Lian2_1");
        //Declaring variables
        double miles;
        
        //Initializing instances 
        Scanner input = new Scanner(System.in);
        
        //Requesting user input 
        System.out.print("Enter number of miles: ");
        //Filling variables
        miles = input.nextDouble();
        
        //Logging result
        System.out.println(miles + " are equal to " + miles * 1.6 + " kilometer");
        
    }
}
