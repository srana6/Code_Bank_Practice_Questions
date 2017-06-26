package com.coding.hackerank;

/**
 * Created by macbook on 4/20/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int sumDiagonal1=0;
        int sumDiagonal2=0;
        int i=0,j=0;
        //n = n-1;
        while(i<n && j<n){
            sumDiagonal1+=a[i][j];
            i+=1;
            j+=1;
        }

        //System.out.println(sumDiagonal1);
        int row = 0;
        int col = n-1;
        while(row<n && col>=0){
            sumDiagonal2+=a[row][col];
            row+=1;
            col-=1;
        }
        int result = Math.abs(sumDiagonal1-sumDiagonal2);
        System.out.println(result);
    }
}

