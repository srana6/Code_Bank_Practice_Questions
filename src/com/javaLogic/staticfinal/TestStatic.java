package com.javaLogic.staticfinal;

/**
 * Created by macbook on 6/16/17.
 */
public class TestStatic {
    int x=12;

    /**
     * Works
     * @param x
     */
    public static void go(int x){
        System.out.println(x);
    }

    /**
     * Works
     * @param y
     */
    public static void goFor(final int y){
        System.out.println(y);
    }

    /**
     * Check --> if we can assign static type variables in the static method
     * Result --> No we can't
     */
    public static void checkStaticVariable(){
      //  static int x =10; --> no static keyword allowed

    }

    public static void main(String[] args) {
        TestStatic ts = new TestStatic();
    }
}
