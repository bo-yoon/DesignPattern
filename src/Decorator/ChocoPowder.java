package Decorator;

public class ChocoPowder extends Decorator{
	
	
	public ChocoPowder(Tea _tea) {
		super(_tea);
	}
	
	@Override
	public String show() {
		return "chocoPowder " +tea.show();
	}
}
