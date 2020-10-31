package builder;

// 추상 빌더 
public abstract class WaffleBuilder {
	
	protected Waffle waffle;
	
	public Waffle getWaffle() {
		return waffle;
	}
	
	public void createNewWaffleProduct() {
		waffle = new Waffle();
	}
	

	public abstract void buildCream();
	public abstract void buildSauce();
	public abstract void buildTopping();
	
}
