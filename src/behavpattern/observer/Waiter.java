package behavpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		String msg = null;
		if(o instanceof MealOrder)
		{
			msg=(String)arg;
		}
		if(msg.equals("accepted")){
			System.out.println("Order Accepted.");
		}
		if(msg.equals("completed")){
			System.out.println("Meal Prepared. Collect from Kitchen for service.");
		}
		if(msg.equals("pending")){
			System.out.println("Order request in process.");
		}
	}

}
