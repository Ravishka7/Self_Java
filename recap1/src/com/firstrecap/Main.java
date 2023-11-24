package com.firstrecap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int age = 4;
        boolean isMember = false;
        int [] numbers = {1, 2, 3, 4, 5};
        String [] names = {"John", "Rane", "Jack", "Bill"};

        if (age >= 18 && isMember) {
            System.out.println("You are an adult with a membership");
        } else if (age >= 13 && isMember) {
            System.out.println("You are a teenager with a membership");
        } else if (age >= 6) {
            System.out.println("Go cry to your mom");
        } else if (!isMember) {
            System.out.println("Get your membership now!");
        } else {
            System.out.println("Invalid input.");
        }

        System.out.println("The numbers are: "+ Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < age; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = age; i > 0; i--) {
            System.out.println(numbers[i]);
        }

        for (String name : names) {
            if (name.equals("Jack")) {
                break;
            }
            System.out.println(name);
        }

        for (String name : names) {
            if (name.startsWith("J")) {
                continue;
            }
            System.out.println(name);
        }
    }
}