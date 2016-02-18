package behavpattern.strategy;

public class CardPayment implements PaymentStrategy{
	

	@Override
	public String pay(double amt, String description) {
		String msg="\nYour Payment of INR."+amt+" by "+description+" is complete";
		StringBuffer buffer = new StringBuffer(msg);
		double processFee = amt*.012;
		double totalFee=processFee+amt;
		buffer.append("\nProcessing fee of Rs. "+processFee+" is chargable.");
		buffer.append("\nTotal fee Rs. "+totalFee+".");

		return buffer.toString();
	}
}
