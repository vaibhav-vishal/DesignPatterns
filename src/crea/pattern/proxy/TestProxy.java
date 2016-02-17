package crea.pattern.proxy;

public class TestProxy {
	public void callProxy(Subject sub)
	{
		sub.request();
	}
		public static void main(String[] args) {
	
			ProxySubject pxySub = new ProxySubject();
			
			TestProxy tpxy = new TestProxy();
			
			tpxy.callProxy(pxySub);
			
			
		}
}
