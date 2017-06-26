package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by macbook on 3/19/17.
 */
public class GreedFactor {
    private static List<Integer> children =new ArrayList<>();
    private static List<Integer> cookies=new ArrayList<>();
    private int satisfy;

    public void calculateGreed(List<Integer> childrenLocal,List<Integer> cookiesLocal){

        System.out.println("Number of Children "+childrenLocal.size());
        System.out.println("Number of cookies "+cookiesLocal.size());
        if(childrenLocal.size()<cookiesLocal.size()){
            int size=cookiesLocal.size()-childrenLocal.size();
            for(int i=0;i<size;i++){
                childrenLocal.add(0);
            }
        }
        else if(cookiesLocal.size()<childrenLocal.size()){
            int size=childrenLocal.size()-cookiesLocal.size();
            for(int j=0;j<size;j++){
                cookiesLocal.add(0);
            }
        }

        System.out.println("Number of Children After Modify "+childrenLocal.size());
        System.out.println("Number of cookies After Modify "+cookiesLocal.size());

        for(int i=0;i<cookiesLocal.size();i++){
            for(int j=0;j<childrenLocal.size();j++){
                if(childrenLocal.get(j).equals(cookiesLocal.get(i))){
                    satisfy=cookiesLocal.get(i);
                }
            }
        }


        System.out.println("No of gratified children::: "+satisfy);

    }
    public static void main(String[] args){
        children.add(1);
        children.add(2);
        children.add(3);

        cookies.add(1);
        cookies.add(2);
        GreedFactor gf = new GreedFactor();
        gf.calculateGreed(children,cookies);
    }
}
