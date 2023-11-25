package com.ravi4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Lens lens1 = new Lens("Sony", "50mm", true);
        Lens lens2 =new Lens("Canon", "40mm", true);
        Lens lens3 = new Lens("Nikon", "24mm-70mm", false);

        System.out.println("Lens1");
        System.out.println(lens1.brand);
        System.out.println(lens1.focalLength);
        System.out.println(lens1.isPrime);
        System.out.println();

        System.out.println("Lens2");
        System.out.println(lens2.brand);
        System.out.println(lens2.focalLength);
        System.out.println(lens2.isPrime);
        System.out.println();

        System.out.println("Lens3");
        System.out.println(lens3.brand);
        System.out.println(lens3.focalLength);
        System.out.println(lens3.isPrime);
        System.out.println();

        Passport passport1 = new Passport("Sri Lanka", "PLKA123456", LocalDate.of(2027,12,28));
        Passport passport2 = new Passport("India", "INDA123456", LocalDate.of(2025,12,28));
        Passport passport3 = new Passport("USA", "USAA123456", LocalDate.of(2023,12,28));

        System.out.println("Passport1");
        System.out.println(passport1.country);
        System.out.println(passport1.number);
        System.out.println(passport1.expiryDate);
        System.out.println();

        System.out.println("Passport2");
        System.out.println(passport2.country);
        System.out.println(passport2.number);
        System.out.println(passport2.expiryDate);
        System.out.println();

        System.out.println("Passport3");
        System.out.println(passport3.country);
        System.out.println(passport3.number);
        System.out.println(passport3.expiryDate);

    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }

    static class Passport {
        String country;
        String number;
        LocalDate expiryDate;

        Passport(String country, String number, LocalDate expiryDate) {
            this.country = country;
            this.number = number;
            this.expiryDate = expiryDate;
        }
    }
}