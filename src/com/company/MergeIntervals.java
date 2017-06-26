package com.company;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by macbook on 4/21/17.
 */


 // Definition for an interval.
class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
}

public class MergeIntervals {

    /*private static Comparator<Interval> byRatings()
    {
        return new Comparator<Interval>()
        {
            @Override
            public int compare(Interval o1, Interval o2)
            {
                return o1.start-o2.start;
            }
        };
    }*/

    public List<Interval> merge(List<Interval> intervals) {


        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval obj0, Interval obj1) {
                return obj0.start - obj1.start;
            }
        });

        List<Interval> ret = new ArrayList<>();
        Interval prev = null;
        for (Interval inter : intervals) {
            if (  prev==null || inter.start>prev.end ) {
                ret.add(inter);
                prev = inter;
            } else if (inter.end>prev.end) {
                // Modify the element already in list
                prev.end = inter.end;
            }
        }

        for(Interval i : ret){
            System.out.println(i.start);
            System.out.println(i.end);
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1,4));
        list.add(new Interval(2,3));
        //list.add(new Interval(5,10));
        //list.add(new Interval(15,18));

        MergeIntervals mi = new MergeIntervals();
        mi.merge(list);
    }
}

