package com.tutorial;

public class Main {
    public static void main(String[] args) {
        int marks = 50;
        char grade;

        if (marks >= 70){
            grade = 'A';
        } else if (marks >=60) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else if (marks >= 40) {
            grade = 'S';
        } else {
            grade = 'F';
        }

        System.out.println("Grade = " + grade);


        int age = -1;

        if (age >=18) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teenager");
        } else if (age >= 5) {
            System.out.println("Child");
        } else if (age >= 1) {
            System.out.println("Toddler");
        } else {
            System.out.println("Invalid age");
        }
    }
}