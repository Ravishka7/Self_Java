package com.ravi7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        String [] names = {"Ravi", "Raj", "Ramu"};

        int c = numbers[2];
        int b = numbers[numbers.length -1];

//        int [] numbers = new int[3];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        System.out.println(c);
        System.out.println(b); 
    }
}