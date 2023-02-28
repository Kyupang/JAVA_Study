package inheritance2;

public class 내차들 {

	public static void main(String[] args) {
		Car car1 = new Car(3333, 300, "가솔린");
		Truck car2 = new Truck(3234, 400, "디젤");
		CoffeeTruck car3 = new CoffeeTruck(1234, 250, "가솔린");
		
		car1.run();
		System.out.println("=====================");
		car2.run();
		car2.stuff();
		car2.stuff();
		car2.stuff();
		System.out.println("=====================");
		car3.run();
		car3.stuff();
		car3.sellCoffee();
		car3.sellCoffee();
		car3.sellCoffee();
		
		
	}

}
