package Facade;

public class Book {

	private boolean useBook = false;
	
	public void use() {
		useBook = true;
		System.out.println("책을 사용합니다.");
	}
	
	public void unUse() {
		useBook = false;
		System.out.println("책을 정리합니다.");
	}
}
