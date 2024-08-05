package com.aurionpro.model;

public class VehiclePrice extends VehicleMilage{
	private int price;

	public VehiclePrice(String companyNmae, int milage, int price) {
		super(companyNmae, milage);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VehiclePrice [price=" + price + ", getPrice()=" + getPrice() + ", getMilage()=" + getMilage()
				+ ", getCompanyNmae()=" + getCompanyNmae() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
