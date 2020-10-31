package interAdapter;

public class TeddyBear implements Doll{
	
	@Override
	public void play() {
		System.out.println("테디베어 가지고 놀기 ");
	}
	
	public void hug() {
		System.out.println("hug~~");
		
	}
}
