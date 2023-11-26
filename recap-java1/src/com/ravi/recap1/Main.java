package com.ravi.recap1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//       1.
       System.out.println("Hello");
        System.out.println("Alexandra Abramov");
        System.out.println();

        System.out.println("Hello\nAlexandra Abramov");
        System.out.println();

//        2.
        int a = 74;
        int b = 36;
        System.out.println(a + b);
        System.out.println();

        int sum = 74 + 36;
        System.out.println(sum);
        System.out.println();

//        3.
        int j = 50;
        int k = 3;
        System.out.println(j / k);
        System.out.println();

        int div = 50 / 3;
        System.out.println(div);
        System.out.println();

//        4.
        int o = -5 + (8 * 6);
        int p = (55 + 9) % 9;
        int q = 20 + ((-3*5) / 8);
        int r = 5 + 15/3*2 -8 % 3;

        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(o + "\n" + p + "\n" + q + "\n" + r);
        System.out.println();

//        5.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int l = scanner.nextInt();

        System.out.println("Enter second number: ");
        int m = scanner.nextInt();

        System.out.println(l + "x" + m + "=" + l * m);
        System.out.println();

//        6.
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int c = scanner2.nextInt();

        System.out.println("Enter second number: ");
        int d = scanner2.nextInt();

        System.out.println(c+ " + " +d+ " = " +(c+d));
        System.out.println(c+ " - " +d+ " = " +(c-d));
        System.out.println(c+ " x " +d+ " = " +(c*d));
        System.out.println(c+ " / " +d+ " = " +(c/d));
        System.out.println(c+ " mod " +d+ " = " +(c%d));
        System.out.println();

//        7.
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int e = scanner3.nextInt();

        for (int i = 1; i <= 15; i++) {
            System.out.println(e + " x " + i+ " = " + (e*i));
        }
        System.out.println();

//        8.
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        System.out.println();

//        9.
        double numerator = 25.5 * 3.5 - 3.5 * 3.5;
        double denominator = 40.5 - 4.5;
        double result = numerator / denominator;
        System.out.println(result);
        System.out.println();

//        10.
        double w = 1.0/3;
        double x = 1.0/5;
        double y = 1.0/7;
        double s = 1.0/9;
        double t = 1.0/11;
        double u = 1 - w + x - y + s - t;


        System.out.println(4.0 * u);


    }
}