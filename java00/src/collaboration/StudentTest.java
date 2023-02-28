package collaboration;

public class StudentTest {

	public static void main(String[] args) {
		Student studentK = new Student("KimGyuHwan", 5000);
		Student studentJ = new Student("James", 10000);
		
		Bus bus100 = new Bus(100);
		studentK.takeBus(bus100);
		
		Subway subway2 = new Subway(2);
		studentJ.takeSubway(subway2);
		
		studentK.showInfo();
		studentJ.showInfo();
		
		bus100.showBusInfo();
		subway2.showSubwayInfo();
	}

}
