package inheritance;

public class Man extends Person {
	int power;
	
	public Man(String name, int age) {
		super(name, age);
	}
	
	public void run() {
		System.out.println("빨리달리다");
	}
}
