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
public class OPGA3 {

    public static void Main() {
        System.out.println("OPGA3");
        // Declaring and initializing array med vejr data
        double[] dTemp = new double[]{21.5d, 23.7d, 19.6d, 22.5d, 25.3d, 21.7d, 18.9d};
        // Logging day to day differences
        for (int i = 0; i < dTemp.length - 1; i++) {
            System.out.println(((double)(((int) (dTemp[i + 1] * 10) - (int) (dTemp[i] * 10))))/10);
        }
        //Get high as a kite and convert doubles to int befour using math by multiplying by 10 then turn back to double and devide by 10
    }

}
