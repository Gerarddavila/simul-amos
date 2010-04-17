/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DistProb;

/**
 *
 * @author Emerson
 */
public class Geometrica {
    
    public double [] getObservaciones(int nObservaciones, double q){
        double [] observaciones= new double[nObservaciones];

        for (int i=0;i<nObservaciones;i++){
        observaciones[i]=Geomet(q);
        }
        
        return observaciones;
    } 
    
    public int Geomet(double q){
        int x=1;
        double r=Math.random();
        while(r>q){
        x++;
        r=Math.random();
        }
        return x;
    }

}
