package com.javaLogic.enumerations;

/**
 * Created by macbook on 6/17/17.
 */

/**
 * Enum class can be outside the class or inside the class
 * but not inside a method
 */
enum Card{
    SPADES, HEART, DIAMOND, CLUBS
};

public class HFjEnum {


    /**
     *
     * Make a class of type enum and definte Constants the class contains
     */

    enum Names{

        /**
         * JERRY, BOBBY, PHILL, and RANA are the constants and have constant specific bodies
         */
        JERRY("Guitar"){
            public String sings(){
                return "Awesome";
            }
        },
        BOBBY("Banjo"){
            public String sings(){
                return "Bad";
            }
        },
        PHILL("Flute"){
            public String sings(){
                return "Average";
            }
        },
        RANA("Piano");

        /**
         * Can have variables
         */
        private String instrument;

        /**
         * Enum can have a constructor
         */
        Names(String instrument){
            this.instrument=instrument;

        }

        /**
         *Enum constructor can be overloaded
         */
        Names(String instrument, int x, int...args ){
            this.instrument=instrument;

        }
        public String getInstrument(){
            return this.instrument;
        }

        public String sings(){
            return "Occasionaly";
        }

    }



    public static void main(String[] args) {

        for(Names n : Names.values()){
            System.out.print(n);
            System.out.print(" plays instrument::"+n.getInstrument());
            System.out.print(" and sings::"+n.sings());
            System.out.println();
        }

       Names[] arrNames = Names.values();
        System.out.println(arrNames[1]);
    }
}
