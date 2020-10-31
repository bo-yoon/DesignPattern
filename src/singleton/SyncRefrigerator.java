package singleton;

public class SyncRefrigerator {
	// 냉장고는 공통 자원	
    private static SyncRefrigerator ref = null;
    
    private SyncRefrigerator() {}  // 생성자가	 private
    
    public synchronized static SyncRefrigerator getInstance() {
    	if(ref == null) {
    			ref = new SyncRefrigerator();
    	}
    	return ref;
    }
    
    public void display() {
    	System.out.println("Sync 냉장고 공유");
  
    }
}
