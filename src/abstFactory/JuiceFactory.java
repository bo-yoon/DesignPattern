package abstFactory;

public class JuiceFactory implements BeverageFactory {
	
	@Override
	public Beverage maker(String kind) {
		kind = kind.toUpperCase();
		
		if(kind.equals("STRAWBERRY")) {
			return new StrawberryJuice();
		}else if(kind.equals("BANANA")){
			return new BananaJuice();
		}
		
		return null;
		
	}
}
