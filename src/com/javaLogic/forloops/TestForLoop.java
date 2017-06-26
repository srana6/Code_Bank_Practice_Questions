package com.javaLogic.forloops;

/**
 * Created by macbook on 6/26/17.
 */
public class TestForLoop {

    /**
     * Testing if we can put 'true' in the condition checking part of the for loop
     */
    public void testForLoop(int x){

        /**
         * Yes it works
         */
        for(int i=0;true;i++){
            /**
             * x++ --> increments the value but we will get the result as 5
             * ++x  --> increment first and then assign value to variable, hence result will be 6
             */
            System.out.println(x++);
            break;

        }
    }

    public static void main(String[] args) {
        TestForLoop tfl = new TestForLoop();
        tfl.testForLoop(5);
    }
}
