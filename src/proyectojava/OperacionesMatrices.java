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
public class OperacionesMatrices {
      private static int mat1[][]=new int[3][3];
        private static int mat2[][]=new int[3][3];
        private static int matR[][]=new int[3][3];
    public static int[][] suma(int a[][], int b [][]){
         for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                matR[i][j]=mat1[i][j] + mat2[i][j];
            }
        }
         return matR;
    }
    public static void main(String args[]){
      
        
       /* for (int i = 0; i <mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j]=(int)(Math.random()*5);
            }
        }
        
        for (int i = 0; i <mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                mat2[i][j]=(int)(Math.random()*5);
            }
        }*/
  
        
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                System.out.println(Arrays.deepToString(OperacionesMatrices.suma(mat1, mat1)));
            }
        }
    }
   
}
