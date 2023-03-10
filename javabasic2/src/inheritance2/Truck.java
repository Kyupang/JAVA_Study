package inheritance2;

public class Truck extends Car{
	protected int stuffCount;
	
	public Truck(int carNumber, int power, String engine) {
		super(carNumber, power, engine);
	}
	
	public void stuff() {
		stuffCount++;
		System.out.println(stuffCount+"개의 짐을 트럭에 실었습니다.");
	}
	
	public void turnOn() {
		System.out.println("트럭의 시동이 걸렸습니다.");
	}

	public void go() {
		System.out.println("트럭이 출발합니다!");

	}

	public void stop() {
		System.out.println("트럭이 멈췄습니다.");
	}

	public void turnOff() {
		System.out.println("트럭의 시동이 꺼졌습니다.");
	}

	@Override
	public String toString() {
		return "Truck [stuffCount=" + stuffCount + ", carNumber=" + carNumber + ", power=" + power + ", engine="
				+ engine + "]";
	}
	
	
	
}
