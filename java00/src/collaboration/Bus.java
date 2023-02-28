package collaboration;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "버스의 승객수는 " + passengerCount + "명 이고, 수입은" + money + "원 입니다.");
	}
}
