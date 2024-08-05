package com.aurionpro.intathreading.test;

import com.aurionpro.intathreading.test.Consumer;
import com.aurionpro.intathreading.test.Producer;
import com.aurionpro.intathreading.test.Q;

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        int iterations = 10; // Number of iterations for producer and consumer
        new Producer(q, iterations);
        new Consumer(q, iterations);
        System.out.println("Press Control-C to stop.");
    }
}