package singleton;

public class Main {
	public static void main(String [] args) {
		
		
		// 일반 싱글
		Refrigerator ref1 = Refrigerator.getInstance();
		// 이렇게 이미 정적으로 객체가 할당된 자원을 호출하여 사용한다.
		ref1.display();
		
		
		// eager
		EagerRefrigerator ref2 = EagerRefrigerator.getInstance();
		ref2.display();
		
		// Sync
		SyncRefrigerator ref3 = SyncRefrigerator.getInstance();
		ref3.display();
		
		
		
	}
}
