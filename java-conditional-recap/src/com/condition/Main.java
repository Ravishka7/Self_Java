package com.condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Number is positive");
        } else if (number == 0){
            System.out.println("Please don't input 0, try another number");
        } else {
            System.out.println("Number is negative");
        }

        //2 Solve a quadratic equation

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scanner1.nextDouble();

        System.out.println("Input b: ");
        double b = scanner1.nextDouble();

        System.out.println("Input c: ");
        double c = scanner1.nextDouble();

        double discriminant = b*b - 4*a*c;

        if (discriminant > 0){
            double r1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("The roots are:\n" +r1+ "\n" +
                    r2);
        } else if (discriminant == 0) {
            double r = -b / (2*a);
            System.out.println("The root: " +r);
        } else {
            double realPart = -b / (2*a);
            double imaginaryPart = Math.sqrt(-discriminant)/ (2*a);
            System.out.println("Root 1: " + realPart + "+" +imaginaryPart+ "i");
            System.out.println("Root 1: " + realPart + "-" +imaginaryPart+ "i");
        }

        //3
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner2.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner2.nextInt();

        System.out.println("Enter third number: ");
        int num3 = scanner2.nextInt();

        if ( num1 > num2 && num1 > num3){
            System.out.println("The greatest: " + num1);
        } else if ( num2 > num1 && num2 > num3) {
            System.out.println("The greatest: " + num2);
        } else {
            System.out.println("The greatest: " + num3);
        }

        System.out.println();

//        if (num1 > num2)
//            if (num1 > num3)
//                System.out.println(num1);
//
//        if (num2 > num1)
//            if (num2 > num3)
//                System.out.println(num2);
//
//        if (num3 > num1)
//            if (num3 > num2)
//                System.out.println(num3);
    }
}