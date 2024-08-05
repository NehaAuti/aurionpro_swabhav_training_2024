package com.aurionpro.lsp.violation.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Start Work");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Stop Work");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Drink");
	}
}
