package templeteMethod;

public class WeekDayDoit extends AbstractDoit {
	
	@Override
	protected void primitive() {
		System.out.println("집가서 자기 ");
		System.out.println("게임 한 판 ");
	}
	
	@Override
	protected void hook() {
		System.out.println("그전에 퇴근 먼저");
	}
}
