package com.aurionpro.threads;

public class CallerThread implements Runnable {

    private String message;
    private CallMe target;
    private Thread thread;
    
    public CallerThread(String message, CallMe target) {
        this.message = message;
        this.target = target;
        this.thread = new Thread(this);
        this.thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        //synchronized (target) {
            target.Call(message);
       // }
    }
}

