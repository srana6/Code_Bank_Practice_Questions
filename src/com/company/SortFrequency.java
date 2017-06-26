package com.company;

import com.sun.xml.internal.bind.v2.util.QNameMap;

import java.util.*;

/**
 * Created by macbook on 4/19/17.
 */
public class SortFrequency {

public static void sortArray(int[] arr){


    /**
     * Created a Hashmap having key and values(no of time a digit is repeated)
     */

    Map<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i<arr.length;i++){

        if(hm.containsKey(arr[i])){

            hm.put(arr[i],hm.get(arr[i])+1);
        }
        else{

            hm.put(arr[i],1);
        }
    }

    /**
     * Created an Array list which stores whole hashmap entry set inside it
     */

    ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
    System.out.println("List::: "+list.toString());

    /**
     * Sort the list two ways, on values
     */
    list.sort(new CompareValues());
    /**
     * If values are same, sort on keys
     */
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            if(o1.getValue()==o2.getValue()){
                return (o2.getKey()).compareTo(o1.getKey());
            }
            return (o1.getValue()).compareTo(o2.getValue());
        }
    });

    for (Map.Entry<Integer, Integer> entry : list) {

        for(int i=0;i<entry.getValue();i++){
            System.out.print(entry.getKey());
        }



    }

}

    public static void main(String[] args) {
        /**
         * Sort Keys by values in accending order
         * if two keys have same value sort the keys in decending order
         */
    int[] ar={8,5,5,5,5,1,1,1,1,4,4};
        SortFrequency sf = new SortFrequency();
        SortFrequency.sortArray(ar);
    }

    /**
     * Inner static class to which implemets Comparator interface to sort Hashmap on basis of Values
     */
    static class CompareValues implements Comparator<Map.Entry<Integer, Integer>>{

        @Override
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            return (o1.getValue()).compareTo(o2.getValue());
        }
    }
}
