package com.company.Stack;

import java.util.Stack;

/**
 * Created by macbook on 6/18/17.
 */
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int [] result = new int[findNums.length];
        Stack<Integer> s = new Stack<>();
        for (int i: nums) {
            s.add(i);
        }
        for(int i=0;i<findNums.length;i++){

        }


        return result;
    }

    public static void main(String[] args) {
        int[] findNums ={4,1,2};
        int[] nums = {1,3,4,2};

        NextGreaterElementI nge = new NextGreaterElementI();
        System.out.println(nge.nextGreaterElement(findNums,nums));

    }
}
