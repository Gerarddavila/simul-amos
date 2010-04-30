/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DistProb;

import java.util.Arrays;

/**
 *
 * @author Steve
 */
public class DistribucionProbabilidadUtil {

    public double[][] obtenerTablaFrecuencia(double[] observaciones) {
        double[][] ret = new double[10][3];
        Arrays.sort(observaciones);
        double min = observaciones[0];
        double max = observaciones[observaciones.length - 1];
        double tam = (max - min) / 10;
        for (int i = 0; i < 10; i++) {
            if (i > 0) {
                ret[i][0] = min + (tam * i) + 0.01;
            } else {
                ret[i][0] = min + (tam * i);
            }
            ret[i][1] = min + (tam * (i + 1));
            ret[i][2] = 0.0;
        }
        for (int i = 0; i < observaciones.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (observaciones[i] >= ret[j][0] && observaciones[i] <= ret[j][1]) {
                    ret[j][2] = ret[j][2] + 1;
                    break;
                }
            }

        }
        return ret;
    }

    public double[][] obtenerProbabilidad(double[][] frecuencia, int nObservaciones) {
        double[][] ret = new double[10][2];
        for (int i = 0; i < 10; i++) {
            ret[i][0] = (frecuencia[i][1] - frecuencia[i][0]) / 2 + frecuencia[i][0];
            ret[i][1] = frecuencia[i][2] / nObservaciones;

        }
        return ret;
    }

    public double[][] obtenerAcumulada(double[][] probabilidad) {
        double[][] ret = new double[10][2];
        double acum = 0.0;
        for (int i = 0; i < 10; i++) {
            acum = acum + probabilidad[i][1];
            ret[i][0] = probabilidad[i][0];
            ret[i][1] = acum;
        }
        return ret;
    }
}
