package com.coding.hackerank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by macbook on 5/11/17.
 */
public class TakingInput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int cArr[]=new int[26];
        int cArr1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            cArr[s1.charAt(i)-97]++;
        }
        System.out.println(Arrays.toString(cArr));
        for(int i=0;i<s2.length();i++){
            cArr1[s2.charAt(i)-97]++;
        }
        System.out.println(Arrays.toString(cArr1));
        int count=0;
        for(int i=0;i<26;i++){
           /* if(counter<s1.length()){
                if(cArr[i]!=cArr1[i]){
                    counter+=1;
                }
            }else{

            }*/
            count+=Math.abs(cArr[i]-cArr1[i]);
        }
        System.out.println(count);
    }
}
