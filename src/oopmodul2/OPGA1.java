/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodul2;
/**@author frederik  */

public class OPGA1 {

    
    public static void Main() {
        System.out.println("OPGA1");
        //Declaring variables
        double radius;
        double area;
        
        //"Getting input"
        for(int i = 1;i<=5;i++){
        /**
         * This is a for loop
         * It allows for looping a specified number of times
         * The structure of the loop is as follows
         * for(<initialization>;<Condition>;<increment/decrement>){ 
         *     <Looped contents> 
         * }
         * initialization: this is the creation and filling of the variable used for the condition. in the loop above the variable is i
         * condition: the condition needs to evaluate true in order for the code to execute
         *            This is done in the loop above by seeing if the value i is less than or equal to 5 which is the max number of times we want this loop to run
         *            Normally if you want a loop to run a fixed number of times without needing i in the loop you would write for(int i=0;i<[number of times];i++)
         * increment/decrement: This field describes what happens each time the loop reaches the bottom of the code block. i++ would increment i before the loop restarted
         * Looped contents: this is were you put the code looped
         */    
            
            radius = i;
            //Calculating result
            area = Math.pow(radius, 2)*Math.PI;
            /**
             * Alternatively you could use the following
             * area = radius * radius *3.14
             */

            //Logging the result
            System.out.println("The entered radius were " +
                                radius + " The area is "  + area);
            /**
             * This could also be done as follows to have a nice linebreak,
             * while still keeping it to one command
             * System.out.println("The entered radius were " + 
             *                     radius + "\nThe area is "+ area);
             * This will leave a carriage return(new line) at the \n thus resulting
             * in the radius on the first line and the area on the second 
             */
        }
    }
    
}
