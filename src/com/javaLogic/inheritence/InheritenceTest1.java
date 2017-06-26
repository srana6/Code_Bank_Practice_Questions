package com.javaLogic.inheritence;

/**
 * Created by macbook on 6/1/17.
 */

class Feline {
    public String type = "f ";
    public Feline() {
        System.out.print("feline ");
    }  //<-- 1) print feline

    public Feline(int a, int b){
        a=1;
        b=2;
        System.out.println(a+" "+b);
    }
}
public class InheritenceTest1 extends Feline {
    public InheritenceTest1() {
        /**
         * First call will always go to the default contructor of the parent class
         */
        System.out.print("cougar "); //<-- 2) Constructor call
    }

    public InheritenceTest1(int a, int b){
        /**
         * First call will always go to the default contructor of the parent class if super keyword is not present
         */
        //super(1,2);
        a=3;
        b=4;
        System.out.println(a+" "+b);
    }

    public static void xyz(){
        System.out.println("Static contxt"); //<-- 7) print "static context

    }
    void go() {
        int x=1; // <-- 3) x=1
        int y=x++;  // <-- 4) y=1
        System.out.println(y); // <-- 5) print y value
        xyz(); //<-- 6) xyz() call

        type = "c "; // <-- 8)
        System.out.print(this.type + super.type); //<-- 9)
    }
    public static void main(String[] args) {
        new InheritenceTest1().go();
        new InheritenceTest1(1,2);
    }
}

