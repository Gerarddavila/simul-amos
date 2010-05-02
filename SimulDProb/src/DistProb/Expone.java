/*
 * Este codigo implementa la distribucion de probabilidad Exponencial.
 * 
 */
package DistProb;

/**
 *
 * @author Oscar
 */
public class Expone {

    private double media;
    double observaciones[];
    int obs;

    /**
     * Este es el constructor de la clase
     *
     * @param Media: Es el valor de la media lambda necesaria para
     * la distribucion.
     */
    public Expone(double Media) {
        
        this.media = Media;

    }

    /**
     * Metodo Expone que implementa el algoritmo de la distribucion exponencial
     * del  Ing. Carlos Ernesto Garcia.
     * r es una variable que se genera de manera psudo aleatoria.
     * @return x: se retorna el numero de exitos segun el valor de r.
     */
    public double Expone() {
       
        double r;
        double x;
        r = Math.random();
        x = (-1) * media * Math.log(r); 
        return x;
    }// fin del metodo Expone

    /**
     * getObservaciones: Este metodo retorna el arreglo devuelto por otro metodo
     * llamado getObservaciones donde mandamos el numero de observaciones y la media del ejercicio.
     * @param nobservaciones: Es el numero de observaciones a realizarse. es entero
     * @return getObservaciones(nobservaciones, this.media) : Se retorna un arreglo double.
     */
     public double[] getObservaciones(int nobservaciones) {
         //se retorna el vector con las observaciones
         //obtenidas del otro metodo getObservaciones
        return getObservaciones(nobservaciones, this.media);
    }

     /**
      * getObservaciones: Este metodo ejecuta el metodo Expone un numero de veces
      * igual al numero de observaciones a realizar el cual devuelve un valor
      * x igual al numero de exitos.
      * @param nObservaciones: Es el numero de observaciones a realizar.
      * @param media: Es la media Lambda del ejercicio.
      * @return observaciones: Se retorna el arreglo que contiene todos los exitos de
      * todas las observaciones realizadas.
      */
     public double[] getObservaciones(int nObservaciones, double media) {
        this.observaciones = new double[nObservaciones];
        for (int i = 0; i < nObservaciones; i++) {
           
            this.observaciones[i] = Expone();
        }
        return this.observaciones;
    }

     /**
      * media: Este metodo devuelve la media del ejercicio.
      */
    public double media() {
        return this.media;
    }

    
}
