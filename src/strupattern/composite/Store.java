package strupattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Store implements Profitable {
private double profit;
private String storename;
private List<Profitable> profitList;


	public Store(double profit, String storename) {
	super();
	this.profit = profit;
	this.storename = storename;

}

	@Override
	public double getProfit() {
	
		return this.profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		
		
	}

	@Override
	public void removeLeaf(Profitable Child) {
		// TODO Auto-generated method stub
		
	}

}
