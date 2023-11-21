package com.ravi1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(localDate);
        System.out.println(localDateTime);

        System.out.println(Math.abs(-20));
        System.out.println(Math.max(10.1,12.3));
        System.out.println(Math.min(12.4,54.9));
        System.out.println((int) Math.pow(2,3));
        System.out.println(Math.round(23.8));
        System.out.println((int) Math.sqrt(625));
        System.out.println(Math.PI);

        boolean isAdult = true;
        boolean isStudent = false;
        boolean isMember = true;
        String name = "Ravi";

        System.out.println( (isAdult || isStudent) && isMember && name.contains("R"));
        System.out.println( ( (isAdult || name.contains("i") || (isStudent && name.contains("a") ) && isMember)));

        int age = 21;
        boolean isNotSick = true;

        if (age >= 21 && isNotSick) {
            System.out.println("You can drink");
        }else if (age >= 18 && age < 21 && isNotSick){
            System.out.println("You are close enough to drink");
        }else {
            System.out.println("You can't drink");
        };

        String message = age >= 21 ?
                "You can drink" : "You can't drink";
        System.out.println(message);

        String gender = "female";

        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I'm a female");
                break;
            case "MALE":
                System.out.println("I'm a male");
                break;
            case "PREFER NOT TO SAY":
                System.out.println("Prefer not to say");
                break;
            default:
                System.out.println("I'm a robot");
        }


    }
}