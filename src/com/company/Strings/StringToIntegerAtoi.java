package com.company.Strings;

/**
 * Created by macbook on 5/1/17.
 */
public class StringToIntegerAtoi {

    private final int max_value = Integer.MAX_VALUE/10;
    private int stringToInteger(String str) {

        int num=0;
        int sign =1;
        int i =0;

        /*1. remove all the white spaces if exists in the string
        simply take the i pointer to position where there is no space left
         */
        while(i<str.length() && Character.isWhitespace(str.charAt(i))){
            i+=1;
        }

        /*
        2. Determine if first character is + sign or -ve sign
         */
        if(i<str.length() && str.charAt(i)=='+'){
            sign=1;
            i+=1;
        }else if(i<str.length() && str.charAt(i)=='-'){
            sign = -1;
            i+=1;
        }

        while(i<str.length()){
            int x = str.charAt(i)-'0';
            //3. whether character is actually a digit
            if(x<0 || x>9){
                break;
            }
            //4. check the overflow condition
            if(num>max_value || num==max_value && num>Integer.MAX_VALUE%10){
                return sign==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            num = num*10+x;
            i+=1;
        }

        return num*sign;


        }



    public static void main(String[] args) {
        StringToIntegerAtoi stia = new StringToIntegerAtoi();
        System.out.println(stia.stringToInteger("        2"));
    }


}
