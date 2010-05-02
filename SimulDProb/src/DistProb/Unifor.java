/*
 * Este codigo implementa la distribucion de probabilidad Uniforme
 *
 */
package DistProb;

/**
 *
 * @author Steve
 */
public class Unifor {

    double a;
    double b;
    double observaciones[] = null;//Arreglo que guardara las observaciones realizadas.
/**
 * Uniform: Es el constructor de la clase. Este recibe 2 parametros de tipo double
 * estos se asignan a 2 atributos de esta clase
 * @param a: Es el limite inferior valido en la distribucion
 * @param b: Es el limite inferior valido en la distribucion
 */
    public Unifor(double a, double b) {
        this.a = a; 
        this.b = b;
    }
/**
 * Uniform: Este metodo retorna el valor de otro metodo tambien llamado Uniform
 *
 */
    public double Unifor() {
     
        return Unifor(this.a, this.b);
    }

    /**
     * Uniform: Este metodo implementa el algortimo del libro
     * Tecnicas de simulacion del Ing Carlos Ernesto Garcia
     *
     * @param a: Es el limite inferior.
     * @param b  Es el limite superior.
     * @return x: Se retorna el x correspondiente a la probabilidad.
     */

    public double Unifor(double a, double b) {
        //
        double r = Math.random();
        double x = a + (b - a) * r;
        return x;
    }

    /**
     * getObservaciones: Este metodo recibe como parametro el numero de observaciones
     * para luego invocar otro metodo getObservaciones pasando como parametro las observaciones
     * y los limites inferior y superior.
     * @param nObservaciones: es el numero de observaciones a realizar con el algoritmo.
     * @return : se retorna lo que devuelva el otro metodo getObservaciones.
     */
    public double[] getObservaciones(int nObservaciones) {
        return getObservaciones(nObservaciones, this.a, this.b);
    }

    /**
     * getObservaciones: Este metodo recibe como parametro el numero de observaciones
     * y los limites inferior y superior.
     * @param nObservaciones: Es el numero de observaciones a realizar
     * @param a: Es el limite inferior
     * @param b: Es el limite superior
     * @return: Se retorna el arreglo que contiene el numero de observaciones realizadas.
     */
    double[] getObservaciones(int nObservaciones, double a, double b) {
        this.observaciones = new double[nObservaciones];
        for (int i = 0; i < nObservaciones; i++) {
            this.observaciones[i] = Unifor(a, b);
        }
        return this.observaciones;
    }
/**
 * getMedia: Este metodo devuelve la media de la distribucion
 * utilizando la formula de la media de la distribucion uniforme
 *
 */
    public double getMedia(){
        return (b-a)/2.0;
    }
    /**
     * getVarianza: Este metodo devuelve la varianza utilizando
     * la formula para calcular la varianza de la distribucion Uniforme.
     * 
     */
    public double getVarianza(){
        return Math.pow(b-a,2)/12.0;
    }
}
