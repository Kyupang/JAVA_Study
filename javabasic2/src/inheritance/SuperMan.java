package inheritance;

public class SuperMan extends Man{

	boolean fly;
	
	
	public SuperMan(String name, int age) {
		super(name, age);
	}

	public void space() {
		System.out.println("우주를 날다.");
	}
	
	
	@Override
	public void eat() {
		System.out.println("겁나 먹다!!");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
