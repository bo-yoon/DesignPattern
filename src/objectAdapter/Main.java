package objectAdapter;

public class Main {
	public void main(String [] args) {
		Socket so = new Socket220();
		so.useSocket();
		
		
		so = new Socket110Adapter();
		so.useSocket();
	}
}	
