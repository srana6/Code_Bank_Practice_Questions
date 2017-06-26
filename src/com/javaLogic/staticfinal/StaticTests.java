package com.javaLogic.staticfinal;

/**
 * Created by macbook on 6/17/17.
 */

/**
 * Confusion in this code snippet is that when constructor from the base class
 * calls the constructor of the parent class, then Constructor will be executed first or the static
 *
 * Precedence Tree --> static block of super class if present
 *                      static block of child class if present
 *                      Constructor of the Super class
 *                      Constructor of the Parent class
 */
class StaticSuper {

    static{
        System.out.println("Super Static Block");
    }

    public StaticSuper(){
        System.out.println("Static Super");
    }
}

public class StaticTests extends StaticSuper{
    static int rand;
    static {
        rand = (int) (Math.random()*6);
        System.out.println("Static block::"+rand);
    }

    public StaticTests(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        StaticTests st = new StaticTests();

    }

}
