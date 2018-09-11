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
/*
(
Financial application: compute future tuition) Suppose that the tuition for a
university is $10,000 this year and increases 6% every year. In one year,
the tuition will be $10,600. Write a program that computes the tuition
in ten years and the total 
cost of four years’ worth of tuition after the tenth year.
 */
public class Liang5_7 {

    public static void Main() {
        double priceAfter = compoundInterest(10000, 1.06, 10);
        double priceAfterSum = 0;

        for (int i = 11; i <= 14; i++) {
            priceAfterSum += compoundInterest(10000, 1.06, i);
        }

        System.out.printf("The tuition starting at $10,000 wil be %.2f after 10 years%n", priceAfter);
        System.out.printf("The sum of the price over 4 years after 10 years is %.2f%n", priceAfterSum);

    }

    public static double compoundInterest(double _base, double _interest, double _termin) {
        //Return the sum of compound interests after a certain year count
        return (_base * Math.pow(_interest, _termin));
    }
}
//    public static void Main() {
//        double priceAfter = 10000 * (1.06^10);
//        double priceAfterSum = 0;
//
//        for (int i = 11; i <= 14; i++) {
//            priceAfterSum += 10000 * (1.06^i);
//        }
//
//        System.out.printf("The tuition starting at $10,000 wil be %.2f after 10 years%n", priceAfter);
//        System.out.printf("The sum of the price over 4 years after 10 years is %.2f%n", priceAfterSum);
//
//    }