package com.aurionpro.intrathreading;

import com.aurionpro.intrathreading.Q;

class Consumer implements Runnable {
    Q q;
    int maxIterations;

    Consumer(Q q, int maxIterations) {
        this.q = q;
        this.maxIterations = maxIterations;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (q.currentIterations < maxIterations) {
            if (q.get() == -1) {
                break; // Terminate when done
            }
        }
    }
}