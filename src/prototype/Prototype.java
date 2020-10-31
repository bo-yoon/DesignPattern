package prototype;

public class Prototype {
    
	private RussianBlue rb;
	private Siamese siam;
	
	public Prototype (RussianBlue _rb, Siamese _siam) {
		this.rb = _rb;
		this.siam = _siam;
	}

	public RussianBlue getRb() {
		return rb;
	}

	public Siamese getSiam() {
		return siam;
	}
	
	
}
