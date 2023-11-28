package com.java.recap1.inheritance;

public class Bicycle {
    protected String brand;
    protected String color;
    protected int speed;

    public Bicycle(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
}
