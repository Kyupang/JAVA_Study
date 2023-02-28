package miniproject;

public class StudentTest {
	public static void main(String[] args) {
		Student studentKim = new Student(100, "Kim");
		studentKim.setKoreaSubject("국어", 100);
		studentKim.setMethSubject("수학",99);
		
		studentKim.showScoreInfo();
	}
}