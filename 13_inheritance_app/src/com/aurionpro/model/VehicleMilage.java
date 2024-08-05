package com.aurionpro.model;

public class VehicleMilage extends Vehicle {
	private double milage;

	public VehicleMilage(String companyNmae, int milage) {
		super(companyNmae);
		this.milage = milage;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}
	

}
