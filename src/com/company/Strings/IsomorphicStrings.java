package com.company.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by macbook on 5/1/17.
 */
public class IsomorphicStrings {
    private Map<Character,Character> map = new HashMap<>();
    int i=0;

    private boolean checkIsomorphic(String s, String t) {
        while(i<=s.length()-1){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);

            if(!map.containsKey(sChar)){
                if(map.containsValue(tChar)){
                    return false;
                }
                map.put(sChar,tChar);
            }else{
                char getChar = map.get(sChar);
                if(getChar!=tChar){
                    return false;
                }
            }

            i+=1;
        }
        return true;

    }


    public static void main(String[] args) {
        String s="ab";
        String t="aa";

        IsomorphicStrings is = new IsomorphicStrings();
        System.out.println(is.checkIsomorphic(s,t));
    }


}
