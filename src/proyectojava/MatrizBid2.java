
package javaapplication1;


public class MatrizBid2 {
    private double [][]a;
    private static int numTotalMatrices=0;
    //constructor para inicalizar el numero de filas y el numero de columnas
    public MatrizBid2(int f,int c) {
        this.a= new double [f][c];
        MatrizBid2.numTotalMatrices++;
    }
    //constructor de copia para llamar al constructor de arriba
    public  MatrizBid2(MatrizBid2 b){
        this(b.numFilas(),b.numCols());
        //recorremos las filas y columnas
        for (int i = 0; i < b.numFilas(); i++) {
            for (int j = 0; j < b.numCols(); j++) {
                this.a[i][j]=b.a[i][j];
            }
        }
    }
    //devuelve el valor de dos indices para poder acceder a los elementos desde fuera
    public double get(int i,int j){
        return this.a[i][j];
    }
    //chequear si tienen la misma dimension
    public boolean tienenLaMismaDimension(MatrizBid2 b){
        return this.numFilas()==b.numFilas() && this.numCols()==b.numCols();
    }
    public MatrizBid2 producto(MatrizBid2 b){
        MatrizBid2 c=new MatrizBid2(this.numFilas(),this.numCols());
        for (int i = 0; i < c.numFilas(); i++) {
            for (int j = 0; j < c.numCols(); j++) {
                for (int k = 0; k < c.numCols(); k++) {
                    c.a[i][j]+=this.get(i, k)*b.get(k, j);
                }
            }
        }
        return c;
    }
    //metodo para realizar las operaciones de las matrices
    public MatrizBid2 operacion(MatrizBid2 b,char op){
        //this + b
        if(!this.tienenLaMismaDimension(b)){
            return null;
        }
        MatrizBid2 c=new MatrizBid2(this.numFilas(),b.numCols());
        for (int i = 0; i < this.numFilas(); i++) {
            for (int j = 0; j < this.numCols(); j++) {
                if(op=='+'){
                     c.a[i][j]=this.get(i, j)+b.get(i, j);
                }else if(op=='-'){
                    c.a[i][j]=this.get(i, j)-b.get(i, j);
                }
            }
        }
        return c;
    }
    public MatrizBid2 suma(MatrizBid2 b){
        return operacion(b,'+');
    }
    public MatrizBid2 resta(MatrizBid2 b){
        return operacion(b,'-');
    }
    public int numFilas(){
        return a.length;
    }
    public int numCols(){
        return this.a[0].length;
    }
    public static int getNumMatrices(){
        return MatrizBid2.numTotalMatrices;
    }
    public static boolean puedenMultiplicarse(MatrizBid2 a, MatrizBid2 b){
        return a.numCols()==b.numFilas();
    }
}
    
     
        

