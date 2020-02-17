/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin;

import static Boletin.UtilidadesMatrices2.posicionArray;
import java.util.Arrays;

/**
 *
 * @author Bilal
 */
public class Array {
    /* Añadir un método eliminaRepetidos que reciba una matriz de enteros y
    devuelva una matriz con los elementos repetidos elminados.
    P.ej.: eliminaRepetidos(new int[]{4,3,2,1,4,2,1,5,7,5}) devolvería: {4,3,2,1,5,7}*/
    public static int [] eliminaRepetidos(int[]a){
        int b[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if(b[j]==b[i]){
                    b[j]--;
                }
            }
        }
        return b;
    }
    public static void main(String args[]){
        int a[]={4,3,2,4,3,2};
        System.out.println(Arrays.toString(Array.eliminaRepetidos(a)));
    }
}
