package com.company.Sorting;

import java.util.Arrays;

/**
 * Created by macbook on 4/8/17.
 */
public class QuickSort {

    int temp;

    public int partition(int[] sortingSet, int left, int right){
        int pivot = sortingSet[right];
        //int pIndex = left;
        for(int i = left;i<right;i++){
            if(sortingSet[i]<=pivot){
                temp = sortingSet[i];
                sortingSet[i] = sortingSet[left];
                sortingSet[left] = temp;
                left+=1;
            }
        }
        temp=sortingSet[right];
        sortingSet[right]=sortingSet[left];
        sortingSet[left]=temp;
        return left;
    }

    public void quickSort(int[] sortingSet, int left, int right){
        if(left<right) {
            int pIndex = partition(sortingSet, left, right);
            quickSort(sortingSet, left, pIndex-1);
            quickSort(sortingSet, pIndex, right);
        }

        //System.out.println(Arrays.toString(sortingSet));
    }

    public static void main(String[] args){
        int[] sortingSet ={-1,-50,-3,-1,-6,-7,-4};
        QuickSort qs = new QuickSort();
        qs.quickSort(sortingSet,0,sortingSet.length-1);

        for(int i=0;i<sortingSet.length;i++){
            System.out.print(sortingSet[i]+" ");
        }
    }
}
