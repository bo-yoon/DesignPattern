package templeteMethod;

public class Main {
	public static void main(String [] args) {
		
		AbstractDoit todo = new WeekDayDoit();
		todo.templeteMethod();
	}
}
