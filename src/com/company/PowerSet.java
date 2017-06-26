package com.company;

/**
 * Created by macbook on 4/24/17.
 */
public class PowerSet {

    private static void getPowerSet(int[] arr) {

        int len = arr.length;
        int total = 1<<len;
        for (int i = 0; i < total; i++) {

            for (int j = 0; j < len; j++) {
                //Printing all elements for which there is a bit one in i
                int temp = 1<<j;   // 1, 2, 4
                if((i & (temp)) != 0){
                    System.out.print(arr[j]);
                }
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        int[] ar = {5,2,3};
        getPowerSet(ar);
    }
}
