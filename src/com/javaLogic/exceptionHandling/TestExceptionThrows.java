package com.javaLogic.exceptionHandling;

import junit.framework.Test;

/**
 * Created by macbook on 6/17/17.
 */
public class TestExceptionThrows {


    /**
     * Demo method duck the exception by throwing it to the caller method in main()
     *
     */
    public void demo() throws Exception{
        System.out.println("Hello I am just a demo");
    }


    public static void main(String[] args) {
        TestExceptionThrows tet = new TestExceptionThrows();

        /**
         * Now either main method also duck the exception like demo() method did
         * or it has to handle it with try catch, any of these two options
         */
        try {
            tet.demo();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
