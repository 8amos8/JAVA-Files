package heritageAndPolymorphism.entities;

public class BusinessAccount extends Account { 
	//this extends relates this class to account. all its attributes will be imported into this class
	private Double LoanLimit;
	
	public BusinessAccount() {
		super(); // the SUPER is to execute the base class constructor logic
	}

	//First use super -> just for case of heritage in constructors using fields
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		LoanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return LoanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		LoanLimit = loanLimit;
	}
	public void loan(double amount) {
		if (amount <= LoanLimit) {
			balance += amount - 10.0;
		}
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
