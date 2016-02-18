package behavpattern.observer;

public class client {

	public static void main(String[] args) {
		MealOrder order = new MealOrder();
		order.addObserver(new Waiter());
	
		order.setStatus("pending");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		order.setStatus("accepted");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		order.setStatus("completed");

	}
}
