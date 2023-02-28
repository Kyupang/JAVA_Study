package interfaceStudy;

public class CalcTest {

	public static void main(String[] args) {
//		Calc cal = new Calc();// 인터페이스라서 못만들어
//		Calc cal2 = new Calculator(); //추상클래스니까 어짜피 못만들어!
		Calc cal3 =  new CompleteCalc();
		//어짜피 하위클래스에서는 상위클래스에 잇는 함수들에 다 접근할 수 있어.
		CompleteCalc cal4 = new CompleteCalc();
		
		System.out.println(cal4.add(3, 4));
		System.out.println(cal4.substract(3, 4));
		System.out.println(cal4.times(3, 4));
		System.out.println(cal4.divide(3, 4));
		cal4.showInfo();
		
		//이건 오류가 뜸 왜냐면 Calc 클래스에 구현된 showInfo 가 없음 
		//cal3.showInfo();
	}

}
