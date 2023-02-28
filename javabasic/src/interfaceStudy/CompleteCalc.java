package interfaceStudy;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0) {return ERROR;}
		return num1/num2;
	}
	
	//이 클래스는 인스턴스화 할 수 있는 클래스이니 새로운 함수도 구현할 수 있다! 
	
//	public void showInfo() {
//		System.out.println("모두 구현했습니다!");
//	}

}
