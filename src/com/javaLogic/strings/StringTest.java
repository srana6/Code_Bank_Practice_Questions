package com.javaLogic.strings;

/**
 * Created by macbook on 6/12/17.
 */
public class StringTest {

    /**
     *
     * Same String reference lives in same pool area
     */
    public static void main(String[] args) {
        StringTest st = new StringTest();
        st.checkStrings();
    }

    private void checkStrings() {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
