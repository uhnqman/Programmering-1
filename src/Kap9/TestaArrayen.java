/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap9;

import java.util.Arrays;

/**
 *
 * @author clwm01
 */
public class TestaArrayen {
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3}; 
        int[] b = {1, 442, 3};
        
        boolean koll = Arrays.equals(a, b);
        
        if (koll == true) {
            System.out.println("Lika");
        } else {
            System.out.println("Olika");
        }
    }//end main
}//end class
