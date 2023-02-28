package miniproject2;

public class StudentTest {

	public static void main(String[] args) {
		Student studentKim = new Student(1001, "KimGyuHwan");
		studentKim.addSubject("국어", 98);
		studentKim.addSubject("수학", 39);
		studentKim.addSubject("영어", 100);
		studentKim.addSubject("체육", 93);
		studentKim.addSubject("한국사", 30);
		Student studentLee = new Student(1002, "LeeSo");
		studentLee.addSubject("국어", 50);
		studentLee.addSubject("수학", 100);
		studentLee.addSubject("영어", 100);
		
		studentKim.showScoreInfo();
		System.out.println("===============");
		studentLee.showScoreInfo();
	}

}
