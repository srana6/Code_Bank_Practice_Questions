package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by macbook on 4/30/17.
 */
public class MinimumSizeSubarraySum {

    public int partition(int[] ar, int left, int right){
        int pivot = ar[right];
        int temp;
        for(int i=left; i<right;i++){
            if(ar[i]<=pivot){
                temp = ar[i];
                ar[i] = ar[left];
                ar[left] = temp;
                left+=1;
            }
        }

        //switch pivot
        temp = ar[right];
        ar[right]=ar[left];
        ar[left]=temp;

        return left;
    }

    public void quicksort(int[] ar, int left, int right){
        if (left<right){
            int pIndex = partition(ar, left, right);
            quicksort(ar, left, pIndex-1);
            quicksort(ar, pIndex, right);
        }


    }

    public static void main(String[] args) {

        int[] ar={12,28,83,4,25,26,25,2,25,25,25,12};
        int s = 213;
        int sum=0;
        int temps;
        temps=s;
        List<Integer> ls = new ArrayList<>();

        MinimumSizeSubarraySum mss =  new MinimumSizeSubarraySum();
        mss.quicksort(ar, 0, ar.length-1);
        //Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

        for(int i=ar.length-1;i>=0;i--){
            int x = ar[i];
            if(x>=temps){
                ls.clear();
                ls.add(x);
                break;
            }else{
                sum+=x;
                //else if x is smaller than s;
                //insert into list
               // s-=x;
                if(sum<=s) {
                    ls.add(x);
                    if(sum==s) {
                        break;
                    }
                }else if(sum>s) {
                    ls.add(x);
                    break;
                }

                }

            }
        System.out.println(ls.toString());
        }

    }
