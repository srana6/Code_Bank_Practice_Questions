package com.javaLogic.inheritence;

/**
 * Created by macbook on 6/16/17.
 */
class Animal{
    public int minSizeOfAnimal(){
        return 1;
    }
    public void xyz(){
        System.out.println("XYZ");
    }
}
public class InheritenceTest2 extends Animal{

    @Override
    public int minSizeOfAnimal() {
        /**
         * Purpose of this exaple was to see that can we asign return value from the super class
         * to some variable and use it later on.
         * RESULT- Yes we can do
         */
        int minSize = super.minSizeOfAnimal();
        System.out.println("The min size of dog is:::"+minSize);
        return minSize;
    }

    public void childMethod(){
        System.out.println("Child");
    }

    public static void main(String[] args) {
       /* InheritenceTest2 in = new InheritenceTest2();
        System.out.println(in.minSizeOfAnimal());*/

        Animal a = new InheritenceTest2();
        a.xyz();
        a.minSizeOfAnimal();

    }

}
