package com.company.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 5/23/17.
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return null;
        }

        if (s.length() == 1) {
            return s;
        }

        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {

            // get longest palindrome with center of i
            String tmp = helper(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }

            // get longest palindrome with center of i, i+1
            tmp = helper(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
        return longest;}

    public String helper(String s, int begin, int end) {

        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {

            begin--;

            end++;

        }

        return s.substring(begin + 1, end);
    }


    /*public String longestPalindrome(String s) {
        String res = "";
        int currLength = 0;
        for(int i=0;i<s.length();i++){
            if(isPalindrome(s,i-currLength-1,i)){
                res = s.substring(i-currLength-1,i+1);
                currLength = currLength+2;
            }
            else if(isPalindrome(s,i-currLength,i)){
                res = s.substring(i-currLength,i+1);
                currLength = currLength+1;
            }
        }
        return res;
    }

    public boolean isPalindrome(String s, int begin, int end){
        if(begin<0) return false;
        while(begin<end){
            if(s.charAt(begin++)!=s.charAt(end--)) return false;
        }
        return true;
    }*/


    public static void main(String[] args) {
       String s = "babad";
       LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
       //lps.permutation(s);
       lps.longestPalindrome(s);

    }
}
