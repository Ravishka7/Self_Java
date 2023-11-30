package com.tutorial.loops;

public class While {
    public static void main(String[] args) {
        int count = 20;
        int math = 100;

        while (count >= 0){
            System.out.println("Count is " + count);
            count--;
        }
        System.out.println();

        while (math >=1){
            System.out.println("Math is " + math);
            math = math/2;
        }
    }
}
