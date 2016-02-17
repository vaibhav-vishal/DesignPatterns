package crea.pattern.proxy;

public class ProxySubject implements Subject  {
	Subject sub;

	public void request() {
		
		sub = new RealSubject();
		System.out.println("Calling RealSubject");
		
		sub.request();
		
	}

}
