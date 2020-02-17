
package proyectojava;

import java.util.Arrays;

public class Vector {
    private static int[]a=new int[3];
    private static int[]b=new int[3];
    private static int[]numVectores;

    public Vector(int a[],int b[]) {
        a=a;
        b=b;
    }
    
    public static int [] suma(int a[],int b[]){
        int res[] = new int [a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                res[j]=i+j;
            }
        }
        return res;
    }
    
    public static void main(String args[]){
        int matriz[]={1,2,3};
        int matriz1[]={4,5,6};
        System.out.println(Arrays.toString(Vector.suma(matriz, matriz1)));
    }
    

}
