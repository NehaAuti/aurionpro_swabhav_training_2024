package com.aurionpro.intathreading.test;

//import com.aurionpro.test.Q;

class Consumer implements Runnable {
    Q q;
    private int iterations;

    Consumer(Q q, int iterations) {
        this.q = q;
        this.iterations = iterations;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            q.get();
        }
    }
}