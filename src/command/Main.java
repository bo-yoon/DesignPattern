package command;

public class Main {
	public static void main(String [] args) {
		CarMove cm = new CarMove(new Car());
		
		Controller con = new Controller();
		con.setCommand(cm);
		con.pushGo();
		con.pushBack();
	}
}
