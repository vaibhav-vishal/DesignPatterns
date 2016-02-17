package crea.pattern.singleton;

public class Counter {
private static Counter count;
private static int count1;
private Counter() {
count1=100;
}


@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return count1;
}


public synchronized static Counter getInstance(){
	if(count==null){
		count = new Counter();
	}
	count1++;
	return count;
}
}
