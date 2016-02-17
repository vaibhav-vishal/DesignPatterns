package crea.pattern.structural;
/**
 * Adaptee
 */
public class BankAccount {

	private double principal;

	public BankAccount(double principal) {
		this.principal = principal;
	}

	public double calculate() {
		return principal * .1;
	}

}
