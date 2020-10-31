package abstFactory;

public class CoffeeFactory implements BeverageFactory {
	
	@Override
	public Beverage maker(String kind) {
		 
			kind =  kind.toUpperCase();
			
			if(kind.equals("AMERICANO")) {
				return new Americano();
			}
		
			return null;
	}
}
