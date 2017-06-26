package com.company;

/**
 * Created by macbook on 5/1/17.
 */

/*
KEEP IN MIND THE CASE OF INTEGER OVERFLOW
reverse of 1000000003 overflows

If overflow exists, the new result will not be equal previous one.
 */
public class ReverseInteger {

    int revNum;
    public int reverseInteger(int num){
        while(num!=0){
            int x = num%10;
            revNum = revNum*10+x;
            num = num/10;
        }
       // System.out.println(revNum);
        if(revNum>=Integer.MIN_VALUE || revNum<=Integer.MAX_VALUE){
            return revNum;
        }
        else{
            return 0;
        }

    }


    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverseInteger(1000000003));
    }
}
