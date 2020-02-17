
package proyectojava;

import java.util.Arrays;

public class MatrizBid {

    /*2.- Implementar una clase matrizBid que represente una matriz bidimensional 
    y que implemente las operaciones de suma, resta y producto*/
    
    private static int[][]n1;
    private static int[][]n2;

    public MatrizBid(int[][] n1, int[][] n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public static int[][] suma(int a[][],int b[][]){
        int res[][]=new int[3][3];
        for(int fila=0;fila<a.length;fila++){
            for(int columna=0;columna<b.length;columna++){
                res[fila][columna]=a[fila][columna] + b[fila][columna];
            }
        }
        return res;
    }
     public static int[][] resta(int a[][],int b[][]){
        int res[][]=new int[3][3];
        for(int fila=0;fila<a.length;fila++){
            for(int columna=0;columna<b.length;columna++){
                res[fila][columna]=a[fila][columna] - b[fila][columna];
            }
        }
        return res;
    } 
     
    public static int[][] producto(int a[][],int b[][]){
        int res[][]=new int[a.length][b.length];
        for(int fila=0;fila<a.length;fila++){
            for(int columna=0;columna<b.length;columna++){
                res[fila][columna]=a[fila][columna] * b[fila][columna];
            }
        }
        return res;
    } 
    
    public static void main(String args[]){
        int [][] a= {{10,20,30},{40,50,60},{70,80,90}};
        int [][] b= {{1,2,3},{4,5,6},{7,8,9}};
        int matResul [][]=new int [3][3];
        //imprimir suma-
        System.out.println("Suma de un ARRAY BIDIMESIONAL : "+Arrays.deepToString(MatrizBid.suma(a, b)));
        //imprimir resta
        System.out.println("Resta de un ARRAY BIDIMENSIONAL : "+Arrays.deepToString(MatrizBid.resta(a, b)));
        //imprimir multiplicacion
        System.out.println("Producto de un ARRAY BIDIMENSIONAL : "+Arrays.deepToString(MatrizBid.producto(a, b)));
        System.out.println(" ");
    }
}