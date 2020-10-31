package observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {
	
	private String name;
	
	public Subscriber(String name, Observable observable) {
		this.name = name;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object org) {
		if(obs instanceof Mail) {
			System.out.println("구독자" +name + "가 "+ obs  
					+ " 를 들었다.");
		}
	}
}
