package org.opentutorials.javatutorials.Inheritance;

class Calculator3 {
    int left, right;
    
    //자바는 상속받은 클래스가 인스턴스를 만들 때 부모클레스의 
    //기본 생성자를 호출하도록 약속되어있기 때문에 
    //기본 생성자를 명시적으로 적어줘야한다.
    //파라미터를 가지는 생성자를 만들시 기본생성자는 만들지 않기 때문이다.
    //그런데 상위클레스에 기본생성자를 만들지 않고도 문제없이 객체가 동작하도록
    //할 수 있는 방법이 있다. 
    //public Calculator3(){}
    public Calculator3(int left, int right){
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator3 extends Calculator3 {
    public SubstractionableCalculator3(int left, int right) {
    	super(left,right);
    	//바로 수퍼를 쓰는 것이다. 부모클래스의 기본생성자를 부모클래스의 
    	//인스턴스 변수인 left right로 초기화하는 것이다.
    	//this.left = left;
        //this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator3 c1 = new SubstractionableCalculator3(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}