package classTest6;

public class 딸 {
	String name;
	String gender;
	
	static int fatherWal = 10000;
	static int count;
	public 딸(String name, String gender) {
		count++;
		fatherWal -=1000;
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}
