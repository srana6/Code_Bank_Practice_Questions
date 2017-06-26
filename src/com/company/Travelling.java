package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by macbook on 5/4/17.
 */
public class Travelling {
    int min=0;
    int mainMin=Integer.MAX_VALUE;
    int j=0;
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> hs;
        while(j<A.length) {
            hs = new HashSet<>(4);
            for (int i = j; i < A.length; i++) {
                //count+=1;
                if (hs.add(A[i])) {
                    if(hs.size()==4){
                       min=i-j+1;
                    }

                    //hs.add(A[i]);
                }

            }
            mainMin=Math.min(min,mainMin);
            j+=1;
        }
     //   System.out.println(hs.toString());
        System.out.println(mainMin);
        return 0;
    }

    public static void main(String[] args) {
        int [] ar={7,3,4,3,4,4,4,1};
        Travelling t = new Travelling();
        t.solution(ar);


    }
}
