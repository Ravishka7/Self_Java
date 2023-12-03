package com.tutorial.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        System.out.println(map);
        System.out.println("Size of the map = " +map.size());

        if (map.containsKey("a")){
            Integer a = map.get("a");
            System.out.println("Value for key " + "\"a\" is " + a);
        }

        for (String key : map.keySet()) {
            System.out.println("Key: " +key+ ", Value: " + map.get(key));
        }
        System.out.println();

        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("Key " + entry.getKey()+ ", Value " + entry.getValue());
        }
    }
}
