package Composite;

public class Main {
	public static void main(String[] args) {
		KimchiRice kimchiRice = new KimchiRice();
		Food kimchi = new Kimchi();
		Food Rice = new Rice();
		Food Span = new Span();
		
		kimchiRice.add(kimchi);
		kimchiRice.add(Rice);
		kimchiRice.add(Span);
				
	}
}
