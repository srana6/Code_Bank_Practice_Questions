package com.company.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by macbook on 5/6/17.
 */
public class FirstUniqueCharacterString {

    Map<Character,Integer> map = new LinkedHashMap<>();

    private int findUniqueCharacter(String str) {
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                int x=map.get(str.charAt(i));
                map.put(str.charAt(i),x+1);
            }
        }

        for(Map.Entry<Character,Integer> hm : map.entrySet()){
            if(hm.getValue()==1){
                return str.indexOf(hm.getKey());
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str="acaadcad";
        FirstUniqueCharacterString fucs = new FirstUniqueCharacterString();
        System.out.println(fucs.findUniqueCharacter(str));
    }


}
