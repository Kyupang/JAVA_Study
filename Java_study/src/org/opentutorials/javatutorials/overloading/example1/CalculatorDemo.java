package org.opentutorials.javatutorials.overloading.example1;
//overloading 은 같은 클레스 내에 같은 이름으로 파라미터를 달리하여 
// 정의하는 방법 그렇게 하면 인수에 따라 부르는 메소드가 달라진다. 
// 다른 매개변수를 가지는 같은 이름의 함수를 여러개 정의할 수 있다. 
// 
//오버로딩 vs 오버라이딩 : 오버로딩: 같은 클레스 다른 파라미터; 상속에서도 유지
// 					오버라이딩: 다른 클레스 같은 파라미터 같은 이름 엄마 탄다!

class Calculator{
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        //this.left = left;
        //this.right = right;
        this.setOprands(left, right);
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }
  
}