package com.ctc.array_strings;

/**
 * Created by macbook on 6/6/17.
 */
public class RotateImage {
    /*
    1  2  3
    4  5  6 --> Transpose-->
    7  8  9

    1  4  7
    2  5  8 --> 90 degree-->
    3  6  9

    7  4  1
    8  5  2
    9  6  3
     */

    private void rotateImage(int[][] arr) {
        /*
        Transpose the given matrix
         */
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                /*
                Transpose by swap
                 */
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

       /*
       Rotate Symetrically/90 degree
        */
       for(int i=0;i<arr.length;i++){
           for(int j = 0; j<arr.length/2; j++){
               int temp = 0;
               temp = arr[i][j];
               arr[i][j] = arr[i][arr.length-1-j];
               arr[i][arr.length-1-j] = temp;
           }
       }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        RotateImage ri = new RotateImage();
        ri.rotateImage(arr);
    }


}
