package crea.pattern.factory;
//SubClass-I - Product-I
public class HousingLoan extends LoanAccount {

	protected HousingLoan(double rateIntrest) {
	      super(rateIntrest);
	}

	@Override
	public double calculateEMI(double loanAmount,double tenure) {

	         return (loanAmount*getinterestRate()*tenure);
	}


}
