package com.tutorial.loops;

public class DoWhile {
    public static void main(String[] args) {
        int count =1;

        do {
            System.out.println("Count is " + count);
            count++;
        } while (count<=10);

        System.out.println();

        do {
            System.out.println("Count is " + count);
            count++;
        }while (count<=10);
    }
}
