package com.company;

import java.util.Stack;

/**
 * Created by macbook on 4/2/17.
 */
public class ValidParenthesis {
    private Stack<Character> st = new Stack<>();
    public boolean balanceParenthesis(String s) {
        for(char c : s.toCharArray()){
            if(c=='('){
                st.push(')');
            }
            else if(c=='{'){
                st.push('}');
            }
            else if(c=='['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }


    public int longestValidParentheses(String s) {
       // int counter = 0;
        if (s.equals("") || s.length() == 1) {
            return 0;
        }
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray()) {

            st.push(c);
        }
        for(int i=st.size()-1;i>=0;i--){
            System.out.println(st.pop());

        }
        return 0;
    }

    public static void main(String[] args){
        String s = "()(()";
        ValidParenthesis vp =new ValidParenthesis();
      //  System.out.println(vp.balanceParenthesis(s));
        vp.longestValidParentheses(s);

    }
}
