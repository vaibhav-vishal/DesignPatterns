package crea.pattern.factory;
//SubClass-II - Product-II
public class PersonalLoan extends LoanAccount{

	private double processingFees;

	protected PersonalLoan(double rateIntrest) {
		super(rateIntrest);
		this.processingFees=2000;
	}
	 
	@Override
	public double calculateEMI(double loanAmount,double tenure) {

	return (loanAmount*getinterestRate()*tenure)+processingFees;
	}


}
