/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DistProb;

/**
 *
 * @author Steve
 */
public class Poison {

    double media;
    double[] observaciones=null;

    public Poison(double media) {
        this.media = media;
    }

    public int Poison() {
        return Poison(this.media);
    }

    public int Poison(double media) {
        int x = 0;
        double k = Math.exp(media * -1);
        double prod = Math.random();
        while (prod >= k) {
            x++;
            prod = Math.random();
        }
        return x;
    }

    public double[] getObservaciones(int nobservaciones) {
        return getObservaciones(nobservaciones, this.media);
    }

    public double[] getObservaciones(int nObservaciones, double media) {
        this.observaciones = new double[nObservaciones];
        for (int i = 0; i < nObservaciones; i++) {
            this.observaciones[i] = Poison(media);
        }
        return this.observaciones;
    }

    public double getMedia() {
        return this.media;
    }

    public double getVarianza() {
        return this.media;
    }
}
