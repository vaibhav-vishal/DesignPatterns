package behavpattern.strategy;

public class CashPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		String msg="\nYour Payment of INR."+amt+" from "+description+" is recieved in Cash.";
		StringBuffer buffer = new StringBuffer(msg);
		double cashDiscount =(amt*.012);
		double totalFee=amt-cashDiscount;
		buffer.append("\nCash Discount of Rs. "+cashDiscount+" is applicable.");
		buffer.append("\nTotal fee after discount Rs. "+totalFee+".");

		return buffer.toString();
	
	}

}
