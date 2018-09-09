/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodul2;

import java.util.Scanner;



/**
 *
 * @author frederik
 */
public class Liang2_2 {
    public static void Main() {
        
        //Declaring variables
        double area;
        double volume;
        double length;
        
        //Initialising instances
        Scanner input = new Scanner(System.in);
        
        //Requesting input
        System.out.print("Enter length of the sides and height og the quilateral\ntriangle: ");
        
        //Collecting input
        length = input.nextDouble();
        
        //Calculating output
        area = (Math.sqrt(3.0)*Math.pow(length,2))/4;
        volume = area * length;
        
        System.out.println("The area is: "+ area + "\nThe volume of the triangular prism is: "+ volume);
    }
}
