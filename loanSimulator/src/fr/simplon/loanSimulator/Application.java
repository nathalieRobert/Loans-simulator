package fr.simplon.loanSimulator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
	LoanInfo loanInfoInput = new LoanInfo();
	AmortizedResult amortization = new AmortizedResult();
	try (Scanner scanner = new Scanner(System.in)) {
	    System.out.print("Please insert loan amount : ");
	    loanInfoInput.setLoanAmount(scanner.nextInt());
	    scanner.nextLine();
	    System.out.print(
		    "Choose your loan type (mortgage, auto-loan or construction) : ");
	    loanInfoInput.setLoantype(scanner.nextLine());
	    loanInfoInput.loanTypeChoice(loanInfoInput.getLoantype());
	    scanner.nextLine();
	    // System.out.printf("Please insert start date : ");
	    // loanInfoInput.setStartDate(LocalDateTime.parse(scanner.next()));
	    // scanner.nextLine();
	    System.out.print("Please insert interest rate : ");
	    loanInfoInput.setInterestRate(scanner.nextDouble());
	    scanner.nextLine();
	    System.out.print("Please insert insurance rate : ");
	    loanInfoInput.setInsuranceRate(scanner.nextDouble());
	}
    }
}
