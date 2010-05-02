/*
 * Este codigo implementa la distribucion de probabilidad Normal.
 *
 */
package DistProb;

/**
 *
 * @author Emerson
 */
public class Normal {

    public double[] getObservaciones(int nObservaciones, double Media, double DStd) {
         //Se crea un arreglo double del tamano del numero de observaciones
        //realizadas por el usuario.
        double[] observaciones = new double[nObservaciones];

        //segun el numero de observaciones decididas por el usuario
        //asi se invoca el metodo Normal el cual devuelve el valor x
        //para ser guardado en el arreglo de observaciones

        for (int i = 0; i < nObservaciones; i++) {
            //Al metodo Normal se envia por parametro la media.
            observaciones[i] = Normal(Media, DStd);
        }

        return observaciones;//se retorna el arreglo de observaciones
    }

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
