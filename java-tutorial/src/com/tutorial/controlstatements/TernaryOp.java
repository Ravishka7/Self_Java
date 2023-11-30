package com.tutorial.controlstatements;

public class TernaryOp {
    public static void main(String[] args) {
        int marks = 50;
        String result;

        result = marks >= 50 ? "Pass" : "Fail";

        System.out.println("Result = " + result);
        System.out.println();

        int age = 18;
        String status;

        status = age >= 18 ? "You can drink" : "You cannot drink";

        System.out.println("Status = " + status);
    }
}
