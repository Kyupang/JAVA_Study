package classTest4;

public class Employee {
	String name;
	int age;
	String sex;
	
	static int count;
	static int sum;
	static double avgage;
	
	public Employee(String name, int age, String sex) {
		count++;
		sum += age;
		avgage = (double)sum/count;
		this.name = name;
		this.age = age;
		this.sex = sex;
		
	}
	@Override
	public String toString() {
		return "Empoloyee [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}
