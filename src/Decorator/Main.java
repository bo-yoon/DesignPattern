package Decorator;

public class Main {
	public static void main(String [] args) {
		
		Tea tea = new BubbleTea();
		
		tea = new Suger(tea);
		tea = new ChocoPowder(tea);
		
		System.out.println(tea.show());
	}
}
