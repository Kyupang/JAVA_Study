package thread;

import java.util.Iterator;

public class Thread4 extends Thread {

	@Override
	public void run() {
		for(int i = 0; i<500000 ; i++) {
			System.out.println("김강훈"+i);
		}
	}

}
