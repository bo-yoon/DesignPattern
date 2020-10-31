package Iterator;

import java.util.ArrayList;

public class ItemIterator implements Iterator{

	private ArrayList<Contents> items;
	private int idx = 0;
		
	public ItemIterator() {
		this.items =  new ArrayList();
		next("제목");
	}
	
	
	// 뒤에 함수를 가지고 있는
	public boolean hasNext() {
		 if(items.size() == 0 ) {
			 return false;
		 }else {
			 return true;
		 }
	}
	
	public Object next(String title) {
		Contents con = new Contents(title, idx);
		idx++;
		items.add(con);
		return con;
	}
	
	public void remove(int i) {
		items.remove(i);
	}

}
