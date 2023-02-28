package thread;

import java.util.Iterator;

public class Thread10 extends Thread {

	@Override
	public void run() {
		for(int i = 0; i<500000 ; i++) {
			System.out.println("박상훈"+i);
		}
	}

}
