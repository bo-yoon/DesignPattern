package singleton;

public class Refrigerator {
	// 냉장고는 공통 자원	
    private static Refrigerator ref = null;
    
    private Refrigerator() {}  // 생성자가	 private
    
    public static Refrigerator getInstance() {
    	if(ref == null) {
    			ref = new Refrigerator();
    	}
    	return ref;
    }
    
	public void display() {
		System.out.println("냉장고 공유");
		
	}
}
