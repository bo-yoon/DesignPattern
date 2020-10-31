package builder;

public class Main {
	public static void main(String [] args) {
		Cook cook = new Cook();
		WaffleBuilder SWB = new StrawberryWaffleBuilder();
		WaffleBuilder CWB = new ChocoWaffleBuilder();
		
		cook.setWaffleBuilder(SWB);
		cook.constructWaffle();
		
		Waffle waffle = cook.getWaffle();
		
		waffle.show();
	}
}
