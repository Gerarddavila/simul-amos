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

    public int[] getObservaciones(int observaciones) {
        return getObservaciones(observaciones, this.media);
    }

    public int[] getObservaciones(int observaciones, double media) {
        int[] ret = new int[observaciones];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = Poison(media);
        }
        System.out.println("");
        return ret;
    }

    public double getMedia() {
        return this.media;
    }

    public double getVarianza() {
        return this.media;
    }
}
