package com.aurionpro.intrathreading;

import com.aurionpro.intrathreading.Q;

class Producer implements Runnable {
    Q q;
    int maxIterations;

    Producer(Q q, int maxIterations) {
        this.q = q;
        this.maxIterations = maxIterations;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (q.currentIterations < maxIterations) {
            q.put(i++);
        }
    }
}