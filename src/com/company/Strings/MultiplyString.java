package com.company.Strings;

import java.util.Arrays;

/**
 * Created by macbook on 4/7/17.
 */
public class MultiplyString {

    public String multiply(String num1, String num2) {
        int numInt1=0;
        int numInt2=0;
        int[] product = new int[num1.length()+num2.length()];

        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                product[i+j+1]+=(num1.charAt(i)-'0') * (num2.charAt(j)-'0');
            }
        }
        System.out.println(Arrays.toString(product));

        int carry=0;
        for(int k=product.length-1;k>=0;k--){
            int temp = (product[k]+carry)%10;
            carry = (product[k]+carry)/10;
            product[k]=temp;
        }
        System.out.println(Arrays.toString(product));


        String str="";
        StringBuilder sb = new StringBuilder();
        for(int m=0;m<product.length;m++){
            sb.append(product[m]);
        }
        while (sb.length() != 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();

    }

    public static void main(String[] args){
        MultiplyString ms = new MultiplyString();
        System.out.println(ms.multiply("123", "468"));

    }
}
