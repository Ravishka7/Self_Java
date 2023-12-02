package com.condition;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input for a: ");
        double a = sc.nextDouble();

        System.out.println("Input for b: ");
        double b = sc.nextDouble();

        System.out.println("Input for c: ");
        double c = sc.nextDouble();

        double dis = b*b - 4*a*c;

         if (dis > 0) {
             double r1 = (-b + Math.sqrt(dis))/(2*a);
             double r2 = (-b - Math.sqrt(dis))/(2*a);
             System.out.println("The roots are: " +r1+ "and" +r2);
         } else if (dis == 0) {
             double r = -b/(2*a);
             System.out.println("The root is: " +r);
         } else {
             System.out.println("The equation has no real roots");
         }
    }
}
