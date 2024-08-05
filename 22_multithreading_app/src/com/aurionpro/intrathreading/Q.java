package com.aurionpro.intrathreading;

class Q {
    int n;
    boolean valueSet = false;
    int maxIterations;
    int currentIterations = 0;

    Q(int maxIterations) {
        this.maxIterations = maxIterations;
    }

    synchronized int get() {
        while (!valueSet && currentIterations < maxIterations) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        if (currentIterations >= maxIterations) return -1; // Termination condition

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet && currentIterations < maxIterations) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        if (currentIterations >= maxIterations) return; // Termination condition

        this.n = n;
        valueSet = true;
        currentIterations++;
        System.out.println("Put: " + n);
        notify();
    }
}