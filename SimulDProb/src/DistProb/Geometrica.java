/*
 * Este codigo implementa la distribucion de probabilidad Geometrica.
 *
 */
package DistProb;

/**
 *
 * @author Emerson
 */
public class Geometrica {
    
    public double [] getObservaciones(int nObservaciones, double q){
        //Se crea un arreglo double del tamano del numero de observaciones
        //realizadas por el usuario.
        double [] observaciones= new double[nObservaciones];

        for (int i=0;i<nObservaciones;i++){

        observaciones[i]=Geomet(q);//El arreglo recibe el valor x del metodo Geomet.
        }
        
        return observaciones;
    } 
    
    public int Geomet(double q){
        //Se ejecuta el algoritmo de la distribucion
            //geometrica del Ing.Carlos Ernesto Garcia.
            //Este se ejecuta un numero de veces igual al numero de observaciones.
        int x=1;//el algoritmo empieza con x=1, osea la primera observacion realizada
        double r=Math.random(); //r obtiene un valor pseudo aleatorio.
        while(r>q){ //mientras r>q
        x++;//se sigue realizando mas obseraciones y se cuentan.
        r=Math.random();//una vez mas r obitene un valor pseudo aleatorio.
        }
        return x;//se retorna x.
    }

}
