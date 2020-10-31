package Composite;

import java.util.ArrayList;
import java.util.List;

public class KimchiRice implements Food {
	
	private List<Food> kimchiRice = new ArrayList<Food>();
	
	@Override
	public void print() {
		for(Food food: kimchiRice) {
			food.print();
		}
	}
	
	public void add(Food food) {
		kimchiRice.add(food);
	}
	
	public void eat(Food food) {
		kimchiRice.remove(food);
	}
}
