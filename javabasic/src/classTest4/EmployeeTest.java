package classTest4;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee work1 = new Employee("홍길동", 25, "여");
		System.out.println(work1);
		System.out.println(Employee.avgage);
	
		Employee work2 = new Employee("김길동", 22, "남");
		System.out.println(work1);
		System.out.println(Employee.avgage);
		
		Employee work3 = new Employee("송길동", 30, "여");
		System.out.println(work1);
		System.out.println(Employee.avgage);
	}

}
