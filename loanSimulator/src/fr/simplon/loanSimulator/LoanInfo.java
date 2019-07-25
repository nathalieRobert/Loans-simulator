package fr.simplon.loanSimulator;

import java.time.LocalDateTime;

public class LoanInfo {

    private double loanAmount;

    private String loantype;

    private LocalDateTime startDate;

    private double loanTerm;

    private double interestRate;

    private double insuranceRate;

    public double getLoanAmount() {
	return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
    }

    public String getLoantype() {
	return loantype;
    }

    public void setLoantype(String loantype) {
	this.loantype = loantype;
    }

    public LocalDateTime getStartDate() {
	return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
	this.startDate = startDate;
    }

    public double getLoanTerm() {
	return loanTerm;
    }

    public void setLoanTerm(double loanTerm) {
	this.loanTerm = loanTerm;
    }

    public double getInterestRate() {
	return interestRate;
    }

    public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
    }

    public double getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
	this.insuranceRate = insuranceRate;
    }

    public void loanTypeChoice(String loantype) {
	switch (loantype) {
	case "mortgage":
	    System.out.println("Mortgage");
	    break;
	case "auto-loan":
	    System.out.println("Auto loan.");
	    break;
	case "construction":
	    System.out.println("Construction work");
	    break;
	}
    }

    public double interestRate() {
	return loanAmount * (interestRate / 100);
    }

    public double insuranceRate() {
	return loanAmount * (insuranceRate / 100);
    }
}
