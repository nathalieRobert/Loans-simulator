package fr.simplon.loanSimulator;

/**
 * @author nathalie ROBERT
 */
public class AmortizedResult {

    private int year;

    private double amortization;

    private double interest;

    private double dueAmount;

    private double annuity;

    private double insurance;

    private double totalCost;

    LoanInfo li;

    // protected AmortizedResult(int year, double amortization, double interest,
    // double dueAmount, double annuity, double insurance,
    // double totalCost) {
    // super();
    // this.year = year;
    // this.amortization = amortization;
    // this.interest = interest;
    // this.dueAmount = dueAmount;
    // this.annuity = annuity;
    // this.insurance = insurance;
    // this.totalCost = totalCost;
    // }
    public int getYear() {
	return year;
    }

    public void setYear(int year) {
	this.year = year;
    }

    public double getAmortization() {
	return amortization;
    }

    public void setAmortization(double amortization) {
	this.amortization = amortization;
    }

    public double getInterest() {
	return interest;
    }

    public void setInterest(double interest) {
	this.interest = interest;
    }

    public double getDueAmount() {
	return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
	this.dueAmount = dueAmount;
    }

    public double getAnnuity() {
	return annuity;
    }

    public void setAnnuity(double annuity) {
	this.annuity = annuity;
    }

    public double getInsurance() {
	return insurance;
    }

    public void setInsurance(double insurance) {
	this.insurance = insurance;
    }

    public double getTotalCost() {
	return totalCost;
    }

    public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
    }

    // Calculation methods
    /**
     * @return payment per year
     */
    public double annuity() {
	return totalCostCalculation() / li.getLoanTerm();
    }

    public double dueAmount() {
	return annuity() + li.getInterestRate();
    }

    /**
     * @return loan total costs (loan amount + interest + insurance)
     */
    public double totalCostCalculation() {
	return (li.getInterestRate() * li.getLoanTerm())
		+ (li.getInsuranceRate() * li.getLoanTerm());
    }
}
