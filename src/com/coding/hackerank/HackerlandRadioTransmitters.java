package com.coding.hackerank;

import java.util.Scanner;

/**
 * Created by macbook on 5/21/17.
 */
public class HackerlandRadioTransmitters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }

        if(n<k){
            System.out.println(1);
        }else if(k>n){

        }

    }
}
