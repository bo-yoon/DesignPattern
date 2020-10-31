package strategy;

public class Swimming implements Exercise {
	
	private String place;
	private String things;
	
	public Swimming(String place, String things) {
		this.place = place;
		this.things = things;
	}
	
	@Override
	public void acting(int hours) {
		System.out.println(hours +"시간 동안 " + place + "에서 " +things +
				"을 가지고 수영");
	}
}
