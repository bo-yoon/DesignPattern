package Facade;

public class Pen {

	private boolean usePen = false;
	
	public void use() {
		usePen = true;
		System.out.println("팬을 사용합니다.");
	}
	
	public void unUse() {
		usePen = false;
		System.out.println("팬을 정리합니다.");
	}
}
