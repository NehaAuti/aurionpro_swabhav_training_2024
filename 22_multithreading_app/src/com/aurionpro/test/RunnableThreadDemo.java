package com.aurionpro.test;

import com.aurionpro.threads.RunnableThread;

public class RunnableThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RunnableThread thread1 = new RunnableThread("Thread1");
         try {
			thread1.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
//        Thread thread1 = new Thread (new RunnableThread("thread1"));
//        thread1.start();
	}

}
