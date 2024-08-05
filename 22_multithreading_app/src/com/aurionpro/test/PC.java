package com.aurionpro.test;
import com.aurionpro.test.Q;
public class PC {

    public static void main(String[] args) {
        Q q = new Q();
        int iterations = 10; // Number of iterations for producer and consumer
        new Producer(q, iterations);
        new Consumer(q, iterations);
        System.out.println("Press Control-C to stop.");
    }
}