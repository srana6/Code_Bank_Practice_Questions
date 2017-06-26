package com.coding.hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by macbook on 4/20/17.
 */

class BuisnessSolution{

    public int id;
    public int rating;
    public BuisnessSolution(int id, int rating){
        this.id=id;
        this.rating=rating;
    }
}
public class SortingObjectProperties {
    private static List<BuisnessSolution> buisness = new ArrayList<>();

    private static Comparator<BuisnessSolution> byRatings()
    {
        return new Comparator<BuisnessSolution>()
        {
            @Override
            public int compare(BuisnessSolution o1, BuisnessSolution o2)
            {
                return o2.rating - o1.rating;
            }
        };
    }

    public List<BuisnessSolution> sortOnRatings(List<BuisnessSolution> buisness){
        Collections.sort(buisness, byRatings());

        return buisness;

    }

    public void populateBuisnessList(int id, int rating){
        buisness.add(new BuisnessSolution(id,rating));
    }

    public static void main(String[] args) {
        SortingObjectProperties sop = new SortingObjectProperties();
        sop.populateBuisnessList(1006,5);
        sop.populateBuisnessList(1005,5);
        sop.populateBuisnessList(999,2);
        sop.populateBuisnessList(1001,1);
        sop.populateBuisnessList(1004,5);
        sop.populateBuisnessList(1000,4);

        sop.sortOnRatings(buisness);

        for(BuisnessSolution bs : buisness){
            System.out.print(bs.id+" ");
            System.out.print(bs.rating);
            System.out.println();
        }
    }

}
