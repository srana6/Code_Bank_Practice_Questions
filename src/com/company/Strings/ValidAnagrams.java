package com.company.Strings;

import java.util.Arrays;

/**
 * Created by macbook on 5/8/17.
 */
public class ValidAnagrams {

    public static boolean isAnagram(String s, String t) {
        if(s.length()==0 && t.length()==0) return true;
        if(s.length()==0 || t.length()==0) return false;
        char[] s1= s.toCharArray();
        char[] s2= t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        String str1 = new String(s1);
        String str2 = new String(s2);

        if(str1.equals(str2)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
