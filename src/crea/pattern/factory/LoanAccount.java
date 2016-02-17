package crea.pattern.factory;
//Super Type -Super Class
public abstract class LoanAccount {

	private double interestRate;

	public LoanAccount(double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	public abstract  double calculateEMI(double loanAmount,double tenure);

	 public double getinterestRate() {
	         return interestRate;
	}

	
}
