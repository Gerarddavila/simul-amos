/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DistProb;

/**
 *
 * @author Steve
 */
public class Poison {

    public static int Poison(double media){
     int x=0;
     double k = Math.exp(media*-1);
     double prod = Math.random();
     while(prod>=k){
         x++;
         prod = Math.random();
     }
     return x;
    }
    
}
