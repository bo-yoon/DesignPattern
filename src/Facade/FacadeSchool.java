package Facade;

public class FacadeSchool {
	
	Book book;
	Pen pen;
	Student st;
	Teacher tc;
	
	public FacadeSchool(Book book, Pen pen, Student st, Teacher tc) {
		this.book = book;
		this.pen = pen;
		this.st = st;
		this.tc = tc;

	}
	
	public void studentStudy() {
	    System.out.println("학생이 자습 ");
		book.use();
		pen.use();
		st.in();
	}
	
	public void takeClass() {
		System.out.println("수업 시간 ");
		book.use();
		pen.use();
		st.in();
		tc.in();
	}
}
