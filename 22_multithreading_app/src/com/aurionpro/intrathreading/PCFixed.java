package com.aurionpro.intrathreading;

import com.aurionpro.intrathreading.Consumer;
import com.aurionpro.intrathreading.Producer;
import com.aurionpro.intrathreading.Q;

public class PCFixed {

    public static void main(String[] args) {
        int iterations = 10; // Number of iterations for producer and consumer
        Q q = new Q(iterations);
        new Producer(q, iterations);
        new Consumer(q, iterations);
        System.out.println("Press Control-C to stop.");
    }
}