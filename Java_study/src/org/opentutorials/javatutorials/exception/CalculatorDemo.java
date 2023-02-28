package org.opentutorials.javatutorials.exception;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	//계산결과는 오류가 발생했습니다. : / by zero
    	//try 에는 예외의 발생이 예상되는 로직
    	//catch(예외클래스 인스턴스)
    	//예외가 발생했을 때 실행되는 로직 
        try{
        	System.out.print("계산결과는 ");
        // 이 밑 부분부터 에러가 난다. 
        	System.out.print(this.left/this.right);
        	System.out.print(" 입니다.");
        } catch(Exception e) {
        	//System.out.println("\n\ne.getMessage()\n"+e.getMessage());
        	System.out.println("\n\ne.toString()\n"+e.toString());
        	//2 두번쨰로 구체적 
        	//System.out.println("\n\ne.printStackTrace()");
        	//e.printStackTrace(); //3제일 구체적
        }
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}