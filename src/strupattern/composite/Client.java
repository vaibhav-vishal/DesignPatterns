package strupattern.composite;

public class Client {

	public static void main(String[] args) {
	Store s1 = new Store(5000, "A");
	Store s2 = new Store(15000, "B");
	Store s3 = new Store(30000, "C");
	State NCR = new State("NCR");
	City newDelhi = new City("NewDelhi");
	newDelhi.addLeaf(s1);
	newDelhi.addLeaf(s2);
	newDelhi.addLeaf(s3);
	NCR.addLeaf(newDelhi);
	Store s4 = new Store(15000, "A");
	Store s5 = new Store(25000, "B");
	Store s6 = new Store(30000, "C");
	City gurgaon = new City("Gurgaon");
	gurgaon.addLeaf(s4);
	gurgaon.addLeaf(s5);
	gurgaon.addLeaf(s6);
	NCR.addLeaf(gurgaon);
	System.out.println("Total Collection New Delhi : "+newDelhi.getProfit());
	System.out.println("Total Collection  guragon : "+gurgaon.getProfit());
	System.out.println("Total Collection  NCR : "+NCR.getProfit());
	}

}
