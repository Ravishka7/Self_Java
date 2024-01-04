package com.tutorial.interf;

public class MountainBike extends TwoWheel implements Bicycle, Vehicle{
    private int gear;
    private int height;
    private int speed;

    public MountainBike(int gear, int height, int speed) {
        this.gear = gear;
        this.height = height;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public void inSpeed(int increment){
        speed = speed+increment;
    }
    @Override
    public void deSpeed(int decrement){
        speed = speed-decrement;
    }
    @Override
    public void drive(){
        System.out.println("Can be driven");
    }
}
