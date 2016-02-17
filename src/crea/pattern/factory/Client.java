package crea.pattern.factory;

import java.util.Calendar;

public class Client {

	public static void main(String[] args) {

		LoanAccount account = LoanFactory.getInstance();
		System.out.println("Loan Amount : 200000.00");
		System.out.println("personal Loan EMI : " + account.calculateEMI(200000.00, 2));
		System.out.println("Rate Interest" + account.getinterestRate());

		LoanAccount account2 = LoanFactory.getInstance(LoanType.HOUSINGLOAN);
		System.out.println("Loan Amount : 50000.00");
		System.out.println("Housing  Loan EMI : " + account2.calculateEMI(50000.00, 2));
		System.out.println("Rate Interest" + account2.getinterestRate());

	}

}
