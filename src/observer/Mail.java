package observer;

import java.util.Observable;

public class Mail extends Observable {
		
	private String contents;
	
	public Mail() { }
	
	public  void notifyChanges() {
		setChanged();
		notifyObservers();
	}
	
	public void create(String contents) {
		this.contents = contents;
		notifyChanges();
	}
	
	public String getContent() {
		return contents;
	}

}
