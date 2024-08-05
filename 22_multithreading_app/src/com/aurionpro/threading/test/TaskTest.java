package com.aurionpro.threading.test;

import com.aurionpro.threading.model.Task;

public class TaskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
		Thread thread = new Thread(new Task());
		//thread.setName("Thread1");
		thread.start();
		
		}

	}

}
