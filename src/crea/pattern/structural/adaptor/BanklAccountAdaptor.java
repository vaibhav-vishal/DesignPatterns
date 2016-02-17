package crea.pattern.structural.adaptor;
import crea.pattern.structural.BankAccount;
import crea.pattern.structural.LifeInsurance;
/**
 * Adaptor
 */
public class BanklAccountAdaptor extends BankAccount {

	private LifeInsurance insurance;

	public BanklAccountAdaptor(double principal, LifeInsurance insurance) {
		super(principal);
		this.insurance = insurance;
	}

	public double findTotalDue() {
		double insDue = insurance.calculatePrimium();
		double bankDue = calculate();
		double totalDue = insDue + bankDue;
		return totalDue;
	}
}
