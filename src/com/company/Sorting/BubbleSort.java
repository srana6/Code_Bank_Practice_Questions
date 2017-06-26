package com.company.Sorting;

import java.util.Arrays;

/**
 * Created by macbook on 4/8/17.
 */
public class BubbleSort {
    public int temp;
    public int counter=1;
    public void bubbleSort(int[] ar){
        boolean flag=true;
        while(flag){
            for(int i=0;i<ar.length-1;i++){
                    if(ar[i]>ar[i+1]) {
                        temp = ar[i];
                        ar[i] = ar[i+1];
                        ar[i+1] = temp;
                    }

                }
                counter+=1;
                if(counter==ar.length){
                flag=false;
                }
                System.out.println(Arrays.toString(ar));
                //break;
        }

    }

    public static void main(String[] args) {
        int [] sortingSet ={10,2,4,1,3,2,6};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(sortingSet);
    }
}
