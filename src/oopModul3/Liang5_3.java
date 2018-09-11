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
public class Liang5_3 {

    public static void Main() {
        System.out.println("Celsius      Fahrenheit | Fahrenheit      Celsius");
        double celsius1;
        double fahrenheit1;
        String celsiusString1;
        String fahrenheitString1;
        String spacer1;
        double celsius2;
        double fahrenheit2 = 20;
        String celsiusString2;
        String fahrenheitString2;
        String spacer2;

        for (int i = 0; i <= 100; i += 2) {
            spacer1 = "";
            celsius1 = i;
            fahrenheit1 = ((celsius1 * 9) / 5) + 32;
            celsiusString1 = Double.toString(celsius1);
            fahrenheitString1 = Double.toString(fahrenheit1);
            for (int j = 0; j < 23 - (celsiusString1.length() + fahrenheitString1.length()); j++) {
                spacer1 += " ";
            }

            spacer2 = "";
            celsius2 = (9 / 5 + 32) / fahrenheit2;
            celsiusString2 = String.format("%.2f", celsius2);
            fahrenheitString2 = Double.toString(fahrenheit2);
            for (int j = 0; j < 23 - (celsiusString2.length() + fahrenheitString2.length()); j++) {
                spacer2 += " ";
            }
            fahrenheit2 += 5;

            System.out.println(celsiusString1 + spacer1 + fahrenheitString1 + " | " + fahrenheitString2 + spacer2 + celsiusString2);
        }
    }
}
