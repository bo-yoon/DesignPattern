package command;

public class Controller {
	Command cmd;
	
	public Controller() { }
	
	public void setCommand(Command cmd) {
		this.cmd = cmd;
	}
	
	public void pushGo() {
		cmd.execute();
	}
	public void pushBack() {
		cmd.undo();
	}
}
