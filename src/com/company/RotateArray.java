package com.company;

import java.util.Arrays;

/**
 * Created by macbook on 3/26/17.
 */
public class RotateArray {

    public RotateArray(int[] ar,int k){
        int count=0;
        //outer loop
        while(count<k){
            //take last element from the end of the array
            int temp=ar[ar.length-1];

            //inner loop from right to left, to shift elements in the array to right side
            for(int i=ar.length-2;i>=0;i--){
                ar[i+1]=ar[i];
            }
            ar[0]=temp;
            count+=1;
        }

        System.out.println(Arrays.toString(ar));


       /* int x=0;
        int j;
        System.out.println("The original aray is::: "+ Arrays.toString(ar));
        for(int i=ar.length-k;i<ar.length;i++){
            int temp=ar[i];
            for(j=i-1;j>=x;j--){
                ar[j+1]=ar[j];
            }
            ar[j+1]=temp;
            x+=1;

        }
        System.out.println(Arrays.toString(ar));*/

    }

    public static void main(String[] args){
        int [] ar={1,2,3,4,8,6,9};
        int k=3;
        RotateArray rotateArray= new RotateArray(ar,k);
    }
}
