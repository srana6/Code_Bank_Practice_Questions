package com.javaLogic.interfaceabstract;

/**
 * Created by macbook on 6/1/17.
 */
abstract class MyAbstractClass extends HelloWorld implements MyInterface{

    int x=10;

    public abstract void inheritMe();

    @Override
    public void xyz() {

    }

    @Override
    public void abc() {

    }
}
