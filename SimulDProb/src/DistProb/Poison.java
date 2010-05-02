
package DistProb;

/**
 * Este codigo implementa la distribucion de probabilidad Poison
 * @author Steve
 */

public class Poison {

    double media; //se declara la media lamda
    double[] observaciones=null;//se declara un arreglo de double

    /**
     * Poison: Este es el constructor de la clase
     * @param media: Es la media del ejercicio que se asigna a un
     * atributo de esta clase.
     */
    public Poison(double media) {
        this.media = media;
    }
/**
 * Poison: Este metodo retorna un entero generado por otro metodo Poison
 * donde se manda la media como parametro.
 *
 */
    public int Poison() {
        //este metodo retorna el resultado del metodo Poison con media como parametro.
        return Poison(this.media);
    }

/*
 * Poison: Este metodo implementa el algoritmo de la distribucion Poison
 * de libro Tecnicas de simulacion del Ing. Carlos Ernesto Garcia.
 * prod obtiene un valor generado de manera pseudo aleatoria
 * si prod es mayor o igual que k  se incrementa el numero de exitos x.
 * return x: Se retorna el numero de exitos hacia una posicion de un arreglo
 * que contiene el numero de exitos por cada observacion.
 */

    public int Poison(double media) {
        
        int x = 0;
        double k = Math.exp(media * -1);
        double prod = Math.random();
        while (prod >= k) {
            x++;

            prod = prod*Math.random();
            
        }
        return x;
    }

    /**
     * getObservaciones: Este metodo retorna el valor generado por
     * otro metodo getObservaciones. Este solo se ejecutara cuando necesitamos que
     * el usuario ingrese el numero de observaciones a realizar.
     * @param nobservaciones: Numero de observaciones a realizar.
     *
     */
    public double[] getObservaciones(int nobservaciones) {
        
        return getObservaciones(nobservaciones, this.media);
    }
/**
 * getObservaciones: Este metodo genera un arreglo de elementos tipo double
 * de tamano igual al numero de observaciones a realizar.
 *
 * @param nObservaciones: Numero de observaciones a realizar.
 * @param media: Media Lambda del ejercicio
 * @return observaciones: Se retorna el arreglo con las observaciones realizadas.
 */
    public double[] getObservaciones(int nObservaciones, double media) {
       
        this.observaciones = new double[nObservaciones];

        for (int i = 0; i < nObservaciones; i++) {
       
       
            this.observaciones[i] = Poison(media);
        }
        return this.observaciones;
    }

    /**
     *getMedia: Este metodo retorna la media del ejercicio.
     *
     */
    public double getMedia() {
        
        return this.media;
    }

    /**
     * getVarianza: Este metodo retorna la varianza del ejercicio.
     *
     */
    public double getVarianza() {
        return this.media;
    }
}
