package Iterator;

//import java.util.Iterator;

class ItemList implements Iterable {
	
	@Override
	public Iterator createInterator() {
		
		return new ItemIterator();
	}
}
