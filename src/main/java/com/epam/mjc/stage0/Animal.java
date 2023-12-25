package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String furDescription = hasFur ? "a" : "no";
         String pawOrPaws = (numberOfPaws == 1) ? "paw" : "paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawOrPaws + " and " + furDescription + " fur.";
    }

    public static void main(String[] args) {
        // Creating an instance of the Animal class
        Animal myAnimal = new Animal("red", 3, true);

        // Calling the getDescription method on the instance
        System.out.println(myAnimal.getDescription());
    }
}
