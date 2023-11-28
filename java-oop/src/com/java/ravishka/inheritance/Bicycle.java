package com.java.ravishka.inheritance;

public class Bicycle {

    protected int gear;
    protected int speed;

    public Bicycle(int startGear, int startSpeed) {
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
