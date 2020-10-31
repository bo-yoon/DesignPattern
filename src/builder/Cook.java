package builder;

public class Cook {
	
	private WaffleBuilder waffleBuilder;
	
	public void setWaffleBuilder(WaffleBuilder waffleBuilder ) {
		this.waffleBuilder = waffleBuilder;
	}
	
	public Waffle getWaffle() {
		return waffleBuilder.getWaffle();
	}
	
	public void constructWaffle() {
		waffleBuilder.createNewWaffleProduct();
		waffleBuilder.buildCream();
		waffleBuilder.buildSauce();
		waffleBuilder.buildTopping();
	}
}
