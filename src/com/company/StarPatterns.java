package com.company;

/**
 * Created by macbook on 3/26/17.
 */
public class StarPatterns {
    public static boolean flag=true;

    /*
       *
      **
     ***
    ****
   *****

     */

    public void printPattern1(){
        for(int i=4;i>0;i--){
            for(int j=1;j<=4;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

     /*
       *****
        ****
         ***
          **
           *

     */

    public void printPattern2(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
                }
            System.out.println();
            }
    }

     /*
       *
      ***
     *****
    *******
   *********

     */
     public boolean printFn(){
         if(flag){
             System.out.println("        *");
             flag=false;
         }
         return false;
     }

    public void printPattern3(){
        for(int i=9;i>0;i--){
            int counter=0;
            printFn();
            for(int j=1;j<=9;j++){
                if(j>=i){
                    counter+=1;

                    System.out.print("0");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=0;k<counter-1;k++){
                System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        StarPatterns sp =new StarPatterns();
        sp.printPattern3();
        //sp.printPattern2();
    }
}
