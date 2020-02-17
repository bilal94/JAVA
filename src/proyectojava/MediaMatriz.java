/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class MediaMatriz {
    private static  int[]d;
    public static int [] inverso(int []d){
        d=d;
        Scanner entrada=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número entero");
            d[i]=entrada.nextInt();
        }
        for (int i = 4; i >=0; i++) {
            System.out.println(d[i]);
        }
        return d;
    }
    public  static  void main(String args[]){
        double []a=new double[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*2);
        }
        System.out.println(Arrays.toString(a));
        //double []a={1,2,3,4,5};
        double suma=0;
        for (int i = 0; i < a.length; i++) {
            suma=suma+a[i];
        }
        System.out.println("La suma de la longitud de la matriz es : "+suma);
        
        double media = suma/a.length;
        System.out.println("La media de "+suma+ " es : "+media);
        System.out.println("-----------------------------");
        int[] d1 = MediaMatriz.d;
        MediaMatriz.inverso(d);
    }
}
