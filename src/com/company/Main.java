package com.company;

public final class Main {
   // private  int i=0;
    private int num1=0;
    private int num2=0;

    public void convertInt(String str1,String str2){
        for(int i=0;i<str1.length();i++){
            //System.out.println(str.charAt(i));
            num1*=10;
            num1 += str1.charAt(i) - '0';
            //System.out.println(num);
        }
        for(int i=0;i<str2.length();i++){
            //System.out.println(str.charAt(i));
            num2*=10;
            num2 += str2.charAt(i) - '0';
            //System.out.println(num);
        }
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
	// write your code here
        Main m =new Main();
        m.convertInt("123","111");
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str3="Hello";
        String str4="Hello";
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
    }
}
