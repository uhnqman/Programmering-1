/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap9;

/**
 *
 * @author clwm01
 */
public class Sortera {
    public static void main(String[] args) {
        int n = 100;
    int [] a = new int [n];
    
    System.out.print ("Dessa tal slumpas till arayen");
    for (int i = 0 ; i < n; i++) {
        if(i%10==0) System.out.println();
        a[i] = (int)( 1000 * Math.random() );
        System.out.print(a[i]+"\t");
    }
    int s;
        for (int i = 0; i < n-1; i++) {
            for (int j = i +1; j < n; j++) {
                if (a[i] > a [j]) {
                    s = a[i]; a[i] = a[j]; a[j]=s; 
                    
                }//end if  
            }//end for inner
        }//end for outer
        
            System.out.println();
            System.out.print("Efter sortering:");
                for(int i = 0 ; i < n ; i++) {
                    if(i%10==0) System.out.println();
                        System.out.print(a[i]+"\t");
            }//end for
        }//end main
    }//end class
    
    

 