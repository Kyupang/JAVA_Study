package org.opentutorials.javatutorials.object;

class Calculator3{
	int base =0;
	//인스턴스 메소드는 클래스 멤버에 접근 할 수 있다
	//클래스 메소드는 인스턴스 멤버에 접근 할 수 없다
	//!
    public static void sum(int left, int right){
        System.out.println(left+right);
    }
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
 
public class CalculatorDemo3 {
    //만약 메소드가 인스턴스 변수를 참조하지 않는다면 클래스 메소드를 
	//사용해서 불필요한 인스턴스의 생성을 막을 수 있다
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
 
}
