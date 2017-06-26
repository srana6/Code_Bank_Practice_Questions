package com.ctc.array_strings;

/**
 * Created by macbook on 6/6/17.
 */
public class StringCompression {
    /*
    aabccccaaa --> a2b1c5a3
     */
    private static String stringCompression(String s) {
        int count=1;
        StringBuilder sb = new StringBuilder();
        /*
        Traverse the String
         */
        for(int i=0;i<s.length()-1;i++){
            /*
            See if current char and the next char are equal
             */
            if(s.charAt(i)==s.charAt(i+1)){
                /*
                If yes, increment the count
                 */
                count+=1;
            }else{
                /*
                If no then different char is there therefore append the current char and make count =1
                 */
                sb.append(""+count+s.charAt(i));
                count=1;
            }
        }

        /*
        Check if last char is not equal to previous char
         */
        if(s.charAt(s.length()-1)!=s.charAt(s.length()-2)){
            /*
            If not append 1 and the last char
             */
            sb.append(""+1+s.charAt(s.length()-1));
        }else{
            /*
            If yes, append the current value of count and the last char.
             */
            sb.append(""+count+s.charAt(s.length()-1));
        }

        /*
        return the new generated string
         */
        return sb.toString();
    }

    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        System.out.println(stringCompression("aabccccaaad"));
    }


}
