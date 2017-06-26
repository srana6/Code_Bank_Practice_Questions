package com.coding.hackerank;

import java.util.*;

/**
 * Created by macbook on 4/6/17.
 */
public class StringCompare {
    private static SortedSet<String> list = new TreeSet<>();

    public static void main(String[] args){
        StringCompare sc = new StringCompare();

        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int x = n;
        for(int i=0;i<s.length()-(x-1);i++){
            list.add(s.substring(i,n));
            n+=1;

        }

  /*      String small = list.get(0);

        String large = list.get(0);

        for(int i=1;i<list.size();i++){

            String compare =list.get(i);


            if(((int) small.charAt(0) > (int) compare.charAt(0))|| Character.isUpperCase(small.charAt(0))){
                small = compare;
            }
            else if((int) small.charAt(0) == (int) compare.charAt(0)){
                if((int) small.charAt(1) > (int) compare.charAt(1)){
                    small = compare;
                }
            }

        }

        for(int j=1;j<list.size();j++){

            String compare =list.get(j);

            if((int) large.charAt(0) < (int) compare.charAt(0)){
                large = compare;
            }

        }*/
        System.out.println(list.first());
        System.out.println(list.last());


    }
}
