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
// Skriv et program, der udregner alle primtal under 1.000.000, og udskriver det største.
public class OPGB5 {

    public static void Main() {
        boolean found = false;
        int lastPrime = 0;
//        long time = System.nanoTime();
        for (int i = 3; i < 1000000; i += 2 ) {
            found = false;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                lastPrime = i;
            }
        }
        System.out.println(lastPrime);
        //System.out.println(((double) (System.nanoTime() - time)) / 1000000000 + " Seconds");
        
    }

}
