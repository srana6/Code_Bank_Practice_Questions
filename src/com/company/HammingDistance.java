package com.company;

/**
 * Created by macbook on 4/4/17.
 */
public class HammingDistance {

    public HammingDistance(int x, int y){
        int counter=0;
        //String strX = Integer.toBinaryString(x);
        //String strY = Integer.toBinaryString(y);
        int z=x^y;
        String s=Integer.toBinaryString(z);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                counter+=1;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args){
        HammingDistance hd = new HammingDistance(1,4);
    }
}
