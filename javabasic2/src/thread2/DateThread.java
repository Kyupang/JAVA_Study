package thread2;

import java.util.Date;

public class DateThread extends Thread {
	public void run() {
		for (int i = 1000; i >0; i--) {
			Date date = new Date();
			System.out.println("타이머"+ date);
			try {
				Thread.sleep(1000);// 1초 재워라 
			} catch (InterruptedException e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
