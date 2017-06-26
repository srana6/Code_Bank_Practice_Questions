package com.company;

/**
 * Created by macbook on 3/21/17.
 */
/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * Keys: Negative integer?
 *
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 *
 * If you are thinking of converting the integer to string, note the
 * restriction of using extra space.
 *
 * You could also try reversing an integer. However, if you have solved the
 * problem "Reverse Integer", you know that the reversed integer might
 * overflow. How would you handle such case?
 *
 * There is a more generic way of solving this problem.
 *
 * Tags: Math
 */

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class Palindrome {
    private int digit;
    private int revNum=0;

    public int checkPalindrome(int num){
        int n=num;
        while(num>0){
            digit=num%10;
            revNum=revNum*10+digit;
            num=num/10;
        }
        if(n==revNum){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        return revNum;

    }

    public boolean stringPalindrome(String s){
        if(s.length()==0){
            return true;
        }
        String s1=s.replaceAll("[^A-Za-z0-9]", "");
        s1=s1.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            sb.append(s1.charAt(i));
        }
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }

  /*  @Test
    public void tests(){
        int num=1221;
        Palindrome p=new Palindrome();
        Assert.assertEquals(p.checkPalindrome(num),num);
    }*/

    public static void main(String[] args){

        Palindrome p=new Palindrome();
        //p.checkPalindrome(num);
        System.out.println(p.stringPalindrome("aA"));

    }
}
