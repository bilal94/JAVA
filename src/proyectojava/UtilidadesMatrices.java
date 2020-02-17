/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava;

import java.util.Arrays;

/**
 *
 * @author Bilal
 */
public class UtilidadesMatrices {
    //Ejercicio 4
    public static int[] suma(int[]a,int[]b){
        int res[]=new int[b.length];
        for (int i = 0; i <b.length; i++) {
            res[i]=a[i]+b[i];
            }
        return res;
        }
    //Ejercicio 5
    public static int[][] arrayBidSuma(int[][]a,int [][]b){
        int res[][]=new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        return res;
    }
    //Ejercicio 6
    public static int[] construyeArray(int n){
        int res[]=new int[n];
        for (int i =0; i < n; i++) {
            res[i]=i+1;
        }
        return res;
    }
    //Ejercicio 7
    public static int[] tablaMultiplicar(int n){
        int res[]=new int[10];
        for (int i = 0; i < 10; i++){
            res[i]=(i+1)*n;
        }
        return res;
    }
    //Ejercicio 8
    public static int maximo(int []n){
        int maximo=n[0];
        for (int i = 0; i < n.length; i++) {
            if(maximo<=n[i]){
                maximo=n[i];
            }
        }
        return maximo;
    }
        /* Añadir un método arrayAleatorio que devolverá un array de n números enteros aleatorios comprendidos 
    entre inf y sup (ambos inclusive) y que no tenga ningún elemento repetido.
    P.ej.: arrayAleatorio(6,1,49) --> {1,7,6,5,49,39*/
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
    public static boolean comprobarPosicion(int []a,int n,int pos){
        for (int i = 0; i < pos; i++) {
            if(a[i]==n){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        int a[]={1,2,3,10};
        int b[]={6,1,49};
        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{4,5,6},{7,8,9},{10,11,12}};
        int e=(int)(Math.random()*5);
        System.out.println("Ejercicio 4 Boletín : "+Arrays.toString(UtilidadesMatrices.suma(a, b)));
        System.out.println("Ejercicio 5 Boletin : "+Arrays.deepToString(UtilidadesMatrices.arrayBidSuma(c, d)));
        System.out.println("Ejercicio 6 Boletín : "+Arrays.toString(UtilidadesMatrices.construyeArray(10)));
        System.out.println("Tabla de multiplicar del "+e+" >>>> "+Arrays.toString(UtilidadesMatrices.tablaMultiplicar(e)));
        System.out.println(UtilidadesMatrices.maximo(b));
        System.out.println(Arrays.toString(UtilidadesMatrices.arrayAleatorio(6,1,49)));
    }
}
