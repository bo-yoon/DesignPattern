package strategy;

public abstract class User {

	// 여기에 인터페이스로 선언한 행위의 대단위를 선
	private Exercise exec;
	
	public User() {
		 
	}
	
	public void setExercise(Exercise exec) {
		this.exec = exec;
	}
	
	public void  doAct(int hours) {
		exec.acting(hours);
	}
	
	public abstract void display();
}
