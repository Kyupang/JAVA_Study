package thread;

import java.util.Iterator;

public class Thread2 extends Thread{

	@Override
	public void run() {
		for(int i = 500000; i>0 ; i--) {
			System.out.println("김대영"+i);
		}
	}
}

