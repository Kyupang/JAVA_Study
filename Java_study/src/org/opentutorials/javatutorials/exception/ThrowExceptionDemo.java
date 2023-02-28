package org.opentutorials.javatutorials.exception;

import java.io.*;

class B{
    @SuppressWarnings("resource")
	void run() throws FileNotFoundException, IOException {
            BufferedReader bReader = null; // try 안에서 정의하면 안된다. 다음 try에서는 존재하지 않는 변수일 수 있기 때문이다.
            String input = null;
			bReader = new BufferedReader(new FileReader("out.txt"));
    	    input = bReader.readLine();
            System.out.println(input); 
    }
}
class C extends B{
    void run() throws FileNotFoundException, IOException{
        B b = new B();
		b.run();
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         try {
			c.run();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }   
}