package Facade;

public class Main {
	public static void main(String [] args) {
		
		FacadeSchool cs = new FacadeSchool(
				new Book(), new Pen(), new Student(), new Teacher());
		
		cs.studentStudy();
		System.out.println();
		cs.takeClass();
		
	}
}
