package org.opentutorials.javatutorials.exception;

//unchecked exception : 예외처리를 하지 않아도 되는 exception {try,catch}
//RuntimeException 의 하위 클레스 
//이것은 산술적으로나 전혀 개선여지가 없는 애들은 프로그램을 끝내버려야하니까 쓰는 예외


// 하지만 밑의 예외는 파일이 찾아지지 않거나 이런 경우 개선여지가 있으니 
// 사용자에게 던질 수 있음 
//checked exception : 예외처리를 꼭 해야하는 exception


//1 방법
class DivideException extends RuntimeException {
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    	
    }
}
class Calculator3{ 
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator3 c1 = new Calculator3();
        c1.setOprands(10, 0);
        c1.divide();
    }
}


//2 방법 
//class DivideException extends Exception {
//    DivideException(){
//        super();
//    }
//    DivideException(String message){
//        super(message);
//    	
//    }
//}
//class Calculator3{ 
//    int left, right;
//    public void setOprands(int left, int right){        
//        this.left = left;
//        this.right = right;
//    }
//   public void divide(){
//        if(this.right == 0){
//        	try {
//	            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
//	        }catch(DivideException e) {
//	        	e.printStackTrace();
//	        }
//        }
//        System.out.print(this.left/this.right);
//   }
//public class CalculatorDemo3 {
//    public static void main(String[] args) {
//        Calculator3 c1 = new Calculator3();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}


//3 방법 
//class DivideException extends Exception {
//DivideException(){
//  super();
//}
//DivideException(String message){
//  super(message);
//	
//}
//}
//class Calculator3{ 
//int left, right;
//public void setOprands(int left, int right){        
//  this.left = left;
//  this.right = right;
//}
//public void divide() throws Exception{
//  if(this.right == 0){
//      throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
//  }
//  System.out.print(this.left/this.right);
//}
//}
//public class CalculatorDemo3 {
//public static void main(String[] args) {
//  Calculator3 c1 = new Calculator3();
//  c1.setOprands(10, 0);
//  c1.divide();
//}
//}