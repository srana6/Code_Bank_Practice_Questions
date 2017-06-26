package com.company;

/**
 * Created by macbook on 4/18/17.
 */

/*
Find the Kth largest element collectively from 2 sorted integer arrays
 */
public class KthLargestCollective {

    private int large=0;
   // int i,j;
    public void findKthLargest(int[] ar1, int[] ar2,int k) {

        int i=ar1.length-1;
        int j=ar2.length-1;

        while (k > 0) {

            //int large =0;

            if(ar1[i]>=ar2[j]){
                large=ar1[i];
                i-=1;

            }
            else{
                large=ar2[j];
                j-=1;
            }

            k-=1;
        }
        System.out.println(large);
    }

    public static void main(String[] args) {
        int[] ar1={9,10,11,23,33,44};
        int[] ar2={12,19,20,21,29};

        KthLargestCollective klc = new KthLargestCollective();
        klc.findKthLargest(ar1,ar2,1);
    }


}
