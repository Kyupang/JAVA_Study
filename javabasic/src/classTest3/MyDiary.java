package classTest3;

public class MyDiary {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "포일동");
		Day day2 = new Day("산책", 1, "인덕원역");
		Day day3 = new Day("시험요약정리", 2, "집");
		//총 12개가 다이나믹하게 생성 =>> 객체 생성할 때마다 다이나믹하게 무더기 영역에 생김
		//인스턴스 변수. 
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		System.out.println(Day.count);
	}

}
