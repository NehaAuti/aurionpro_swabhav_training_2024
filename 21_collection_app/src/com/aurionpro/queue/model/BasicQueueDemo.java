package com.aurionpro.queue.model;

import java.util.LinkedList;
import java.util.Queue;

public class BasicQueueDemo {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

       
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        
        System.out.println("Queue: " + queue);

        // Dequeue elements (remove elements from the queue)
        System.out.println("Dequeued: " + queue.poll()); // Removes 10
        System.out.println("Dequeued: " + queue.poll()); // Removes 20

        // Display the queue after dequeue operations
        System.out.println("Queue after dequeue operations: " + queue);

        // Peek at the front of the queue (without removing it)
        System.out.println("Front of the queue: " + queue.peek());
        
        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Get the size of the queue
        System.out.println("Size of the queue: " + queue.size());
    }
}