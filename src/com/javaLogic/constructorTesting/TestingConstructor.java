package com.javaLogic.constructorTesting;

/**
 * Created by macbook on 6/26/17.
 */

/**
 * Intresting scenario
 * Output --> 10,5,constructor name
 *
 * Fields are always instantiated first then the constructor, therefore output 10
 */
class TestingConstructor1 {

   /* public TestingConstructor1(){
        System.out.println("Here1");
    }*/

    /**
     * Constructor of class1
     */
    public TestingConstructor1(int x){
        System.out.println("The value of x is::"+x);
    }
}

public class TestingConstructor{

    static{
        System.out.println();
    }

   /* public TestingConstructor(){
        System.out.println("Here");
    }*/

    /**
     * Calling constructor of class1
     */
    TestingConstructor1 ts1 = new TestingConstructor1(10);

    /**
     * Constructor of class 2
     */
    public TestingConstructor(int x){
        /**
         * Calling constructor of class1
         */
        System.out.println(ts1 = new TestingConstructor1(x));
    }
    public static void main(String[] args) {
        TestingConstructor ts = new TestingConstructor(5);
    }
}
