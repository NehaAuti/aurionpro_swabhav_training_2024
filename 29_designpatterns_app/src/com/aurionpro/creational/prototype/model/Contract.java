package com.aurionpro.creational.prototype.model;

public class Contract implements Document {
    private String partyA;
    private String partyB;
    private String terms;

    public Contract(String partyA, String partyB, String terms) {
        this.partyA = partyA;
        this.partyB = partyB;
        this.terms = terms;
    }

    @Override
    public Document clone() {
        return new Contract(partyA, partyB, terms);
    }

    @Override
    public void print() {
        System.out.println("Contract between: " + partyA + " and " + partyB);
        System.out.println("Terms: " + terms);
    }

    public String getPartyA() {
        return partyA;
    }

    public void setPartyA(String partyA) {
        this.partyA = partyA;
    }

    public String getPartyB() {
        return partyB;
    }

    public void setPartyB(String partyB) {
        this.partyB = partyB;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "partyA='" + partyA + '\'' +
                ", partyB='" + partyB + '\'' +
                ", terms='" + terms + '\'' +
                '}';
    }
}
