package com.company;

import java.util.Arrays;

/**
 * Created by macbook on 5/4/17.
 */
public class MaximumTimeFromArray {

    private int findMax(int[] ar, int val) {
        int max=-1;
        int indexToRemove=-1;
        if(ar.length!=4){
            return -1;
        }

        for(int i=0;i<ar.length;i++){
            if(ar[i]<=val){
                if(ar[i]>max){
                    max=ar[i];
                    indexToRemove=i;
                }

            }
        }

        if(indexToRemove==-1){
            return -1;
        }
        ar[indexToRemove] = -1;
        return max;
    }

    private int[] makeTime(int[] ar) {

        int [] time = new int[4];

        time[0] = findMax(ar,2);
        time[1] = time[0]==2 ? findMax(ar,3) : findMax(ar, 9);
        time[2] = findMax(ar,5);
        time[3] = findMax(ar,9);

        return time;

    }



    public static void main(String[] args) {
        int [] ar={9,8,6,2};
        MaximumTimeFromArray mtfa = new MaximumTimeFromArray();
        System.out.println(Arrays.toString(mtfa.makeTime(ar)));
    }


}
