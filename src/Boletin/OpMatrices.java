/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin;

import java.util.Arrays;

/**
 *
 * @author Bilal
 */
public class OpMatrices {
    /* Añadir un método arrayAleatorio que devolverá un array de n números enteros aleatorios comprendidos 
    entre inf y sup (ambos inclusive) y que no tenga ningún elemento repetido.
    P.ej.: arrayAleatorio(6,1,49) --> {1,7,6,5,49,39*/
    public static boolean comprobarPosicion(int []a,int n,int pos){
        for (int i = 0; i < pos; i++) {
            if(a[i]==n){
                 return true;
            }
        }
        return false;
    }
    public static int[] arrayAleatorio(int n,int inf,int sup){
        int aux[] =new int[n];
        int a;
        for (int i = 0; i < aux.length; i++) {
            do{
                a=(int)(Math.random()*sup-inf+1)+inf;
        }while(comprobarPosicion(aux,a,i));
            aux[i]=a;
        }
        return aux;
    }
    /*Lo mismo del ejercicio 5, sólo que cada posición contiene la suma de las posiciones anteriores. 
    Por ejemplo si se la pasa como parámetro 5, 
    devolvería el array {1,1,2,4,8}*/
    public static int[] array(int n){
        int arr[]=new int[n];
        arr[0]=1;
        for (int i = 1; i < arr.length; i++){
            int suma=0;
            for (int j = 0; j < i; j++) {
                suma+=arr[j];
            }
            arr[i]=suma;
        }
        return arr;
    }
    
}
