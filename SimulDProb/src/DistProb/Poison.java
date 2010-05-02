/*
 * Este codigo implementa la distribucion de probabilidad Poison
 *
 */
package DistProb;

/**
 *
 * @author Steve
 */
public class Poison {

    double media; //se declara la media lamda
    double[] observaciones=null;//se declara un arreglo de double

    public Poison(double media) {
        this.media = media;//se recibe la media por parametro
        //se le asigna a la variable media de esta clase.
    }

    public int Poison() {
        //este metodo retorna el resultado del metodo Poison con media como parametro.
        return Poison(this.media);
    }

    public int Poison(double media) {
        //este metodo implementa el algoritmo del libro Tecnicas de simulacion
        //del Ing. Carlos Ernesto Garcia.
        int x = 0;
        double k = Math.exp(media * -1);
        double prod = Math.random();
        while (prod >= k) {
            x++;//si el valor pseudo aleatorio es mayor o igual que k
            //x que es el numero de exitos  se incrementa.
            prod = prod*Math.random();
            //prod es igual a el mismo
        }
        return x;//se regresa el numero de exitos a una posicion del arreglo
    }

    public double[] getObservaciones(int nobservaciones) {
        //retorna el valor generado por el metodo getObservaciones
        return getObservaciones(nobservaciones, this.media);
    }

    public double[] getObservaciones(int nObservaciones, double media) {
        //se crea un arreglo de tamano igual al numero de observaciones a realizar.
        this.observaciones = new double[nObservaciones];

        for (int i = 0; i < nObservaciones; i++) {
            //el valor de la posicion del arreglo es igual a lo que devuelva
            //el metodo llamado Poison
            this.observaciones[i] = Poison(media);
        }
        return this.observaciones;//se retorna el arreglo con las observaciones realizadas.
    }

    public double getMedia() {
        //este metodo devuelve la media lamda
        return this.media;
    }

    
    public double getVarianza() {
        return this.media;
    }
}
