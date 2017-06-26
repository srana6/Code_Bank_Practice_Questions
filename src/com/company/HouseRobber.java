package com.company;

/**
 * Created by macbook on 3/21/17.
 */

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of
 * money you can rob tonight without alerting the police.
 * <p>
 * Company Tags: LinkedIn, Airbnb
 * Tags: Dynamic Programming
 * Similar Problems: (M) Maximum Product Subarray, (M) House Robber II, (M) Paint House, (E) Paint Fence, (M) House
 * Robber III
 */

public class HouseRobber {
        private int totalMoneyCase1;
        private int totalMoneyCase2;
    public void stolenMoney(int[] house){
            totalMoneyCase2=0;
            totalMoneyCase1=0;
            for(int i=0;i<house.length;i+=2){
                totalMoneyCase1+=house[i];
            }
            for(int j=1;j<house.length;j+=2){
                totalMoneyCase2+=house[j];
            }
            if(totalMoneyCase1>=totalMoneyCase2){
                System.out.println(totalMoneyCase1);
            }
            else {
                System.out.println(totalMoneyCase2);
            }
        }

    public static void main(String[] args){
       HouseRobber hr=new HouseRobber();
       int [] house1={2, 8, 3, 6, 5};
        int [] house2={1, 2, 3, 4};
        hr.stolenMoney(house1);
        hr.stolenMoney(house2);


    }
}
