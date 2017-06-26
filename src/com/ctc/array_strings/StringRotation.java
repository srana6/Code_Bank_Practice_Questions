package com.ctc.array_strings;

/**
 * Created by macbook on 6/6/17.
 */
public class StringRotation {

    private static boolean isRotataion(String s1, String s2) {
        s2=s2+s2;
        System.out.println(s2);
        return isSubstring(s1,s2);
    }

    private static boolean isSubstring(String s1, String s2) {
        if(s2.contains(s1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StringRotation sr = new StringRotation();
        System.out.println(isRotataion("erbottlewat","waterbottle"));
    }


}
