package org.opentutorials.javatutorials.object;


class Calculator{
	//static 이 붙어있는 것은 클래스의 변수
	//static이 붙어있지 않은것은 인스턴스 변수
	//!
	//인스턴스 메소드는 클래스 멤버에 접근 할 수 있다
	//클래스 메소드는 인스턴스 멤버에 접근 할 수 없다
	//!
	static double PI = 3.14;
	static int base = 0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
        System.out.println(this.left+this.right+base);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}


public class CalculatorDemo2 {
	
	//left right는 여기서 밑에있는 인스턴스의 멤버 변수이다. 
	//pi 나 base는 클래스의 멤버 변수이다. (클레스에서 값이 할당되어있는 변수들)
	//클래스의 멤버 변수에 인스턴스가 접근할 수 있다.
	//클래스자체로는 인스턴스 멤버에 접근할 수 없다. 
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		System.out.println(c1.PI);
		Calculator.base = 10;
		c1.sum();
		System.out.println(Calculator.base);
		System.out.println(Calculator.PI);
		
		
	}

}
