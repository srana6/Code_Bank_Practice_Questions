package com.javaLogic.overloading;

/**
 * Created by macbook on 6/26/17.
 */

/**
 * Two overloaded method having paramenter of type object
 * We pass the null as the argument, let's see which out of these method will execute
 */
public class TestingOverloading {

    /**
     * Anything with parameter such as Integer, Double, Boolean and so on is not a
     * valid overloaded method in this scenario
     */
   /* public static void xyz(TestingOverloading i){
        System.out.println("Integer object executed::"+i);
    }*/

    /**
     * This method will be executed coz In case of method overloading,
     * the most specific method is chosen at compile time
     * String is more specific than the object
     */

    public static void xyz(String s){
        System.out.println("String object executed::"+s);
    }

    public static void xyz(Object o){
        System.out.println("Object executed"+o);
    }

    public static void main(String[] args) {
        xyz(null);
    }
}
