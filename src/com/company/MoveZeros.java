package com.company;

import java.util.Arrays;

/**
 * Created by macbook on 4/2/17.
 */
public class MoveZeros {
    int count=0;
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count+=1;
            }
        }
        System.out.println("Total number of zeros are:: "+ count);

        while(j<count){
            int temp;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==0 && nums[i+1]!=0){
                    temp=nums[i+1];
                    nums[i+1]=nums[i];
                    nums[i]=temp;
                }
                else if(nums[i]==0 && nums[i+1]==0){
                    continue;
                }
            }
            j+=1;
        }
        System.out.println(Arrays.toString(nums));

    }

   /* private void swap(int[] nums, int index, int index1) {
        int temp;
        temp=nums[index1];
        nums[index1]=nums[index];
        nums[index]=temp;
    }*/

    public static void main(String[] args){
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(nums);
    }
}
