package com.java.recap1.inheritance;

public class InDemo {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike("KTM", "Red", 20, 5);

        System.out.println("Brand: " + mb.brand + "\n" +
                "Color: " + mb.color + "\n" +
                "Speed: " + mb.speed + "\n" +
                "Gear: " + mb.gear);

        mb.applyBrake(2);
        System.out.println("After applying brake, the speed is: " + mb.speed);

        mb.speedUp(10);
        System.out.println("After speeding up, the speed is: " + mb.speed);
    }
}
