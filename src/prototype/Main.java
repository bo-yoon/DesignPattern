package prototype;

public class Main {
	public static void main(String [] args) {
		
		Prototype pro = new Prototype(new RussianBlue(), new Siamese());
		
		RussianBlue blue = pro.getRb();
		Siamese si = pro.getSiam();
		
		System.out.println(blue);
		System.out.println(si);
		
	}
}


