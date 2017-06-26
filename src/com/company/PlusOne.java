package com.company;

import java.util.Arrays;

/**
 * Created by macbook on 5/25/17.
 */
public class PlusOne {

    /*

    Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
    You may assume the integer do not contain any leading zero, except the number 0 itself.
    The digits are stored such that the most significant digit is at the head of the list.

    [9] --> [1,0] || [1,7] --> [1,8] || [2,0] --> [2,1]
     */

    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }

        int [] result = new int[digits.length+1];
        result[0]=1;


        return result;

    }

    public static void main(String[] args) {
        int [] digits={1,1,3};
        PlusOne po = new PlusOne();
        int[] result = po.plusOne(digits);
        System.out.println(Arrays.toString(result));

        /*for (Integer i: result) {
            System.out.print(result[i]);
        }*/
    }
}
