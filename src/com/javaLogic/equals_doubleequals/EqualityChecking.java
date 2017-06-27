package com.javaLogic.equals_doubleequals;

/**
 * Created by macbook on 6/18/17.
 */
public class EqualityChecking {

    private int x;
    private String s;

    public EqualityChecking(int x){
        this.x=x;
    }

    public EqualityChecking(String s){
        this.s = s;
    }

    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 ="Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        /**
         * This will be True, since both str1 and str2 have same refrence in memory/String pool
         */
        System.out.print("Comparing str1 & str2 :::");
        System.out.println(str1 == str2);

        /**
         * This will be false, since str3 & str4 have different object reference
         */
        System.out.print("Comparing str3 & str4 :::");
        System.out.println(str3==str4);

        /**
         * This will evaluate to be true since the data inside the object is same
         */
        System.out.println("Comparing str1 & str2 :::"+str1.equals(str2));
        System.out.println("Comparing str3 & str4 :::"+str3.equals(str4));

        EqualityChecking ec1 = new EqualityChecking(10);
        EqualityChecking ec2 = new EqualityChecking(10);
        EqualityChecking ec3 = ec1;

        /**
         * False
         */
        System.out.print("When we try ec1 == ec2 ::: ");
        System.out.println(ec1==ec2);

        /**
         * True
         */
        System.out.print("When we try ec1 == ec3 ::: ");
        System.out.println(ec1==ec3);

        /**
         * false, we need to have equal() method implementation
         */
        System.out.print("When we try ec1.equals(ec2) ::: ");
        System.out.println(ec1.equals(ec2));

        EqualityChecking ec4 = new EqualityChecking("Hello");
        EqualityChecking ec5 = new EqualityChecking("Hello");

        /**
         * false, we need to have equal() method implementation
         */
        System.out.print("When we try ec4.equals(ec5) ::: ");
        System.out.println(ec4.equals(ec5));
    }
}
