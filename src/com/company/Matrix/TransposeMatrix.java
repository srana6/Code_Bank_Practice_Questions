package com.company.Matrix;

/**
 * Created by macbook on 4/8/17.
 */
public class TransposeMatrix {


    public void matrixTranspose(int[][] matrix1){
        for(int i=0;i<matrix1[0].length;i++){
            for(int j=i+1;j<matrix1.length;j++){
                int temp = matrix1[i][j];
                matrix1[i][j] = matrix1[j][i];
                matrix1[j][i]=temp;
            }
        }
        for(int i=0;i<matrix1[0].length;i++){
            for(int j=0;j<matrix1.length;j++){
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int x[][] ={
                { 1, 2 },
                { 4, 5 }
        };

        TransposeMatrix tm = new TransposeMatrix();
        tm.matrixTranspose(x);
    }
}
