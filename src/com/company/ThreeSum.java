package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by macbook on 4/5/17.
 */
public class ThreeSum {


   

    private void threeSum(int[] ar, int target) {
       
        Arrays.sort(ar);
        Set<List<Integer>> hs = new LinkedHashSet<>();

        List<Integer> ls ;
        for(int i=0;i<ar.length-2;i++){

           /* if (i > 0 && ar[i] == ar[i - 1]) {              // skip same result
                continue;
            }*/

            int partial_target = target-ar[i];
            int j=i+1;
            int k=ar.length-1;
            while(j<k){
                int partial_sum = ar[j]+ar[k];
                if(partial_target==partial_sum){
                    ls=new ArrayList<>();
                    ls.add(ar[i]);
                    ls.add(ar[j]);
                    ls.add(ar[k]);
                    j+=1;
                    k-=1;
                    hs.add(ls);

                    //while (j < k && ar[j] == ar[j - 1]) j++;  // skip same result
                    //while (j < k && ar[k] == ar[k + 1]) k--;  // skip same result
                } else if(partial_sum>partial_target){
                    k-=1;
                } else{
                    j+=1;
                }


            }
        }
        System.out.println(hs.toString());

        List<List<Integer>> lsNew = new ArrayList<>(hs);
        System.out.println(lsNew.toString());

    }

    public static void main(String[] args){
        int [] ar={-1, 0, 1, 2, -1, -4};
        ThreeSum ts = new ThreeSum();
        ts.threeSum(ar,0);
        System.out.println(ts.checkRecord("AA"));
    }

    private boolean checkRecord(String s) {
        if(s.length()==0){
            return true;
        }
        int countA=0;
        int countL=0;
        boolean flag=false;
        if(s.contains("LLL")){
            flag=true;
        }
        char[] ar = s.toCharArray();
        for(int i=0;i<ar.length;i++){
            if(ar[i]=='A'){
                countA+=1;
            }
        }
        if(flag || countA>1){
            return false;
        }else{
            return true;
        }
    }


}
