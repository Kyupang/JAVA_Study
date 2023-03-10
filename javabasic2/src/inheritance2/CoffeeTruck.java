package inheritance2;

public class CoffeeTruck extends Truck {
	
	static int coffeeCount;
	
	public CoffeeTruck(int carNumber, int power, String engine) {
		super(carNumber, power, engine);
	}
	
	
	@Override
	public void stuff() {
		stuffCount++;
		System.out.println("커피용품 "+stuffCount+"개를 차에 실었습니다");
	}



	public void sellCoffee() {
		coffeeCount++;
		System.out.println(coffeeCount+"잔의 커피를 팔았습니다!");
	}
	
	public void turnOn() {
		System.out.println("커피트럭의 시동이 걸렸습니다.");
	}

	public void go() {
		System.out.println("커피트럭이 출발합니다!");

	}

	public void stop() {
		System.out.println("커피트럭이 멈췄습니다.");
	}

	public void turnOff() {
		System.out.println("커피트럭의 시동이 꺼졌습니다.");
	}


	@Override
	public String toString() {
		return "CoffeeTruck [stuffCount=" + stuffCount + ", carNumber=" + carNumber + ", power=" + power + ", engine="
				+ engine + "]";
	}
	
	

}
