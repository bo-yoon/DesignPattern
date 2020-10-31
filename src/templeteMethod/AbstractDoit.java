package templeteMethod;

public abstract class AbstractDoit {
	
	protected abstract void primitive();
	
	protected abstract void hook();
	
	public void templeteMethod() {
		
		primitive();
		hook();
		
	}
}
