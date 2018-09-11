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
        System.out.println("Celsius      Fahrenheit");
        double celsius;
        double fahrenheit;
        String celsiusString;
        String fahrenheitString;
        String spacer;
        for (int i = 2; i <= 100; i += 2) {
            spacer = "";
            celsius = i;
            fahrenheit = ((celsius * 9) / 5) + 32;
            celsiusString = Double.toString(celsius);
            fahrenheitString = Double.toString(fahrenheit);
            for (int j = 0; j < 23 - (celsiusString.length() + fahrenheitString.length()); j++) {
                spacer += " ";
            }

            System.out.println(celsiusString + spacer + fahrenheitString);
        }
    }
}
