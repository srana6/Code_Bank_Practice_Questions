package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by macbook on 5/2/17.
 */
public class TwoSum {


   /* public int linearsearch(int[] nums, int target, int index){
        for(int i=index;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return 0;

    }*/


    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
        




       // System.out.println(-1*target);
        /*if(target<0){
            for(int i=0;i<nums.length;i++){
                nums[i]=-1*nums[i];
            }
            target = -1*target;
            System.out.println(Arrays.toString(nums));
        }

        int[] result = new int[2];
        if(nums.length==0){
            return result;
        }
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=target){
                temp= target-nums[i];
                //find temp in the array
                int returnValue = linearsearch(nums, temp, i+1);
                if(returnValue!=0){
                    result[0] = i;
                    result[1] = returnValue;
                }*/
               /* if(result.length==2){
                    break;
                }*/
           /* }
        }
        return result;*/

    }


    public static void main(String[] args) {
        int [] ar={3,2,4};
        int t = 6;

        TwoSum ts = new TwoSum();
        int [] result = ts.twoSum(ar,t);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }


    }
}
