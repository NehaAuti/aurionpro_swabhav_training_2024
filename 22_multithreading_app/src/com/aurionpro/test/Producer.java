package com.aurionpro.test;

class Producer implements Runnable {
    Q q;
    private int iterations;

    Producer(Q q, int iterations) {
        this.q = q;
        this.iterations = iterations;
        new Thread(this, "Producer").start();
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            q.put(i);
        }
    }
}