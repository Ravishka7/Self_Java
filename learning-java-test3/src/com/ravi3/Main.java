package com.ravi3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int count = 11;
//
//        while (count <= 10) {
//            System.out.println("Count is: " + count);
//            count++;
//        }
//        System.out.println("Count is: " + count);

//       Scanner scanner1 = new Scanner(System.in);
//       System.out.println("What is your name?");
//       String name = scanner1.nextLine();
//
//       System.out.println("What is your age?");
//       int age = scanner1.nextInt();
//       int year = LocalDate.now().minusYears(age).getYear();
//
//       System.out.println("Hey " +name+ ".Cool you are " +age+ ".Born in " +year+ " huh?");
//
//       if (age >= 21) {
//           System.out.println("So you can drink.");
//       }else {
//           System.out.println("Sorry dude just wait for " +(21-age)+ " years.");
//       }

        char [] letters = {'a', 'a', 'c', 'b', 'b', 'b'};

        int count = countOccurence(letters, 'a');
        System.out.println(count);
    }

    public static int countOccurence(char [] letters, char searchLetter) {
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
    }
        return count;
    }
}