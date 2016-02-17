package crea.pattern.structural.decorator;

public class SavingsAccount extends BankAccount{

	@Override
	public double balanceToMaintain() {
		return 1000.0;
	}

}
