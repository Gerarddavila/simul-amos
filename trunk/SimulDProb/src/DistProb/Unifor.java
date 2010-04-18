/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DistProb;

/**
 *
 * @author Steve
 */
public class Unifor {

    double a;
    double b;
    double observaciones[] = null;

    public Unifor(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double Unifor() {
        return Unifor(this.a, this.b);
    }

    public double Unifor(double a, double b) {
        double r = Math.random();
        double x = a + (b - a) * r;
        return x;
    }

    public double[] getObservaciones(int nObservaciones) {
        return getObservaciones(nObservaciones, this.a, this.b);
    }

    double[] getObservaciones(int nObservaciones, double a, double b) {
        this.observaciones = new double[nObservaciones];
        for (int i = 0; i < nObservaciones; i++) {
            this.observaciones[i] = Unifor(a, b);
        }
        return this.observaciones;
    }

    public double getMedia(){
        return (b-a)/2.0;
    }
    public double getVarianza(){
        return Math.pow(b-a,2)/12.0;
    }
}
