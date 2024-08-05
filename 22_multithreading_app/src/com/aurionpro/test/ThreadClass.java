package com.aurionpro.test;

public class ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		thread.setName("MyThread");
		System.out.println(thread);
		
		for(int i=0;i<5;i++) 
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		    try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
