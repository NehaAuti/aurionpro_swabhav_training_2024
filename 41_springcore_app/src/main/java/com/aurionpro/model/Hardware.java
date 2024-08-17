package com.aurionpro.model;

public class Hardware {
 
	private String name;
	private Hardisk hardisk;
	public Hardware(String name, Hardisk hardisk) {
		super();
		this.name = name;
		this.hardisk = hardisk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hardisk getHardisk() {
		return hardisk;
	}
	public void setHardisk(Hardisk hardisk) {
		this.hardisk = hardisk;
	}
	@Override
	public String toString() {
		return "Hardware [name=" + name + ", hardisk=" + hardisk + "]";
	}
}