package org.opentutorials.javatutorials.exception;
import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader = null; // try 안에서 정의하면 안된다. 다음 try에서는 존재하지 않는 변수일 수 있기 때문이다.
        String input = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(input); 
    }
}