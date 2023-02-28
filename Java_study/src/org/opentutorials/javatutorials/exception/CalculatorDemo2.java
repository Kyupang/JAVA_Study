package org.opentutorials.javatutorials.exception;
class Calculator2{
    int left, right;
    public void setOprands(int left, int right){
//    	if(right == 0) {
//    		throw new IllegalArgumentException("두 번째 인자는 0을 허용하지 않습니다.");
//    	}
        this.left = left;
        this.right = right;
    }
    public void divide(){
//    	if(right == 0) {
//    		throw new ArithmeticException("0으로 나눌 수 없습니다.");
//    	}
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 0);
        try{ //위에서 정의되어있으면 이쪽으로 찾아 내려와서 같은 인스턴스면 실행시킨다.
        	c1.divide();
        }catch(ArithmeticException e){
        	System.out.println(e.getMessage());
        }
    }
}