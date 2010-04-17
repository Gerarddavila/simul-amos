/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DistProb;
/**
 *
 * @author Juan
 */
public class exponencial {


  double Media;
  double resultados[];
    public exponencial(double Media){
             this.Media = Media;
             resultados = new double[1000];
    }

    public  void Expone(){

     int i;
     for(i = 0; i < 1000; i++ ){
     double r;
     double x;
     r = Math.random();
     x = ((-1)*Media)*Math.log(r);
     resultados[i] = x;
       }//fin del for

    }// fin del metodo


    public void media(){


    }

    public void mostrar(){
        
        for(int i = 0; i <1000; i++){
            System.out.println(resultados[i]);
        }
    }


}
