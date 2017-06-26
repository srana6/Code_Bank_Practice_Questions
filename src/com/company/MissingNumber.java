package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by macbook on 5/6/17.
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {

        //using binary search
        Arrays.sort(nums);
        int left=0;
        int right=nums.length;
        while(left<right){
            int index =left+(right-left)/2;
            if(nums[index]>index){
                right=index;
            }else{
                left=index+1;
            }

        }
        return left;

       /* Arrays.sort(nums);
        int start= nums[0];
        int end = nums[nums.length-1];

        if(nums.length==1 && nums[0]!=1){
            return nums[0]+1;
        }
        if(nums[0]==1){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }

        for(int i=start;i<=end;i++){
            if(!map.containsValue(i)){
                return i;
            }
        }
        //case:-- [0,1]--> 2
        return nums[nums.length-1]+1;*/
    }


    public static void main(String[] args) {
        int[] x={0,1,3};
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(x));
    }
}
