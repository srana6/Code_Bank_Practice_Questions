package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 5/24/17.
 */
public class FindDisappearedNumberInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
       /* List<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(ls.indexOf(nums[i])==-1){
                ls.add(nums[i]);
            }
        }

        for(int i=1;i<=nums.length;i++){
            if(ls.indexOf(i)!=-1){
                ls.remove(Integer.valueOf(i));
            }else{
                ls.add(i);
            }
        }
        return ls;*/

       /*
       efficent solution
        */
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                int val = nums[index];
                nums[index] = -val;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ls.add(i+1);
            }
        }
        return ls;
    }

    public List<Integer> findDuplicates(int[] nums1) {
       // List<Integer> ls = new ArrayList<>();
        List<Integer> lsNew = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int index = Math.abs(nums1[i])-1;
            if(nums1[index]>0){
                int val=nums1[index];
                nums1[index]=-val;
            }else if(nums1[index]<0){
                lsNew.add(Math.abs(nums1[i]));
            }
        }
        return lsNew;
    }

    public static void main(String[] args) {
        int [] nums={5,4,6,7,9,3,10,9,5,6};
        int [] nums1={4,3,2,7,8,2,3,1};
        FindDisappearedNumberInArray fdsma = new FindDisappearedNumberInArray();
       // System.out.println(fdsma.findDisappearedNumbers(nums).toString());
        System.out.println(fdsma.findDuplicates(nums).toString());
    }
}
