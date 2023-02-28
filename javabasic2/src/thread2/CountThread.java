package thread2;

public class CountThread extends Thread {
	@Override
	public void run() {
		for (int i = 500; i >0; i--) {
			System.out.println("카운트>>"+i);
			//자바가 외부자원을 연결할 때 위험해! 라는 상황 
			//문제가 생길걸 대비해 줘야함.
			try {
				Thread.sleep(2000);// 2초 재워라 
			} catch (InterruptedException e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
