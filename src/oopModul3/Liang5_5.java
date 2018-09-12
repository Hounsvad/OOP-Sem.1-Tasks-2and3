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
//(Conversion from Cº to Fº) Write a program that displays the following table (note that farenheit = celsius * 9/5 + 32):
public class Liang5_5 {
    public static void Main() {
        System.out.println("Celsius   Fahrenheit | Fahrenheit   Celsius");
        double celsius = 0;
        double fahrenheit = 20;
        double cToF;
        double fToC;
        while (celsius < 100) {
            //Calculating
            cToF = celsius * 1.8 + 32;
            fToC = (fahrenheit-32)/1.8;
            //Printing
            System.out.printf("%-10.2f%10.2f | %-10.2f%10.2f%n", celsius, cToF, fahrenheit, fToC);
            //Incrementing variables
            celsius += 2;
            fahrenheit += 5;
        }
    }
}
