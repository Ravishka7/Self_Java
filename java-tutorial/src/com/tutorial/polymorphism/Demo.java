package com.tutorial.polymorphism;

public class Demo {
    public static void main(String[] args) {
        AnimalSounds animal = new AnimalSounds();
        Cow cow = new Cow();
        Dog dog = new Dog();
        animal.Sound();
        cow.Sound();
        dog.Sound();
    }
}
