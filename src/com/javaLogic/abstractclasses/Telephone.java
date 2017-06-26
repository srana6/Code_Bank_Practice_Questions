package com.javaLogic.abstractclasses;

/**
 * Created by macbook on 6/13/17.
 */
public abstract class Telephone {

    /***
     * trying to see if the subclass have to implement the abstract inner class
     */

    String ringtone;

    abstract void dialNumber(int number);

    abstract class InternalOfTelephone{
        boolean circutBoard;

        public String typeOfCircuit(){
            return "parallel";
        }
    }
}
