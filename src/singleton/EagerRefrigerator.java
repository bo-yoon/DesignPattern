package singleton;

public class EagerRefrigerator {
	// 냉장고는 공통 자원	
    private static EagerRefrigerator ref = new EagerRefrigerator();
    
    private EagerRefrigerator() {}  // 생성자가	 private
    
    public static EagerRefrigerator getInstance() {

    	return ref;
    }
    
    public void display() {
    	System.out.println("Eager 냉장고 공유");
  
    }
}
