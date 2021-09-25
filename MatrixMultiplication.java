/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Victor
 */
public class MatrixMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Matrices a and b
        int[][] a = {{1,2,3},{-1,0,3}};
        int[][] b = {{3,-2},{-2,-4},{1,0}};

        String sta = a.length + "x" + a[0].length;
        String stb = b.length + "x" + b[0].length;
        
        System.out.println("Matrix A");
        printFormattedArr(a);
        System.out.println("Matrix B");
        printFormattedArr(b);
        
        /**
        multiply matrices a and b, if not possible display an error message 
        columns of matrix1 should be of the same length as rows of matrix2  
        **/ 
        if(assertMultiply(a, b)){
            System.out.println("Matrix C = A*B");
            int[][] c = mutiply(a,b);
            
            printFormattedArr(c);
        } else{
            System.out.println("error: operator *: nonconformant arguments "
                    + "(op1 is " + sta + " op2 is " + stb );
        }
        
    }        
    
    //multiply matrices a and b
    private static int[][] mutiply(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];  
        
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < b.length; j++){
                    for(int k = 0; k < b[0].length; k++){
                        c[i][k] += a[i][j] * b[j][k];
                    }
                } 
            }
        return c;
    }
    
    //prints a matrix
    private static void printNormalArr(int[][] a){
        for(int[] i : a){
            System.out.print("row" + i);
            for(int j: i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private static void printFormattedArr(int[][] a){  
        printColumnHeaders(a);
        
        for(int i = 0; i < a.length; i++){
            System.out.print("Row" + (i + 1) + "\t");        
            for(int j = 0; j < a[0].length; j++){                
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    //prints the column headers
    private static void printColumnHeaders(int[][] a) {
        System.out.print("\t");
        
        for(int k = 1; k <= a[0].length; k++){
            System.out.print("Col" + k + "\t");
        }
        
        System.out.println();
    }
    
    //returns true if matrices a and be can be multiplied
    private static boolean assertMultiply(int[][] a, int[][] b){
        return a[0].length == b.length;
    }
}