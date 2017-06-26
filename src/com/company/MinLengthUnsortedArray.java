package com.company;

/**
 * Created by macbook on 5/4/17.
 */
public class MinLengthUnsortedArray {

    private void findLengthOfUnsortedArray(int[] ar) {
        int start=0;
        int end=0;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i+1]>ar[i]){
                continue;
            }else{
                start = i;
                break;
            }
        }

        for(int i=ar.length-1;i>=1;i--){
            if(ar[i-1]<ar[i]){
                continue;
            }else{
                end =i;
                break;
            }
        }
        System.out.println(start+" "+end);
    }

    public static void main(String[] args) {
        /*int[] ar={10,12,20,30,25,40,32,31,35,50,60};
        MinLengthUnsortedArray  minLengthUnsortedArray = new MinLengthUnsortedArray();
        minLengthUnsortedArray.findLengthOfUnsortedArray(ar);*/


        int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
            if(array[i]<max){
                rightIndex = i;
            }
        }
        for(int i=array.length-1;i>=0;i--){
            if(min > array[i]){
                min = array[i];
            }
            if(array[i]>min){
                leftIndex = i;
            }
        }
        System.out.println("Sort subarray from " + leftIndex + " to " + rightIndex);
    }


}
