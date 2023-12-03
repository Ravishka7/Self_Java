package com.tutorial.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        boolean r1 = set.add("C");
        System.out.println(r1);
        boolean r2 = set.add("C");
        System.out.println(r2);
        System.out.println(set);

        System.out.println("Set contains A? " + set.contains("A"));

        set.remove("A");
        System.out.println(set);

        for (String item : set) {
            System.out.print(item + " ");
        }
    }
}
