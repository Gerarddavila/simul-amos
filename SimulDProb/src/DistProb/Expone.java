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


  double Media;
  double resultados[];
  int obs;
    public Expone(double Media,int obs){
             this.Media = Media;
             resultados = new double[obs];
             this.obs = obs;

    }

    public  void Expone(){

     int i;
     for(i = 0; i < obs; i++ ){
     double r;
     double x;
     r = Math.random();
     x = ((-1)*Media)*Math.log(r);
     resultados[i] = x;
       }//fin del for


     Grafica gra = new Grafica("hola",resultados);
gra.setVisible(true);
    }// fin del metodo


    public void media(){

        

    }

    public void mostrar(){
        
        for(int i = 0; i <obs; i++){
            System.out.println(resultados[i]);
        }
    }


}
