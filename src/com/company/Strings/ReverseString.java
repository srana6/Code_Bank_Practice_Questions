package com.company.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 5/5/17.
 */
public class ReverseString {

    private static List<String> getParts(String string, int partitionSize) {
        List<String> parts = new ArrayList<String>();
        int len = string.length();
        for (int i=0; i<len; i+=partitionSize)
        {
            parts.add(string.substring(i, Math.min(len, i + partitionSize)));
        }
        return parts;
    }

    private String reverseKCharacter(String str, int k) {

        int partitionSize=k*2;
        List<String> ls=getParts(str,partitionSize);


        StringBuilder sbResult = new StringBuilder();

        for(int i=0;i<ls.size();i++){
            String sTemp=ls.get(i);
            if(sTemp.length()>=k){
                String s1=sTemp.substring(0,k);
                String s2=sTemp.substring(k,sTemp.length());

                StringBuilder sb = new StringBuilder();
                sb.append(s1);
                sb.reverse();
                sb.append(s2);

                sbResult.append(sb);


            }else if(sTemp.length()<k){
                StringBuilder sb = new StringBuilder(sTemp);
                sb.reverse();

                sbResult.append(sb);

            }
        }


        return sbResult.toString();

    }



    private String stringReverse(String str) {
        if(str.length()==0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();

    }

    public boolean detectCapitalUse(String word) {

       /* All letters in this word are capitals, like "USA".
          All letters in this word are not capitals, like "leetcode".
          Only the first letter in this word is capital if it has more than one letter, like "Google".
        */

       String s1 = word.toUpperCase();
       String s2 = word.toLowerCase();
       //char c = word.charAt(0);
       String s3 = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        System.out.println(s3);
       if(word.equals(s1) || s2.equals(word) ||  s3.equals(word)){
           return true;
       }/*else if(s2.equals(word)){
           return true;
       }else if(s3.equals(word) ){
           return true;
       }*/
        return false;
    }

    public static void main(String[] args) {
        String str="hello";
        String str1="abcdefg";
        ReverseString reverseString = new ReverseString();
        /*
        Reverse the whole String
         */
        System.out.println(reverseString.stringReverse(str));
        /*
        Reverse the k character out of 2k characters in the string
         */
        System.out.println(reverseString.reverseKCharacter(str1,2));

        /*
        Validate capital use
         */

        System.out.println(reverseString.detectCapitalUse("FlaG"));
    }


}
