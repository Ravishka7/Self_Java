package com.tutorial.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Germany");
        queue.add("England");
        queue.add("India");
        queue.add("America");

        System.out.println(queue);

        queue.remove();
        System.out.println(queue);

        String head = queue.peek();
        System.out.println(head);

        head = queue.poll();
        System.out.println(head);
        System.out.println(queue);
    }
}
