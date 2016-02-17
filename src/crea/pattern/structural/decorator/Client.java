package crea.pattern.structural.decorator;

public class Client {

	public static void main(String[] args) {
		OnlineBanking acc = new OnlineBanking(new SavingsAccount());
		System.out.println(acc.balanceToMaintain());
		
		BankAccount acc2 = new SocialNetworkBanking(new OnlineBanking(new SavingsAccount()));
		System.out.println(acc2.balanceToMaintain());

	}

}
