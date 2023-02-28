package inheritance3;

public class 직원 {
	String name;
	String adress;
	int salary;
	String rrn; //주민번호
	
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", adress=" + adress + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}
