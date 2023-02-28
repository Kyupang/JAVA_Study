package miniprojectpract;

import java.util.ArrayList;

public class StudentClass {
	int studentCode;
	String studentNickname;
	
	ArrayList<SubjectClass> subject;
	
	StudentClass(int studentCode,String studentNickname){
		this.studentCode = studentCode;
		this.studentNickname = studentNickname;
		
		subject = new ArrayList<SubjectClass>();
	}
	
	public void addSubjectName(String name, int score) {
		SubjectClass subjectClass = new SubjectClass();
		subjectClass.setSubjectNName(name);
		subjectClass.setSubjectScore(score);
		
		subject.add(subjectClass);
	}
	
	
	public void showScoreInfor() {
		int total = 0;
		for (SubjectClass i: subject) {
			total += i.getSubjectScore();
			System.out.println(studentNickname + "학생의 학번은"+studentCode +"이고" +i.getSubjectNName()+" 과목의 성적은" + i.getSubjectScore() + "점 입니다.");
		}
		System.out.println(studentNickname + "의 총점은"+ total + " 점 입니다.");
	}
	
	
	
	
	
	
	
}
