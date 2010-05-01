package DistProb;

import java.util.Arrays;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class DistProbUtil {
    static long  semilla;
    static Random r = new Random();

    public static void establecerSemilla(long sem){
        semilla=sem;
        r.setSeed(semilla);
    }

    public static double random(){
        return ((int)(r.nextDouble()*1000))/1000.0;
    }

    public static double redondea(double numero, int cifras){
        double mult = Math.pow(10, cifras);
        return ((int)(numero*mult))/mult;
    }

    public static double[][] obtenerTablaFrecuencia(double[] observaciones) {
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

    public static double[][] obtenerProbabilidad(double[][] frecuencia, int nObservaciones) {
        double[][] ret = new double[10][2];
        for (int i = 0; i < 10; i++) {
            ret[i][0] = redondea((frecuencia[i][1] - frecuencia[i][0]) / 2 + frecuencia[i][0],3);
            ret[i][1] = redondea(frecuencia[i][2] / nObservaciones,3);

        }
        return ret;
    }

    public static double[][] obtenerAcumulada(double[][] probabilidad) {
        double[][] ret = new double[10][2];
        double acum = 0.0;
        for (int i = 0; i < 10; i++) {
            acum = acum + probabilidad[i][1];
            ret[i][0] = redondea(probabilidad[i][0],3);
            ret[i][1] = redondea(acum, 3);
        }
        return ret;
    }

    public static DefaultTableModel arrayToModel(double[][] datos, String[] cols) {
        Object[][] odatos = new Object[datos.length][datos[0].length];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                odatos[i][j] = datos[i][j];
            }
        }
        DefaultTableModel dtm = new DefaultTableModel(odatos,cols);
        return dtm;
    }

    public static DefaultTableModel arrayToModel(double[] datos, String[] cols) {
        Object[][] odatos = new Object[datos.length][2];
        for (int i = 0; i < datos.length; i++) {
            odatos[i][0] = i+1;
            odatos[i][1] = datos[i];
        }
        DefaultTableModel dtm = new DefaultTableModel(odatos, cols);
        return dtm;
    }
}
