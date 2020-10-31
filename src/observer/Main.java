package observer;

public class Main {
	
	public static void main(String [] args) {
		
		Mail mail = new Mail();
		String sub [] = {"aa","bb"};
		
		Subscriber subscriber = null;
		
		for(String name : sub) {
				subscriber =  new Subscriber(name, mail);
		}
		
		mail.create("메일 보냄" );
		mail.deleteObserver(subscriber);
	}
}
