package com.tutorial.collections;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,Character> map = new TreeMap<>();

        map.put(3,'A');
        map.put(1,'B');
        map.put(2,'C');

        System.out.println(map);

        for (Integer key: map.keySet()) {
            System.out.println("Key: " +key+ ", Value: " +map.get(key));
        }
    }
}
