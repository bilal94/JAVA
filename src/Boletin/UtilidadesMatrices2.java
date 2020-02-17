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
public class UtilidadesMatrices2 {
    //Ejercicio 4
    public static int[] suma(int[]a,int[]b){
        if(a.length!=b.length){
            return null;
        }
        int res[]=new int[b.length];
        for (int i = 0; i <b.length; i++) {
            res[i]=a[i]+b[i];
            }
        return res;
        }
    //imprimir un array unidimensional
        public static String arrayToString(int []a){
        if(a==null || a.length==0){return "{}";}
        int i;
        String res="{";
        for ( i = 0; i <a.length; i++) {
            res+=a[i]+",";
        }
        res+=a[i]+"}";
        return res;
    }
    //Ejercicio 5
    public static int[][] arrayBidSuma(int[][]a,int [][]b){
        if(a.length!=b.length || a[0].length!=b[0].length){ //comprobacion si tienen las mismas dimensiones
            return null;
        }
        int res[][]=new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        return res;
    }
    //IMPRIMIR ARRAY BIDIMENSIONAL
     public static String arrayTostring(int [][]a){
         if(a==null || a.length==0){return "{}";}
         if(a.length==1 && a[0].length==0){
             return "{{}}";
         }
         String res="";
         for (int i = 0; i < a.length; i++) {
             res+=arrayToString(a[i]);
             res+="\n";
         }
         return res.replace("{","|").replace("}","|");
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
        for (int i = 0; i <res.length; i++){
            res[i]=(i+1)*n;
        }
        return res;
    }
    //Ejercicio 8
    public static int maximo(int []n){
        int maximo = n[0];
        for (int i = 1; i < n.length; i++) {
            if(maximo<n[i]){
                maximo=n[i];
            }
        }
        return maximo;
    }
   //Ejercicio 9
    public static int minimo(int []n){
       int minimo = n[0];
       for (int i = 1; i < n.length; i++) {
           if(minimo>n[i]){
               minimo=n[i];
           }
        }
        return minimo;
    }
    public static int[] minimoMaximo(int []a){
        int min=a[0];
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }
        return new int[]{min,max};
    }
    //Ejercicio 10
    public static double mediaArray(int[]a){
        double aveg;
        double suma=0;
        for (int i = 0; i < a.length; i++) {
            suma+=a[i];
        }
        aveg=suma/a.length;
        return aveg;
    }
    //Ejercicio 15
    public static int[] arraySuma(int a){
        int res[]=new int [a];
        res[0]=1;
        for (int i = 1; i < res.length; i++) {
            int suma=0;
            for (int j = 0; j < i; j++) {
                suma+=res[j];
            }
            res[i]=suma;
        }
        return res;
    }
    public static int posicionArray(int []a,int n,int pos){
        if(pos<0 || pos>a.length-1){return -1;}
        for (int i = pos; i < a.length; i++) {
            if(a[i]==n){
                return i;
            }
        }
        return -1;
    }
    //Ejercicio 11
    public static int posicionArray(int []a,int n){
        return posicionArray(a,n,0);
    }
    public static int[] arrayRepetido(int[]a,int n){
        int cont=0;
        int pos=0;
        int ind=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n){
                cont++;
            }
        }
        int [] res=new int[cont];
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
    public static int[] eliminaRepetidos(int[]a){
        int res[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if(res[j]==res[i]){
                    i--;
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        int a[]={1,2,5,10,7,8,9,5,10};
        int b[]={4,5,6,7};
        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{4,5,6},{7,8,9},{10,11,12}};
        int e=(int)(Math.random()*5);
        int f[][]=UtilidadesMatrices2.arrayBidSuma(d, c);
        int h[]={-2,-5,8,9};
        /*System.out.println("Ejercicio 4 Boletín : "+Arrays.toString(UtilidadesMatrices2.suma(a, b)));
        System.out.println("Ejercicio 5 Boletin : "+Arrays.deepToString(UtilidadesMatrices2.arrayBidSuma(c, d)));
        System.out.println("Ejercicio 6 Boletín : "+Arrays.toString(UtilidadesMatrices2.construyeArray(10)));
        System.out.println("Tabla de multiplicar del "+e+" >>>> "+Arrays.toString(UtilidadesMatrices2.tablaMultiplicar(e)));
        System.out.println("El máximo es : "+UtilidadesMatrices2.maximo(h));
        System.out.println("El mínimo es : "+UtilidadesMatrices2.minimo(h));
        System.out.println("La media es : "+UtilidadesMatrices2.mediaArray(b));
        System.out.println(Arrays.toString(UtilidadesMatrices2.minimoMaximo(a)));
        System.out.println(Arrays.toString(UtilidadesMatrices2.arraySuma(5)));
        System.out.println(UtilidadesMatrices2.posicionArray(a, 10));
        System.out.println(Arrays.toString(UtilidadesMatrices2.arrayRepetido(a, 5)));*/
        System.out.println(Arrays.toString(UtilidadesMatrices2.eliminaRepetidos(a)));
    }
}
