/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DistProb;

import interfaces.Grafica;

/**
 *
 * @author Juan
 */
public class Expone {

    double media;
    double observaciones[];
    int obs;

    public Expone(double Media) {
        this.media = Media;

    }

    public double Expone() {
        double r;
        double x;
        r = Math.random();
        x = (-1) * media * Math.log(r);
        return x;
    }// fin del metodo

     public double[] getObservaciones(int nobservaciones) {
        return getObservaciones(nobservaciones, this.media);
    }

     public double[] getObservaciones(int nObservaciones, double media) {
        this.observaciones = new double[nObservaciones];
        for (int i = 0; i < nObservaciones; i++) {
            this.observaciones[i] = Expone();
        }
        return this.observaciones;
    }

    public void media() {
    }

    public void mostrar() {

        for (int i = 0; i < obs; i++) {
            System.out.println(observaciones[i]);
        }
    }
}
