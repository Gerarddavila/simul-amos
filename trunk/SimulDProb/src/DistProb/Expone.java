/*
 * Este codigo implementa la distribucion de probabilidad Exponencial.
 * 
 */
package DistProb;

import interfaces.Grafica;

/**
 *
 * @author Oscar
 */
public class Expone {

    private double media;//Se declara un double para la media.
    double observaciones[];//se declara un vector double para guardar las observaciones.
    int obs;//Una variable entera que captura el numero de observaciones decididas por el usuario.

    public Expone(double Media) {
        //Constructor que tiene como parametro la media lamda.
        this.media = Media;//Se asigna la media del parametro al atributo de la clase.

    }

    public double Expone() {
       //Metodo Expone que implementa el algoritmo de la distribucion exponencial
        //del  Ing. Carlos Ernesto Garcia.
        double r;//r es una variable aleatoria que simula ser la probabilidad de exito.
        double x;//x representa el evento que ocurre en la prueba.
        r = Math.random();// r captura un dato aleatorio.
        x = (-1) * media * Math.log(r); //Se asigna el valor de x segun r
        return x;//se retorna x
    }// fin del metodo

     public double[] getObservaciones(int nobservaciones) {
         //se retorna el vector con las observaciones
         //obtenidas del otro metodo getObservaciones
        return getObservaciones(nobservaciones, this.media);
    }

     public double[] getObservaciones(int nObservaciones, double media) {
        this.observaciones = new double[nObservaciones];
        for (int i = 0; i < nObservaciones; i++) {
            //Se le asigna todas las x de todas las observaciones al vector
            //el tamano del arreglo depende del numero de observaciones
            //que el usuario decidio realizar.
            this.observaciones[i] = Expone();
        }
        return this.observaciones;//Se retorna el arreglo con las observaciones.
    }

    public void media() {
    }

    public void mostrar() {

        for (int i = 0; i < obs; i++) {
            System.out.println(observaciones[i]);
        }
    }
}
