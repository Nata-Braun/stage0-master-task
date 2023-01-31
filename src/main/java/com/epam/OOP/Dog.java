package com.epam.OOP;

public class Dog extends Animal {
    public Dog() throws IllegalArgumentException {
        super( "brown", 4, true);

    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    Dog dog = new Dog();

}
