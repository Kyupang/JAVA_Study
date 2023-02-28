package org.opentutorials.javatutorials.polymorphism;
// abstract 는 다른 클레스에서 메소드 사용 확장에 의미를 둔다.
// interface 는 함수 구현을 강제한다. 
// 밑의 예제에서는 할수 있는 것만 강제하기위해서 인터페이스를 자료형으로 둔다,
// interface 는 class의 자료형이 될수있다. 

interface I2{
    public String A();
}
interface I3{
    public String B();
}

// 밑 클레스에서 구현하는것을 강제함

class D implements I2, I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}
public class PolymorphismDemo3 {
    public static void main(String[] args) {
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();
         
        obj.A();
        obj.B();
        //obj는 자기가 마치 I2, I3인것처럼 알고있는거야  
        objI2.A();
        //objI2.B(); 이건 지가 안가지고 있잖아. 
         
        //objI3.A();
        objI3.B();
    }
}