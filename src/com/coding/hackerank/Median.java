package com.coding.hackerank;

import java.util.Arrays;

/**
 * Created by macbook on 4/20/17.
 */
public class Median {

    public Median(int[] ar){
        Arrays.sort(ar);
        int left = 0;
        int right = ar.length-1;

        int median = left+(right-left)/2;
        System.out.println(median);
    }

    public static void main(String[] args) {
        int[] ar={0,1,2,4,6,5,3};
        Median median = new Median(ar);
    }
}
