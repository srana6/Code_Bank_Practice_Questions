package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by macbook on 3/29/17.
 */
public class CalculateCharacter {
    private Map<String,Integer> charMap;
    //private int key=1;

    public CalculateCharacter(String str){
        charMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            String ch= String.valueOf(str.charAt(i));

            if(charMap.containsKey(ch)){
                int key=charMap.get(ch);
                key=key+1;
                charMap.put(ch,key);
            }
            else{
                charMap.put(ch,1);
            }

        }

        for(Map.Entry <String,Integer> hm : charMap.entrySet()){
            System.out.print(+hm.getValue()+hm.getKey());
        }

    }
    public static void main(String[] args){
        CalculateCharacter cc=new CalculateCharacter("abcaaabbb");
    }
}
