package Boletin;


import static Boletin.UtilidadesMatrices2.posicionArray;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bilal
 */
public class UtilidadesMatrices {
    public static int posicionArray(int[] a, int n, int pos)  {
        if(pos<0 || pos>a.length-1){return -1;}
        for (int i = pos; i < a.length; i++) {
            if(a[i]==n){
                return i;
            }
        }
            return -1;
    }
    public static int posicionArray(int[] a, int n)  {	
            return posicionArray(a, n, 0);
    }
    public static int[] posicionesArray(int[] a, int n) {
        int cont=0;
        int pos=0;
        int ind=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n){
                cont++;
            }
        }
        int []res=new int[cont];
        for (pos=0;pos<a.length && pos!=-1;) {
            pos=posicionArray(a,n,pos);
            if(pos>=0){
                res[ind]=pos;
                ind++;
                pos++;
            }
        }
        return res;
    }
    public static String arrayToString(int[] a) {
            String res="{"; int i;
            for(i=0;i<a.length-1;i++) {
                    res+=a[i]+", ";
            }
            if (i<a.length) {
                    res+=a[i];
            }
            res+="}";
            return res;
    }
    public static void main(String[] args) {
        int[] pruebas={2,3,5,3,3,6,5,7,5}; // {2,6,8}
        int [] posiciones=UtilidadesMatrices.posicionesArray(pruebas, 5);
        System.out.println(UtilidadesMatrices.arrayToString(posiciones));
    }
}
