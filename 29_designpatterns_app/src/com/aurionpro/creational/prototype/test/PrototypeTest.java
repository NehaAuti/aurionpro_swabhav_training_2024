package com.aurionpro.creational.prototype.test;

import com.aurionpro.creational.prototype.model.Contract;
import com.aurionpro.creational.prototype.model.Report;

public class PrototypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating initial documents
        Report report = new Report("Annual Report", "This is the content of the annual report.");
        Contract contract = new Contract("Company A", "Company B", "Terms and conditions.");

        // Cloning documents
        Report clonedReport = (Report) report.clone();
        Contract clonedContract = (Contract) contract.clone();

        // Modifying cloned documents
        clonedReport.setTitle("Modified Annual Report");
        clonedReport.setContent("This is the modified content of the annual report.");
        clonedContract.setTerms("Modified terms and conditions.");

        // Printing original and cloned documents
        System.out.println("Original Report:");
        report.print();

        System.out.println("\nCloned Report:");
        clonedReport.print();

        System.out.println("\nOriginal Contract:");
        contract.print();

        System.out.println("\nCloned Contract:");
        clonedContract.print();
    }
}

