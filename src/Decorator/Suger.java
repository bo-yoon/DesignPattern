package Decorator;

public class Suger extends Decorator{
	
	public Suger(Tea _tea) {
		super(_tea);
	}
	
	@Override
	public String show() {
		return "당도up " + tea.show();
	}
}
