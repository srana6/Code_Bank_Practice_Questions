package com.company.Strings;

import java.util.*;

/**
 * Created by macbook on 4/17/17.
 */
public class LongestUniqueString {

    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;

        /*The idea is use a hash set to track the longest substring without repeating characters so far,
        use a fast pointer j to see if character j is in the hash set or not, if not, great, add it to the hash set,
        move j forward and update the max length, otherwise, delete from the head by using a slow pointer i until
        we can put character j to the hash set.
         */

        int i = 0, j = 0, length = 0;
        Set<Character> set = new LinkedHashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j+=1;
                length = Math.max(length, set.size());
            } else {
                set.remove(s.charAt(i));
                i+=1;
            }
        }
        System.out.println(set.toString());
        return length;
    }

    public static void main(String[] args) {
        LongestUniqueString lus = new LongestUniqueString();
        System.out.println(lus.lengthOfLongestSubstring("dvdf"));
    }
}
