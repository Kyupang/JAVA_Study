package hashcode;

public class Student implements Cloneable{
	int studentNumber;
	String studentName;
	
	public Student(int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + "]";
	}
	
	//우리가 객체의 값을 비교할때 같은 값이 나오면 같
	//이퀄스를 오버라이드 해주지 않으면 둘의 물리적인주소값도 다르고 
	//논리적인 주소값도 달라서 false가 나온다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNumber == std.studentNumber) {
				return true;
			}else return false;
		}
		return false;
	}
	
	//해쉬코드 또한 오버라이드 해주지 않으면 같지 않게 나온다.
	@Override
	public int hashCode() {
		return studentNumber;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}
