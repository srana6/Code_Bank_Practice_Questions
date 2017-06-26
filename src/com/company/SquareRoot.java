package com.company;

/**
 * Created by macbook on 4/17/17.
 */
public class SquareRoot {
    private int start =1, end, result;


    public int mySqrt(int x) {
        long sqrtn;
        sqrtn = x;
        while(sqrtn*sqrtn>x){
            sqrtn=(sqrtn+x/sqrtn)/2;
        }
        return (int) sqrtn;
    }

    /*
    Using Binary Search
     */
    public int findSquareRoot(int num){
        end=num;

        while(start<=end){
            int mid = (start+end)/2;

            if(mid*mid==num){
                result=mid;
                return result;
            }
            /*
            right
             */
            else if(mid*mid<num){
                start=mid+1;
                result=mid;
            }
            /*
            left
             */
            else if(mid*mid>=num){
                end=mid-1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        SquareRoot sr = new SquareRoot();
        //System.out.println(sr.findSquareRoot(10));
        System.out.println(sr.mySqrt(2));

    }
}
