/*
 * 
 *
 */
package DistProb;

/**
 *Este codigo implementa la distribucion de probabilidad Geometrica.
 * @author Emerson
 */
public class Geometrica {

    /**
     * getObsrvaciones: Este metodo ejecuta el metodo Geomet
     * el cual implementa el algoritmo de la distribucion geometrica
     *
     * @param nObservaciones: Numero de observaciones a realizar
     * @param q: Valor pseudo aleatorio.
     * @return observaciones: se devuelve el arreglo con los resultados.
     */
    public double [] getObservaciones(int nObservaciones, double q){
        
        double [] observaciones= new double[nObservaciones];

        for (int i=0;i<nObservaciones;i++){

        observaciones[i]=Geomet(q);
        }
        
        return observaciones;
    } 

    /**
     * Geomet: Este metodo implementa el algoritmo de la distribucion
     * geometrica del libro tecnicas de simulacion del Ing. Carlos Ernesto Garcia.
     * @param q: Es la probabilidad de fracaso.
     * r es la probabilidad de realizar el experimento.
     * @return x: retorna el numero de intentos que se pudieron realizar incluyendo
     * el intento donde ocurrio el exito.
     */
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
