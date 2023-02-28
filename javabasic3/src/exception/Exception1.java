package exception;

import java.io.FileWriter;
import java.io.IOException;

public class Exception1 {

	public static void main(String[] args) {
		FileWriter file;
		try {
			file = new FileWriter("test.txt");
			file.write("안녕\n");
			file.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		
		try {
			System.out.println("2. 문제 발생코드" + 10/0);
			
		} catch (Exception e) {
			//System.out.println("에러 발생함.");
			e.getStackTrace();
		}
		
		
	}

}
