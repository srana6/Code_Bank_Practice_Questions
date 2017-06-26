package com.company.Sorting;

/**
 * Created by macbook on 4/8/17.
 */
public class MergeSort {

    private int[] merge(int[] left, int[] right, int[] sortingSet) {
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length) {

            if(left[i]<=right[j]) {
                sortingSet[k] = left[i];
                i+=1;
                k+=1;
            }
            else {
                sortingSet[k] = right[j];
                j+=1;
                k+=1;
            }
        }

        while(i<left.length) {
            sortingSet[k] = left[i];
            i+=1;
            k+=1;
        }

        while(j<right.length) {

            sortingSet[k] = right[j];
            j+=1;
            k+=1;
        }

        return sortingSet;
    }

    private int[] mergesort(int[] sortingSet) {

        if(sortingSet.length<2) {
            return sortingSet;
        }
        int mid = sortingSet.length/2;
        int [] left = new int[mid];
        int [] right = new int[sortingSet.length-mid];

        for(int i=0; i<mid;i++) {
            left[i] = sortingSet[i];
        }

        for(int i=mid;i<sortingSet.length;i++) {
            right[i-mid] = sortingSet[i];
        }

        mergesort(left);
        mergesort(right);
        merge(left,right,sortingSet);

        return sortingSet;
    }



    public static void main(String[] args) {
        int[] sortingSet ={1,50,3,1,6,7,4};
        MergeSort qs = new MergeSort();
        qs.mergesort(sortingSet);

        for(int i=0;i<sortingSet.length;i++){
            System.out.print(sortingSet[i]+" ");
        }
    }


}

