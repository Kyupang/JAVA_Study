package org.opentutorials.javatutorials.exception;


class A{
	private int[] arr = new int[3];
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	public void z(int first, int second) {
		
		//System.out.println(arr[first]/arr[second]);
		 try {
	            System.out.println(arr[first] / arr[second]);
		 	} 
//		 catch(Exception e){
//	            System.out.println("Exception");
//		 	} 얘가 제일 큰 범위를 포괄해서 제일 먼저 나올수없다. 
		 
		 catch(ArrayIndexOutOfBoundsException e){
	            System.out.println("ArrayIndexOutOfBoundsException");
	        } catch(ArithmeticException e){
	            System.out.println("ArithmeticException");
	        } 
	}
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		
		A a = new A();
		a.z(1,0); // arithmetic 으로 예외가 발생
		a.z(10,1);  // 어레이의 인덱스가 없는경우 
		a.z(2, 1);
		
		
	}

}
