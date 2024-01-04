package com.tutorial.interf;

public class Demo {
    public static void main(String[] args) {

        MountainBike bike = new MountainBike(5,6,7);
        System.out.println("Gear: "+bike.getGear());
        System.out.println("Seat height: "+bike.getHeight());
        System.out.println("Speed: "+bike.getSpeed());
        System.out.println();

        bike.deSpeed(2);
        System.out.println("Speed: "+bike.getSpeed());
        System.out.println();

        bike.inSpeed(7);
        System.out.println("Speed: "+bike.getSpeed());

        bike.haveTwoWheels();
        bike.drive();

    }
}
