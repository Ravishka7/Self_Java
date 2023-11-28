package com.java.ravishka.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 5, 25);
        System.out.println("Gear: " + mb.gear + "\n" +
                "Speed: " + mb.speed + "\n" +
                "Seat Height: " +mb.seatHeight);

        mb.applyBrake(2);
        System.out.println("After applying brake, the speed is: " + mb.speed);

        mb.speedUp(10);
        System.out.println("After speeding up, the speed is: " + mb.speed);
    }
}
