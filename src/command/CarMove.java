package command;

public class CarMove implements Command{
	Car car;
	
	public CarMove(Car car) {
		this.car = car;
	}
	
	@Override
	public void execute() {
		car.go();
	}
	
	@Override
	public void undo() {
		car.back();
	}
}
