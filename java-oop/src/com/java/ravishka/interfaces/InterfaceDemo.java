package com.java.ravishka.interfaces;

public class InterfaceDemo {

    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 5, 25);
        System.out.println("Gear:" + mb.getGear() + "\n" +
                "Speed:" + mb.getSpeed() + "\n" +
                "Seat Height:" + mb.getSeatHeight());

        mb.applyBrake(2);
        System.out.println("After applying brake, the speed is: " + mb.getSpeed());

        mb.speedUp(10);
        System.out.println("After speeding up, the speed is: " + mb.getSpeed());
    }
}
