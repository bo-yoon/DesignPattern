package abstFactory;

public class Main {
	public static void main(String [] args) {
		
		BeverageFactory fac = new CoffeeFactory();
		
		Beverage coffee = fac.maker("americano");
		
		coffee.flavor();
		
		fac = new JuiceFactory();
		
		Beverage juice = fac.maker("banana");
		juice.flavor();
		
		
		
	}
}
