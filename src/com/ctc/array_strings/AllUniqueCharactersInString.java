package com.ctc.array_strings;

/**
 * Created by macbook on 6/6/17.
 */
public class AllUniqueCharactersInString {

    /*
    Determine if a String has all unique characters without using additional data structures
     */
    boolean [] arr = new boolean[128];

    private boolean findIfStringIsUnique(String str) {

        for(int i=0;i<str.length();i++){
            int val = str.charAt(i);
            if(arr[val]){
                return false;
            }
            arr[val]=true;
        }
        return true;
    }


    public static void main(String[] args) {
        String str="abcdea";
        AllUniqueCharactersInString auncs = new AllUniqueCharactersInString();
        System.out.println(auncs.findIfStringIsUnique(str));
    }


}
