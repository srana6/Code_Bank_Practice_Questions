package com.company.Strings;

/**
 * Created by macbook on 3/29/17.
 */
public class ReverseVowels {

    String vowel="aeiou";
    public static void main(String[] args) {

        String vow = "leetcode";
        // TODO Auto-generated method stub

        ReverseVowels rv=new ReverseVowels();
        //System.out.println(vowel.indexOf("u"));

        rv.revVow(vow);

    }

    private void revVow(String vow) {
        // TODO Auto-generated method stub

        StringBuilder sb = new StringBuilder(vow);
        int i = 0;
        int j = vow.length()-1;

        while(i<=j){
            char x = sb.charAt(i);
            if(vowel.indexOf(x) == -1){ //Not a vowel then go ahead
                i++;
            }
            else{ //if encounter a vowel

                char y = sb.charAt(j);
                if(vowel.indexOf(y) == -1){ //If encounter variable is not a vowel, move j towards begining of string
                    j--;
                }
                else if(vowel.indexOf(x) !=-1 && vowel.indexOf(y) !=-1){ //when both i and j are have vowels
                    sb.setCharAt(i, y);
                    sb.setCharAt(j, x);
                    i++;
                    j--;
                }

            }
        }

        System.out.println(sb.toString());
    }



}
