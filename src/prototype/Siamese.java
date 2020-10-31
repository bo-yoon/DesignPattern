package prototype;

public class Siamese implements Cat{
	@Override
	public Siamese clone() {
		try {
			return (Siamese) super.clone();
		}catch(Exception e){
			return null;
		}
	}
	@Override
	public String toString() {
		return "Siamese Cat";
	}
}
