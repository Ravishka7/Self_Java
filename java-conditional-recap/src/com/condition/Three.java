package com.condition;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int n3 = sc.nextInt();

        if (n1>n2 & n1>n3){
            System.out.println("The greatest: " +n1);
        } else if (n2>n1 & n2>n3) {
            System.out.println("The greatest: " +n2);
        }else {
            System.out.println("The greatest: " +n3);
        }
    }
}
