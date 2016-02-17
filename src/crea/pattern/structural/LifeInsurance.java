package crea.pattern.structural;
/**
 * Adaptee
 */
public class LifeInsurance {

	private double policyAmount;

	public LifeInsurance(double policyAmount) {
		super();
		this.policyAmount = policyAmount;
	}

	public double calculatePrimium() {
		return policyAmount * .25;
	}
}
