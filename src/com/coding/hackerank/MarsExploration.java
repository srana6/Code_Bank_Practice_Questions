package com.coding.hackerank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by macbook on 6/4/17.
 */
public class MarsExploration {

    private static List<String> getParts(String string, int partitionSize) {
        List<String> parts = new ArrayList<String>();
        int len = string.length();
        for (int i=0; i<len; i+=partitionSize)
        {
            parts.add(string.substring(i, Math.min(len, i + partitionSize)));
        }
        System.out.println(parts.toString());
        return parts;
    }

    private static int marsExploration(String s){
        if(s.length()%3==0){
            int count =0;
            List<String> ls = getParts(s,3);
            for(int i=0;i<ls.size();i++){
                String str = ls.get(i);
                System.out.println(str);
                if(str.equals("SOS")){
                    continue;
                }else{
                    for(int j=0; j<str.length();j++){
                        if(str.charAt(j)!="SOS".charAt(j)){
                            count+=1;
                        }
                    }
                }
            }
            return count;
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        System.out.println(marsExploration(S));
    }
}
