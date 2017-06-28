package com.javaLogic.interfaceabstract;

/**
 * Created by macbook on 6/1/17.
 */
public class HelloWorld implements MyInterface {
    @Override
    public void xyz() {
        System.out.println("XYZ");
    }

    @Override
    public void abc() {
        System.out.println("ABC");
    }

    public static void main(String[] args) throws Exception {
       final MyInterface mi = new HelloWorld();
        mi.xyz();
        mi.abc();
    }
}
