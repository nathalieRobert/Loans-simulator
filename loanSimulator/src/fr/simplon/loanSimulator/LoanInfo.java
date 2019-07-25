package fr.simplon.loanSimulator;

import java.time.LocalDateTime;

public class LoanInfo {

    private double loanAmount;

    private String loantype;

    private LocalDateTime startDate;

    private int loanTerm;

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

    public void setLoanTerm(int loanTerm) {
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
	    System.out.println("you chose : Mortgage");
	    break;
	case "auto-loan":
	    System.out.println("you chose : Auto loan.");
	    break;
	case "construction":
	    System.out.println("you chose : Construction work loan");
	    break;
	}
    }

    public double interestCost() {
	return loanAmount * (interestRate / 100);
    }

    public double insuranceCost() {
	return loanAmount * (insuranceRate / 100);
    }

    // Calculation methods
    /**
     * @return payment per year
     */
    public double annuity() {
	return totalCostCalculation() / getLoanTerm();
    }

    public double dueAmount() {
	return annuity() + getInterestRate();
    }

    /**
     * @return loan total costs (loan amount + interest + insurance)
     */
    public double totalCostCalculation() {
	return loanAmount + (getInterestRate() * getLoanTerm())
		+ (getInsuranceRate() * getLoanTerm());
    }

    @Override
    public String toString() {
	return "LoanInfo [loanAmount=" + loanAmount + ", loantype=" + loantype
		+ ", startDate=" + startDate + ", loanTerm=" + loanTerm
		+ ", interestRate=" + interestRate + ", insuranceRate="
		+ insuranceRate + "]";
    }
}
