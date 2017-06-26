package com.javaLogic.arrays;

/**
 * Created by macbook on 6/13/17.
 */
public class DogObjectsInArray {

    /**
     * Making an object type array
     */

    private String name;

    public DogObjectsInArray(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        DogObjectsInArray dog = new DogObjectsInArray("Sassy");
        DogObjectsInArray [] dogArray = new DogObjectsInArray[3];
        dogArray[0] = dog;
        dogArray[1] = new DogObjectsInArray("Kara");
        dogArray[2] = new DogObjectsInArray("Bruno");

        for (DogObjectsInArray doggy: dogArray) {
            System.out.println(doggy.name);
        }
    }
}
