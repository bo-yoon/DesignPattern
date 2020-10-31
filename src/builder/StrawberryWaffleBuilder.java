package builder;

public class StrawberryWaffleBuilder extends WaffleBuilder{
	
	
	public void buildCream() {
		waffle.setCream("soft iceCream");
	}
	public void buildSauce() {	
		waffle.setSauce("strawberry");
	}
	public void buildTopping() {
		waffle.setTopping("strawberry");
	}
	
}
