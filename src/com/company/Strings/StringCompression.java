package com.company.Strings;

/**
 * Created by macbook on 4/20/17.
 */
public class StringCompression {





    public static String StringCompression(String str){
        int i;
        int count=1;
        StringBuilder sb = new StringBuilder();
        for(i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                if(count>1){
                    sb.append(count);
                    sb.append(str.charAt(i));
                    count=1;
                }
                else{
                    sb.append(""+count+str.charAt(i));
                }
            }
            else{
                count+=1;
                continue;
            }
        }
        if(count>1){
            sb.append(count);
            sb.append(str.charAt(i));
            count=1;
        }
        else{
            sb.append(""+count+str.charAt(i));
        }
        //System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {

        StringCompression sc = new StringCompression();
        System.out.println(StringCompression("GGGGrrrrt"));

    }
}
