package com.coding.hackerank;

/**
 * Created by macbook on 4/21/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int countZero=0;
        int countNegative=0;
        int countPositive=0;
        for(int i : arr){
            if(i<0){
                countNegative+=1;
            }else if(i>0){
                countPositive+=1;
            }else if(i==0){
                countZero+=1;
            }
        }

        System.out.println(countPositive);
        System.out.println(countNegative);
        System.out.println(countZero);

        int len = arr.length;

        System.out.println((double) countPositive/len);
        System.out.println((double) countNegative/len);
        System.out.println((double) countZero/len);
    }
}

