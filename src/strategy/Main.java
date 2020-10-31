package strategy;

public class Main {

	public static void main(String [] args) {
		
		User user = new Child(); // 학생 사용자 선언
		
		user.display();
		
		user.setExercise(new Swimming("케리비안베이","튜브"));
		user.doAct(5);
		
		user.setExercise(new Climbing("실내 체육관"));
		user.doAct(2);
		
	}
}
