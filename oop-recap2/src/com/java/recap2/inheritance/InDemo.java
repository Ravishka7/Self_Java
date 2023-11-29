package com.java.recap2.inheritance;

public class InDemo {
    public static void main(String[] args) {
        MountainBicycle mb = new MountainBicycle(3, 100, 25);
        System.out.println(mb.gear);
        System.out.println(mb.speed);
        System.out.println(mb.seatHeight);

        mb.applyBrake(2);
        System.out.println(mb.speed);
        mb.speedUp(10);
        System.out.println(mb.speed);
    }
}
