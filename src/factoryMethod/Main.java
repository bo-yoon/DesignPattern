package factoryMethod;

public class Main {
	public static void main(String [] args) {
		
		JuiceFactory factory = new JuiceFactory();
		
		Juice st = factory.maker("strawberry");
		st.flavor();
		
		Juice ba = factory.maker("banana");
		ba.flavor();
		
	}
}	



