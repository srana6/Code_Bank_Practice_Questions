package com.company.Sorting;

import java.util.Arrays;

/**
 * Created by macbook on 4/8/17.
 */
public class SelectionSort {
    private int temp;

    //Select the min element in every iteration

    public void selectionSort(int[] ar){
        for(int i=0; i<ar.length-1;i++){
            int min =i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<=ar[min]){
                    min = j;
                }
            }
            temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        int [] sortingSet ={1,2,4,1,3,2,6};
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(sortingSet);
    }
}
