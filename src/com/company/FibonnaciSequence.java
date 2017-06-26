package com.company;

/**
 * Created by macbook on 4/1/17.
 */
public class FibonnaciSequence {

    public int recursiveWay(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return recursiveWay(n-1)+recursiveWay(n-2);
        }

    }

    public void iterativeWay(){
        int f=1;
        System.out.print(f+" ");
        int s=1;
        System.out.print(s+" ");
        int i=2;
        while(i<5){
            int next = f+s;
            System.out.print(next+" ");
            f=s;
            s=next;
            i+=1;
        }

    }
    public static void main(String[] args){
        FibonnaciSequence fs = new FibonnaciSequence();
        fs.iterativeWay();
        System.out.println();
        for(int i=1;i<=5;i++){
            System.out.print(fs.recursiveWay(i)+" ");
        }

    }
}
