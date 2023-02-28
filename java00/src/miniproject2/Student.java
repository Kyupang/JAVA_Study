package miniproject2;

import java.util.ArrayList;

public class Student {
	//인스턴스 변수 
	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList; 
	
	//기본 생성자
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	//infomration을 보여줌 
	public void showScoreInfo() {
		int total = 0;
		//subjectList 안에 있는 애들이 객체니까 변수는 그것과 동일해야함
		for (Subject i : subjectList) {
			total += i.getScore();
			System.out.println(studentName+"학생의"+i.getSubjectName()+"과목의 점수는:"+i.getScore()+"점 입니다.");
		}
		System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
	}
	
}
