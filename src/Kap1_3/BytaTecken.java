/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author clwm01
 */
public class BytaTecken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklaration
        StringBuilder hemligtOrd = new StringBuilder ("????");
         System.out.println(hemligtOrd.toString());
         
         for (int i = 0; i < hemligtOrd.length(); i++) {
             System.out.println("Ange en bokstav");
             char tecken = sc.next().charAt(0);
             hemligtOrd.setCharAt(i,tecken);
             System.out.println(hemligtOrd.toString());
         }
         
         
        
//        System.out.println("Ange första tecknet");
//        char tecken = sc.next().charAt(0);
//        hemligtOrd.setCharAt(0,tecken);
//        System.out.println(hemligtOrd.toString());
//        
//        System.out.println("Ange andra tecknet");
//        tecken = sc.next().charAt(0);
//        hemligtOrd.setCharAt(1,tecken);
//        System.out.println(hemligtOrd.toString());
        
//         System.out.println("Ange tredje tecknet");
//        tecken = sc.next().charAt(0);
//        hemligtOrd.setCharAt(2,tecken);
//        System.out.println(hemligtOrd.toString());
        
//         System.out.println("Ange fjärde tecknet");
//        tecken = sc.next().charAt(0);
//        hemligtOrd.setCharAt(3,tecken);
//        System.out.println(hemligtOrd.toString());
        
//        System.out.println("");
//        System.out.println("DU VANN NOOB");
    }//end class
}//end main
