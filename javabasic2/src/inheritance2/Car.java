package inheritance2;

public class Car {
	int carNumber;
	int power;
	String engine;

	public Car(int carNumber, int power, String engine) {
		this.carNumber = carNumber;
		this.power = power;
		this.engine = engine;
	}

	public void turnOn() {
		System.out.println("시동이 걸렸습니다.");
	}

	public void go() {
		System.out.println("차가 출발합니다!");

	}

	public void stop() {
		System.out.println("차가 멈췄습니다.");
	}

	public void turnOff() {
		System.out.println("시동이 꺼졌습니다.");
	}
	

	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", power=" + power + ", engine=" + engine + "]";
	}

	final public void run() {
		turnOn();
		go();
		stop();
		turnOff();
		toString();
		
	}
	
	

}
