package com.aurionpro.creational.abstractfactory.model;

import com.aurionpro.creational.abstractfactory.model.ICar;

public class Mahindra implements ICar{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(" Mahendra car is started.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(" Mahendra car is stoped.");
	}

}
