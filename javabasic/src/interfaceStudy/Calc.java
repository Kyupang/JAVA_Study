package interfaceStudy;

public interface Calc {
	// 클래스와는 다르게 interface로 만들고 
	//기본 적으로 public abstract 이다.
	//변수는 public static final 이다.
	public static final double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
}
