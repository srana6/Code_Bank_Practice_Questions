package com.javaLogic.autoboxing_unboxing;

/**
 * Created by macbook on 6/17/17.
 */

/**
 * Nice Example
 */
public class TestBox {
    /**
     * i is of type object hence it is by default null assigned
     */
    Integer i;
    int j;

    public void go(){
       // i = new Integer(5);
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String[] args) {
        TestBox tb = new TestBox();
        tb.go();
    }
}
