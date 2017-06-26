package com.company;

import java.util.Arrays;

/**
 * Created by macbook on 5/3/17.
 */
public class DistanceToNearestZero {

    private void findDistanceToNearestZero(int[] ar) {

        int distance = -1;
        //left to right direction
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                distance=0;
            }else{
                if(distance==-1){
                    ar[i]=Integer.MAX_VALUE;
                }else{
                    distance+=1;
                    ar[i]=distance;
                }

            }
        }

        distance=-1;
        for(int j=ar.length-1;j>=0;j--){
            if(ar[j]==0){
                distance=0;
            }else{
                if(distance==-1){
                    continue;
                }else{
                    distance+=1;
                    ar[j]=Math.min(ar[j],distance);
                }
            }
        }

        System.out.println(Arrays.toString(ar));
    }


    public static void main(String[] args) {
        int [] ar={1,1,0,1,1,1,0};
        DistanceToNearestZero dtnz = new DistanceToNearestZero();
        dtnz.findDistanceToNearestZero(ar);
    }


}
