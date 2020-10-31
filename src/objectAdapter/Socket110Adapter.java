package objectAdapter;

public class Socket110Adapter implements Socket{

	private final Socket so;
	
	public Socket110Adapter() {
		so = new Socket110();
	}
	
	@Override
	public void useSocket() {
		so.useSocket();
	}
	
	
}
