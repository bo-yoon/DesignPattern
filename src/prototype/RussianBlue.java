package prototype;

public class RussianBlue implements Cat {
	
	@Override
	public RussianBlue clone() {
		try {
			return (RussianBlue) super.clone();
		}catch(Exception e){
			return null;
		}
	}
	@Override
	public String toString() {
		return "RussianBlue";
	}
}
