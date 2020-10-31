package Decorator;

public abstract class Decorator implements Tea{
	
	protected Tea tea;
	
	public Decorator(Tea tea) {
		this.tea = tea;
	}
	
	@Override
	public abstract String show() ;
}
