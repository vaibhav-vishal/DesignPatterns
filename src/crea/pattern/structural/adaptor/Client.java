package crea.pattern.structural.adaptor;

import crea.pattern.structural.LifeInsurance;

public class Client {

	public static void main(String[] args) {
		BanklAccountAdaptor adaptor = new BanklAccountAdaptor(50000, new LifeInsurance(60000));
		System.out.println("Total Due : "+adaptor.findTotalDue());
		
	}

}
