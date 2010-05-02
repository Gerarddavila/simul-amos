package DistProb;

import java.util.Arrays;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase contiene utilidades para la implementacion
 * de las distribuciones de probabilidad.
 * @author Steve
 */
public class DistProbUtil {
    static long  semilla;
    static Random r = new Random();
/**
 * Este metodo establece la semilla para la generacion
 * de numero pseudo aleatorios.
 * @param sem: Es la semilla utilizada para generar el numero Pseudo Aleatorio.
 */
    public static void establecerSemilla(long sem){
        semilla=sem;
        r.setSeed(semilla);
    }

    /**
     *Este metodo genera un numero Pseudo Aleatorio y lo retorna
     *
     */
    public static double random(){
        return ((int)(r.nextDouble()*1000))/1000.0;
    }

    /**
     * redondea: Este metodo redondea un numero segun
     * el numero de cifras necesarias para el experimento.
     */
    public static double redondea(double numero, int cifras){
        double mult = Math.pow(10, cifras);
        return ((int)(numero*mult))/mult;
    }

    /**
     * obtenerTablaFrecuencia: Este metodo genera las tablas de frecuencia
     * segun el numero de observaciones realizadas.
     * Devuelve la matriz con cada observacion y su respectiva frecuencia.
     *
     */
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

    /**
     *
     * obtenerProbabilidad: Este metodo obtiene la probabilidad
     * por intervalos de 10
     *
     */
    public static double[][] obtenerProbabilidad(double[][] frecuencia, int nObservaciones) {
        double[][] ret = new double[10][2];
        for (int i = 0; i < 10; i++) {
            ret[i][0] = redondea((frecuencia[i][1] - frecuencia[i][0]) / 2 + frecuencia[i][0],3);
            ret[i][1] = redondea(frecuencia[i][2] / nObservaciones,3);

        }
        return ret;
    }

    /**
     *
     * obtenerAcumulada: Este metodo devuelve la tabla de distribucion acumulada.
     *
     */
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

    /**
     * arrayToModel: Este metodo toma los datos de los resultados obtenidos
     * y los ingresa a un modelo de tabla para mostrarlos.
     * @param datos: Es el vector que contiene los resultados. Forman las filas
     * @param cols: Es un vector que representa las columnas donde va el nombre
     * de los encabezados de la tabla.
     * 
     */
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
