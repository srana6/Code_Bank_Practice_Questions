package com.company.Sorting;

import java.util.Arrays;

/**
 * Created by macbook on 4/8/17.
 */
public class InsertionSort {

    public int temp;
    public void insertionSort(int[] ar){
        for(int i=1;i<ar.length;i++){
            //int temp = ar[i];
            for(int j=i;j>0&&ar[j-1]>ar[j];j--){
                temp = ar[j-1];
                ar[j-1]=ar[j];
                ar[j]=temp;
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        int [] sortingSet ={10,2,4,1,3,2,6};
        InsertionSort is = new InsertionSort();
        is.insertionSort(sortingSet);
    }
}
