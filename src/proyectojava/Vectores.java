/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava;

/**
 *
 * @author Bilal
 */
public class Vectores {
    public static void main(String args[]){
        int [] x={1,2,4},y={3,4,5};
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;i++){
                System.out.println("La suma de los vectores es : "+x[i+j]+y[i+j]);
            }
        }
        
    }
}
