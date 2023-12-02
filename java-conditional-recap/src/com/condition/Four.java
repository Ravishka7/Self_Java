package com.condition;

import java.util.Scanner;

public class Four {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        float input = sc.nextFloat();
        
        if (input > 0){
            if (input < 1){
                System.out.println("Positive Small");
            } else if (input > 1000000) {
                System.out.println("Positive Large");
            }else {
                System.out.println("Positive");
            }
        } else if (input < 0) {
            if (Math.abs(input) < 1){
                System.out.println("Negative Small");
            } else if (Math.abs(input) > 1000000) {
                System.out.println("Negative Large");
            }else {
                System.out.println("Negative");
            }
        }else {
            System.out.println("Zero");
        }
    }
}
