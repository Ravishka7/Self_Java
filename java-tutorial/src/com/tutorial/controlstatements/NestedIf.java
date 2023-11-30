package com.tutorial.controlstatements;

public class NestedIf {
    public static void main(String[] args) {
        int weight = 50;

        if (weight == 50){
            System.out.println("Weight is: " + weight);
            if (weight < 60){
                System.out.println("You are healthy");
                if (weight < 55){
                    System.out.println("You are at your correct BMI");
                }
            }
        }



    }
}
