package com.company;

/**
 * Created by macbook on 4/11/17.
 */
public class FactorialRecursion {

    public int findFactorial(int n){  //Back to B
        if(n==0){
            return 1;
        }
        else{
           return  n*findFactorial(n-1); //B.... Back to A
        }

    }

    public static void main(String[] args) {
        FactorialRecursion fr = new FactorialRecursion();
        System.out.println(fr.findFactorial(5)); //A
    }
}
