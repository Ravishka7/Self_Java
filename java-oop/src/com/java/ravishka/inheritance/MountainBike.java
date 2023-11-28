package com.java.ravishka.inheritance;

public class MountainBike extends Bicycle{
     public int seatHeight;

    public MountainBike(int startHeight, int startGear, int startSpeed) {
        super(startGear, startSpeed);
        this.seatHeight = startHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
