/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopModul3;

import java.util.Scanner;

/**
 *
 * @author Pinnacle F
 */
public class OPGB1 {

    //Skriv et program, der udregner og udskriver arealet (π*r^2) af 5 forskellige cirkler med radius 1, 2, 3, 4 og 5.
    public static void Main() {
        System.out.println("OPGA1");
        //Declaring variables
        double radius;
        double area;

        //"Getting input"
        for (int i = 1; i <= 5; i++) {
            radius = i;
            //Calculating result
            area = Math.pow(radius, 2) * Math.PI;

            //Logging the result
            System.out.printf("The entered radius were %.2f The resulting area is %.2f%n",radius, area);
        }
    }
}
