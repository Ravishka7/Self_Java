package com.tutorial.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        System.out.println(list);

        list.addFirst("C");
        System.out.println(list);

        list.addLast("D");
        System.out.println(list);

        list.add(2,"E");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.add("H");
        System.out.println(list);


        System.out.println(list.get(2));


    }
}
