package com.javaLogic.enumerations;

/**
 * Created by macbook on 6/17/17.
 */
public class HFjEnum {



    /**
     *
     * Make a class of type enum and definte Constants the class contains
     */
    enum Names{

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

        private String instrument;

        Names(String instrument){
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

    }
}
