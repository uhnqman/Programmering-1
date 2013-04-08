/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

/**
 *
 * @author clwm01
 */
public class Namn {
    public static void main(String[] args) {
        //deklaration
        String namn = "UHNQMAN";
        
        for (int i =0; i < namn.length(); i++) {
            System.out.print("" +namn.charAt(i));
        }
        System.out.println("");
        
        for (int i = namn.length()-1; i >= 0; i--) {
            System.out.print("" +namn.charAt(i));
        }
        System.out.println("");
    }//end class
}//end main
