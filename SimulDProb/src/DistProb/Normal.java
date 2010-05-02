
package DistProb;

/*
 * Este codigo implementa la distribucion de probabilidad Normal.
 * @author Emerson
 *
 */
 
public class Normal {


/**
 * getObservaciones: Este metodo invoca al metodo que implementa el algoritmo
 * de la distribucion normal
 * @param nObservaciones: Es el numero de observaciones a realizar
 * @param Media: Es la media necesaria para la distribucion normal.
 * @param DStd: Es la desviacion estandar del experimento
 * @return observaciones: Se retorna el arreglo con las observaciones hechas.
 */
    public double[] getObservaciones(int nObservaciones, double Media, double DStd) {
      
        double[] observaciones = new double[nObservaciones];


        for (int i = 0; i < nObservaciones; i++) {
           
            observaciones[i] = Normal(Media, DStd);
        }

        return observaciones;
    }

    /**
     * Normal: este metodo implementa el algoritmo de la distribucion normal
     * del libro tecnicas de simulacion del Ing. Carlos Ernesto Garcia.
     * r contiene un valor generado de manera pseudo aleatoria.
     * @param Media: Es la media del ejercicio.
     * @param DStd: Es la distribucion estandar del ejercicio.
     * @return x: Es el numero de exitos que ocurren segun el valor de Suma.
     */
    public double Normal(double Media, double DStd) {
        double Suma = 0;
        for (int i = 1; i <= 12; i++) {
            //r obtiene el valor pseudo aleatorio
            double r = Math.random();
            Suma = Suma + r;//Suma acumula el valor de los valores aleatorios
        }
        //x obtiene el valor del algoritmo del libro del ing Carlos Ernesto Garcia
        double x = DStd * (Suma - 6) + Media;
        return x;//se retorna x
    }
}
