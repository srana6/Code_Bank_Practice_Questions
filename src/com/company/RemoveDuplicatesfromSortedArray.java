package com.company;

/**
 * Created by macbook on 5/24/17.
 */
public class RemoveDuplicatesfromSortedArray {

    private int removeDuplicates(int[] ar) {
        int i=0;int j=0;
        while(i<ar.length-1){
            if(ar[i]!=ar[i+1]){
                ar[j]=ar[i];
                j+=1;
            }
            i+=1;
        }
        ar[j]=ar[ar.length-1];
        return j+1;
    }

    public static void main(String[] args) {
        /*
        given sorted array
         */
       // int [] ar={1,1,1,2,3,3,3,4,5,5,6};
        int[] ar ={1,1,2};
        RemoveDuplicatesfromSortedArray rdfsma = new RemoveDuplicatesfromSortedArray();
        System.out.println(rdfsma.removeDuplicates(ar));
    }


}
