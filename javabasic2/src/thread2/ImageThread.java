package thread2;

public class ImageThread extends Thread{
	@Override
	public void run() {
		String[] image = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"
						 ,"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"
						 ,"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"
						 ,"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"};
		for (int i = 0; i < image.length; i++) {
			System.out.println("이미지>>"+image[i]);
			try {
				Thread.sleep(5000);// 2초 재워라 
			} catch (InterruptedException e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}

}
