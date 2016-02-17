package crea.pattern.structural.decorator;

public class SocialNetworkBanking extends FeatureDecorator {
BankAccount account;

public SocialNetworkBanking(BankAccount account) {
	super(account);
this.account=account;
}

@Override
public double balanceToMaintain() {
		return account.balanceToMaintain()+10000.00;
}

}
