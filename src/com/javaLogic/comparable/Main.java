package com.javaLogic.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by macbook on 6/17/17.
 */
public class Main {

    private static List<Songs> songsList = new ArrayList<>();

    public String fetchSong(int i){
        if(i == 1){
            return "stitches";
        }
        if(i ==2 ){
            return "baby";
        }
        if( i == 3){
            return "hall of fame";
        }
        else{
            return "";
        }
    }

    public void sortList(){
        Collections.sort(songsList);
        for (Songs s: songsList) {
            System.out.println(s.getSongName());
        }
    }

    public static void main(String[] args) {
        Songs s;
        Main m = new Main();
        for(int i=1;i<=3;i++){
            s = new Songs();
            String str = m.fetchSong(i);
            s.setSongName(str);
            songsList.add(s);
        }
        m.sortList();

    }
}
