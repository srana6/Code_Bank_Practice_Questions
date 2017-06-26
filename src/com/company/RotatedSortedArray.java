package com.company;

import java.util.Arrays;

/**
 * Created by macbook on 4/19/17.
 */
public class RotatedSortedArray {


    /*
    Largest Element
    Calculate Mid
    1) Compare mid and right if right is bigger than mid, go towards right
        i.e left=mid+1
    2) Compare mid and right if Mid is bigger go opposite of right i,e left
          right=mid
     */
    private int largestElement(int[] ar){
        int left = 0;
        int right = ar.length-1;
        while(left<right){
            int mid = left+(right-left)/2;

            if(ar[mid]<ar[right]){  // if right is smaller than mid, go right
                left=mid+1;

            }
            else{
                right=mid;
            }
        }
        return ar[left];
    }
    /*
    Smallest element
     */
    /*
    Calculate Mid
    1) Compare mid and right element, if right is smaller-- move towards right side
       i.e left=mid+1
    2) If mid is smaller than the right go opposite of right i.e left.
        right = mid;
     */
    private int findSmallest(int[] ar) {
        int left = 0;
        int right = ar.length-1;
        while(left<right){
            int mid = left+(right-left)/2;

            if(ar[mid]>ar[right]){  // if right is smaller than mid, go right
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return ar[left];
    }

    public void searchElement(int[] ar, int target){

    }


    public static void main(String[] args) {
        int ar[]={65,7,90,180,12,15,19,56};
        RotatedSortedArray rotatedSortedArray = new RotatedSortedArray();
        System.out.println(rotatedSortedArray.findSmallest(ar));
        System.out.println(rotatedSortedArray.largestElement(ar));
        rotatedSortedArray.searchElement(ar, 7);
    }


}
