package com.company;

/**
 * Created by macbook on 5/25/17.
 */
public class DivisonWithoutOperator {
    public int divide(int dividend, int divisor) {

        boolean sign = false;
        if((dividend >0 && divisor <0) || (dividend <0 && divisor >0) ){
            sign = true;
        }

        long dividendCopy = Math.abs((long) dividend);
        long divisorCopy = Math.abs((long) divisor);
        long result = 0;
        int finalresult=0;

        while(dividendCopy >= divisorCopy){
            long temp = divisorCopy;
            long counter =1;
            while(dividendCopy >= temp){
                temp = temp << 1;
                counter = counter << 1;
            }
            result += counter >> 1;
            dividendCopy -= temp >> 1;

        }


       if(sign){
            finalresult = (int)~result+1;
            if(finalresult>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else{
                return finalresult;
            }
        }else{
            return (int) result;
        }


    }

    public static void main(String[] args) {
        DivisonWithoutOperator dwo = new DivisonWithoutOperator();
        System.out.println(dwo.divide(10,2));
    }
}
