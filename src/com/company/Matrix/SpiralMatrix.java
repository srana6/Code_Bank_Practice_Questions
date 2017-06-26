package com.company.Matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 4/5/17.
 */
public class SpiralMatrix {
    int row=0;
    int coloum=0;
    private List<Integer> result =new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {

        row = matrix.length;
        coloum = matrix[0].length;
        System.out.println("Matrix  row::"+row+" Coloum::"+coloum);
        int totalIterations=0;
        int c=0;
        int cEnd=coloum-1;
        int r=0;
        int rowEnd=row-1;

        while(totalIterations<row*coloum) {

        /*
        ------------->
         */

            for (int i = c; i <= cEnd; i++) {
                result.add(matrix[r][i]);
                totalIterations+=1;
                if(totalIterations==row*coloum){
                    return result;
                }
            }
        /*
                |
                |
                |
               \ /
         */
            for (int j = r + 1; j <= rowEnd; j++) {
                result.add(matrix[j][cEnd]);
                totalIterations+=1;
                if(totalIterations==row*coloum){
                    return result;
                }
            }
        /*
             <--------
         */
            for (int k = cEnd - 1; k >= c; k--) {
                result.add(matrix[rowEnd][k]);
                totalIterations+=1;
                if(totalIterations==row*coloum){
                    return result;
                }
            }
        /*
                 ^
                 |
                 |
                 |
         */
            for (int p = rowEnd - 1; p >= r + 1; p--) {
                result.add(matrix[p][c]);
                totalIterations+=1;
                if(totalIterations==row*coloum){
                    return result;
                }
            }
            c+=1;
            cEnd-=1;
            rowEnd-=1;
            r+=1;
        }
        return result;

    }

    public static void main(String[] args){
        int[][] matrix= {
                        {1, 2, 3, 4, 55 },
                        {5, 6, 7, 8, 58 },
                        {9, 10, 11, 12, 59}
                        };
        SpiralMatrix sm = new SpiralMatrix();
        System.out.println(sm.spiralOrder(matrix).toString());
    }
}
