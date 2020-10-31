package builder;

public class Waffle {

	private String cream = "";
	private String topping = "";
	private String sauce = "";
	public String getCream() {
		return cream;
	}
	public void setCream(String cream) {
		this.cream = cream;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void show() {
		System.out.println(cream + " " +
				 sauce + "소스 " + 
				topping + "토핑  " +
				"와플 "
		);  
	}
	
	
}
