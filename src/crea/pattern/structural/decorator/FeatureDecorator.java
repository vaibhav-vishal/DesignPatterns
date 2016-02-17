package crea.pattern.structural.decorator;

/**
 * decorator
 * 
 * @author vvish4
 *
 */
public abstract class FeatureDecorator extends BankAccount {
	private BankAccount account;

	public FeatureDecorator(BankAccount account) {
		super();
		this.account = account;
	}

}
