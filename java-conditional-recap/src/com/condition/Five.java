package com.condition;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number between 1-7: ");
        int day = sc.nextInt();

        System.out.println("Day is " + getDayName(day));

    }

    public static String getDayName(int day) {
        String dayName;

        switch (day) {
            case 1: dayName = "Monday";
            break;
            case 2: dayName = "Tuesday";
            break;
            case 3: dayName = "Wednesday";
            break;
            case 4: dayName = "Thursday";
            break;
            case 5: dayName = "Friday";
            break;
            case 6: dayName = "Saturday";
            break;
            case 7: dayName = "Sunday";
            break;
            default:dayName = "Invalid number";
            break;
        }
        return dayName;
    }
}
