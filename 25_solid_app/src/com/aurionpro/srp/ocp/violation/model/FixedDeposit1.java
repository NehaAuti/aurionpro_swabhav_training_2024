package com.aurionpro.srp.ocp.violation.model;

public class FixedDeposit1{
private int accountNumber;
private String name;
private double principle;
private int duration;
private FestivalType festival;
private IFestivalInterest festivalInterest;

public FixedDeposit1(int accountNumber, String name, double principle, int duration, IFestivalInterest festivalInterest) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.principle = principle;
    this.duration = duration;
    this.festivalInterest = festivalInterest;
}

// Getters and Setters
public int getAccountNumber() {
    return accountNumber;
}

public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getPrinciple() {
    return principle;
}

public void setPrinciple(double principle) {
    this.principle = principle;
}

public int getDuration() {
    return duration;
}

public void setDuration(int duration) {
    this.duration = duration;
}

public IFestivalInterest getFestivalInterest() {
    return festivalInterest;
}

public void setFestivalInterest(IFestivalInterest festivalInterest) {
    this.festivalInterest = festivalInterest;
}

public double getInterestRates() {
    return festivalInterest.getInterestRate();
}


public double calculateSimpleInterest() {
        //double interestRate = getInterestRates();
        return (principle* duration * getInterestRates()) / 100;
    }


}

