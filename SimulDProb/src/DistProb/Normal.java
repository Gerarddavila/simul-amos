/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DistProb;

/**
 *
 * @author Emerson
 */
public class Normal {

    public double[] getObservaciones(int nObservaciones, double Media, double DStd) {
        double[] observaciones = new double[nObservaciones];

        for (int i = 0; i < nObservaciones; i++) {
            observaciones[i] = Normal(Media, DStd);
        }

        return observaciones;
    }

    public double Normal(double Media, double DStd) {
        double Suma = 0;
        for (int i = 1; i <= 12; i++) {
            double r = Math.random();
            Suma = Suma + r;
        }
        double x = DStd * (Suma - 6) + Media;
        return x;
    }
}
