package com.company.Hard;

/**
 * Created by macbook on 4/26/17.
 */
public class ShortestPalindrome {

    public static String shortestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String tempStr = s.substring(1,s.length());
        String originalStr="";
        String reverseStr="";

        if(s.equals(sb.reverse().toString())){
            return s;
        }

        sb = new StringBuilder(s);

       // String str = s;
        for(int i=tempStr.length()-1;i>=0;i--){

            sb.insert(sb.length() - s.length(),tempStr.charAt(i));
            originalStr = String.valueOf(sb);
            reverseStr = String.valueOf(sb.reverse());
            if(originalStr.equals(reverseStr)){
                return originalStr;
            }
            else{
                sb = new StringBuilder(originalStr);
                continue;
            }

        }
        //System.out.println(sb.toString());

        return originalStr;

    }

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("aacecaaa"));
    }
}
