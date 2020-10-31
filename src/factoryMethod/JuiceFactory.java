package factoryMethod;

public class JuiceFactory extends DrinkFactory{
	
	public Juice maker(String juice) {
		juice = juice.toUpperCase();
		
		if(juice.equals("STRAWBERRY")) {
			return new StrawberryJuice();
		}else if(juice.equals("BANANA")){
			return new BananaJuice();
		}
		
		return null;
		
	}
}
