package com.company.Matrix;

import java.util.Arrays;

/**
 * Created by macbook on 4/7/17.
 */
public class MatrixMultiplication {
    private int [][] resultMatrix = new int[2][3];
    public void matrixMultiply(int[][] matrix1, int[][] matrix2){
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){
                    resultMatrix[i][j] = resultMatrix[i][j] + (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
       for(int i=0;i<resultMatrix.length;i++){
            for(int j=0;j<resultMatrix[0].length;j++){
                System.out.println(resultMatrix[i][j]);
            }
       }


    }
    public static void main(String[] args){
        int x[][] ={
                { 1, 2 },
                { 3, 4 }
        };

        int y[][] ={
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        MatrixMultiplication mm = new MatrixMultiplication();
        mm.matrixMultiply(x,y);
    }
}
