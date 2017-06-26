package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 4/7/17.
 */
public class SummaryRanges {
    private List<List<Integer>> resultList = new ArrayList<>();
    private List<Integer> innerList = new ArrayList<>();

    private List<String> ls = new ArrayList<>();

    public List<String> summaryRanges(int[] nums) {

        if(nums.length<=0){
            return ls;
        }
        int counter = nums[0];
        for(int i=0;i<nums.length;i++){
            if(counter==nums[i]){
                innerList.add(counter);
                counter+=1;
            }else{
                resultList.add(innerList);
                counter=nums[i];
                innerList = new ArrayList<>();
                innerList.add(counter);
                counter+=1;
            }
        }
        resultList.add(innerList);
        //System.out.println(resultList.toString());
        for(List<Integer> i : resultList){
            if(i.size()>1){
               String str= i.get(0).toString()+"->"+i.get(i.size()-1).toString();
               ls.add(str);
            }
            else{
                ls.add(i.get(0).toString());
            }

        }

        return ls;
    }

    public static void main(String[] args){
        int[] nums ={1};

        SummaryRanges sr = new SummaryRanges();
        System.out.println(sr.summaryRanges(nums));
    }
}
