package miniprojectpract;

public class StudentTest {

	public static void main(String[] args) {
		StudentClass studentKim = new StudentClass(1001, "KimGyuHwan");
		studentKim.addSubjectName("국어", 98);
		studentKim.addSubjectName("수학", 39);
		studentKim.addSubjectName("영어", 100);
		studentKim.addSubjectName("체육", 93);
		studentKim.addSubjectName("한국사", 30);
		StudentClass studentLee = new StudentClass(1002, "LeeSo");
		studentLee.addSubjectName("국어", 50);
		studentLee.addSubjectName("수학", 100);
		studentLee.addSubjectName("영어", 100);
		
		studentKim.showScoreInfor();
		System.out.println("===============");
		studentLee.showScoreInfor();
	}

}
