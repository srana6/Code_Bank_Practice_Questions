package com.company.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by macbook on 5/22/17.
 */
public class MinDelOpforTwoStrings {

    public int minDistance(String word1, String word2) {
        char [] c1= word1.toCharArray();
        char [] c2=word2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        Set<Character> hs = new HashSet<>();

        int i=0,j=0,counter=0;

        while(i<c1.length&&j<c2.length){
            if(c1[i]!=c2[j]){
                hs.add(c1[i]);
                hs.add(c2[j]);
            }
            i+=1;
            j+=1;
        }
        while(i<c1.length){
            counter+=1;
            i+=1;
        }
        while(j<c2.length){
            counter+=1;
            j+=1;
        }


        return hs.size()+counter;
    }

    public static void main(String[] args) {
        MinDelOpforTwoStrings mots = new MinDelOpforTwoStrings();
        System.out.println(mots.minDistance("sea","eat"));
    }
}
