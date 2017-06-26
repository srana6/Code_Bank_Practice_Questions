package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 3/22/17.
 */
public class Pascals {
    public List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ls;
        if (numRows == 0) {
            return result;
        }
        if (numRows == 1) {
            ls = new ArrayList<>();
            ls.add(1);
            result.add(ls);
            return result;
        } else {
            for (int i = 0; i < numRows; i++) {
                ls = new ArrayList<>();
                if (i == 0) {
                    ls.add(1);
                    result.add(ls);
                } else if (i == 1) {
                    ls.add(1);
                    ls.add(1);
                    result.add(ls);
                } else {
                    /*
                    [1,1]
                     */
                    ls.add(0, 1);
                    List<Integer> tempList = result.get(i - 1);
                    for (int j = 0; j < tempList.size() - 1; j++) {

                        ls.add(j + 1, tempList.get(j) + tempList.get(j + 1));

                    }
                    ls.add(1);
                    result.add(ls);
                }
            }
        }
        return result;
    }

    public static void main(String... args){
        Pascals p = new Pascals();
        System.out.println(p.generatePascal(3).toString());

    }
}
