package com.coding.hackerank;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by macbook on 4/21/17.
 */
public class BalanceSmiley {

    public static String[] is_balanced(String[] res){
        String[] result=result = new String[res.length];;
        if(res.length == 0) {
            result[0] ="YES";
            return result;// YES is the same as 'true'
        }


        for(int j=0;j<res.length;j++){
            String line = res[j];

            int minOpen = 0, maxOpen = 0;
            for (int i = 0; i < line.length(); i++) {
                char crr = line.charAt(i);
                if (crr == '(') {
                    maxOpen++;
                    if (i == 0 || line.charAt(i - 1) != ':') {
                        minOpen++;
                    }
                } else if (crr == ')') {
                    minOpen = Math.max(0, minOpen - 1);
                    if (i == 0 || line.charAt(i - 1) != ':') {
                        maxOpen--;
                        if (maxOpen < 0) break;
                    }
                }
            }
            if(maxOpen >= 0 && minOpen == 0){
                result[j]="YES";
            }
            else{
                result[j]="NO";
            }

        }

        return result;

    }


    public static void main(String[] args) {
        String[] res;
        Scanner in = new Scanner(System.in);
        String[] _expression = new String[5];
        String item;
        for(int i=0;i<5;i++){
            try{
                item=in.nextLine();
            }catch (Exception e){
                item=null;
            }
            _expression[i]=item;
        }
        res = is_balanced(_expression);

        for(String s : res){
            System.out.println(s);
        }

    }

}
