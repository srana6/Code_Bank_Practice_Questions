package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value
 * appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Tags: Array, Hash Table
 * Similar Problems: (E) Contains Duplicate II, (M) Contains Duplicate III
 */
public class ContainsDuplicate {
    private ContainsDuplicate cd;

    private boolean containsDuplicate(int[] nums){
        if(nums== null || nums.length<=1){
            return false;
        }
        else{
            Set<Integer> set= new HashSet<>(nums.length);
            for(int number : nums){
                if(!set.add(number)){
                    return true;
                }
            }
        }
        return false;

    }

    @Before
    public void setUp(){
        cd = new ContainsDuplicate();
    }

    @Test
    public void testEdgeCases(){
        Assert.assertFalse(cd.containsDuplicate(null));
        Assert.assertFalse(cd.containsDuplicate(new int[]{}));
        Assert.assertFalse(cd.containsDuplicate(new int[]{1}));
    }

    @Test
    public void testExamples(){
        Assert.assertFalse(cd.containsDuplicate(new int[]{1,2,3}));
        Assert.assertTrue(cd.containsDuplicate(new int[]{1,1,3}));
    }

    @After
    public void tearDown(){
        cd=null;
    }
}