package com.company;

/**
 * Created by macbook on 3/20/17.
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number
 * by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it
 * loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy
 * numbers.
 *
 * Example:
 * 19 is a happy number
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 *
 * Tags: Hash Table Math
 * Similar Problems: (E) addRecursive Digits (E) Ugly Number
 */

public class HappyNumber {
    private HappyNumber hp;
    private int remain;
    private int lastDigit;
    private int result=0;

    public boolean happyNumber(int num) {
        if (num >= 0) {
            System.out.println(num / 10);
            System.out.println(num % 10);
            //System.out.println(1/10);

            while (num != 1) {
                remain = num;
                while (remain != 0) {
                    lastDigit = remain % 10;
                    remain = remain / 10;
                    result += (int) (Math.pow(lastDigit, 2));
                }

                num = result;
                result=0;
                System.out.println(result);

            }
            return true;
        }
        return false;
    }

    @Before
    public void setUp(){
        hp = new HappyNumber();
    }

   /* @Test
    public void testEdgeCases(){
        Assert.assertFalse(cd.containsDuplicate(null));
        Assert.assertFalse(cd.containsDuplicate(new int[]{}));
        Assert.assertFalse(cd.containsDuplicate(new int[]{1}));
    }*/

    @Test
    public void testExamples(){
        Assert.assertTrue(hp.happyNumber(19));
    }

    @After
    public void tearDown(){
        hp=null;
    }
}
