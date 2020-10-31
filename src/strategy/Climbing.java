package strategy;

public class Climbing implements Exercise {
	
	private String place; // 장소
	
	public Climbing(String place) {
		this.place = place;
	}
	
	@Override
	public void acting(int hours) {
		System.out.println(place + "에서 " +hours + "시간 동안 클라이밍함 "  );
	}
	
}
