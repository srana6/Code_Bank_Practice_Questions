package com.company;

/**
 * Created by macbook on 5/3/17.
 */
public class IncreasingDecreasingSearchArray {

    private int searchElement(int[] ar, int k) {
        //1. find the max element
        int left=0;
        int right=ar.length-1;
        int max=0;
        int index=0;

        while(left<right) {
            int mid = left + (right - left) / 2;
            //2.Decide which side to traverse to find max element
            if (ar[mid - 1] > ar[mid]) {
                right=mid;

            } else if (ar[mid] < ar[mid + 1]) {
                left=mid+1;
            }else{
                max=ar[mid];
                index = mid;
                break;
            }
        }
        //System.out.println(max);
        if(ar[index]==k){
            return k;
        }
        left=0;
        right=index;
        while(left<right){
            int mid = left+(right-left)/2;
            if(k==ar[mid]){
                return k;
            }
            if(k<ar[mid]){
                right=mid;
            }else if(k>ar[mid]){
                left=mid+1;
            }
        }

        left=ar.length-1;
        right=index+1;

        while(right<left){
            int mid=right+(left-right)/2;
            if(ar[mid]==k){
                return k;
            }
            if(k<ar[mid]){
                right=mid+1;
            }else if(k>ar[mid]){
                left=mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ar={2,6,7,8,9,10,5,4,3,1};
        int k=12;
        IncreasingDecreasingSearchArray indsa = new IncreasingDecreasingSearchArray();
        System.out.println(indsa.searchElement(ar,k));
    }


}
