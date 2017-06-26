package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by macbook on 4/7/17.
 */
public class CombinationSum {
   // private List<List<Integer>> outerList =new ArrayList<>();
   // private List<Integer> innerList = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args){
        int[] candidates ={2, 3, 6, 7};
        CombinationSum cs = new CombinationSum();
        System.out.println(cs.combinationSum(candidates,7).toString());
    }
}