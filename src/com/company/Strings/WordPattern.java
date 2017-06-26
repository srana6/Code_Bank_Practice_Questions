package com.company.Strings;

import java.util.*;

/**
 * Created by macbook on 3/26/17.
 */
public class WordPattern {
    private Set<String> patternSet=new HashSet<>();
    private Set<String> wordSet=new HashSet<>();

    private Map<String,String> commonMap=new HashMap<>();
    //private Map<String,String> wordMap=new HashMap<>();

    public WordPattern(String word,String pattern){
        String[] patternList = pattern.split("");
        System.out.println(Arrays.toString(patternList));
        String[] wordList = word.split(" ");
        System.out.println(Arrays.toString(wordList));

        for(int i=0;i<patternList.length;i++){
            patternSet.add(patternList[i]);
        }
        for(int j=0;j<wordList.length;j++){
            wordSet.add(wordList[j]);
        }

        System.out.println(patternSet.toString());
        System.out.println(wordSet.toString());

        if(patternSet.size()==wordSet.size()){
            for(int i=0;i<patternSet.size();i++){
                //commonMap.put(patternSet.)
            }
        }


    }
    public static void main(String[] args){
        String word="dog cat cat dog";
        String pattern="abba";
        WordPattern wp = new WordPattern(word,pattern);
    }
}
