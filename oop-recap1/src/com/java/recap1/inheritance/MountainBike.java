package com.java.recap1.inheritance;

public class MountainBike extends Bicycle{

    public int gear;

    public MountainBike(String brand, String color, int speed, int gear) {
        super(brand, color, speed);
        this.gear = gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
