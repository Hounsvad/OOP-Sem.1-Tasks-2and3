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
public class Liang5_3 {
    public static void Main(){
        System.out.println("Celsius   Fahrenheit");

        double celsius = 0;
        double cToF;
        
        while (celsius < 100) {
            //Calculating
            cToF = celsius * 1.8 + 32;
            //Printing
            System.out.printf("%-10.2f%10.2f%n", celsius, cToF);
            //Incrementing variables
            celsius += 2;
        }
    }
    
}
