package com.coding.hackerank;

import java.util.*;

/**
 * Created by macbook on 5/21/17.
 */
public class ValidStringSherlock {

    static String isValid(String s){
        // Complete this function
        char [] ar = s.toCharArray();

        Map<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<ar.length;i++){
            if(hm.containsKey(ar[i])){

                hm.put(ar[i],hm.get(ar[i])+1);
            }
            else{

                hm.put(ar[i],1);
            }
        }

        System.out.println(hm.toString());

        List<Integer> ls = new ArrayList<>();

        for(Map.Entry<Character,Integer> map:hm.entrySet()){
            ls.add(map.getValue());
        }


        Set<Integer> set = new HashSet<>();
        int counter = 0;

        for (int i : ls) {

            if (i != 0) {
                set.add(i);
                if (i == 1) counter++;
            }
        }

        System.out.println(set.toString());
        if(!(set.size() > 2 || counter > 1)){
            return "YES";
        }

        return "NO";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
