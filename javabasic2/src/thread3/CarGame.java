package thread3;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	public class MyThread extends Thread {
		int x, y;
		JLabel label;
		String file;
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 150, 150);
			add(label);
		}

		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(70);
				x += move;
				label.setBounds(x, y, 150, 150);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("CPU에 문제가 생김");
				}
			}

		}
	}

	public CarGame() {
		setTitle("나의 자동차 경주 게임");
		setSize(1000, 700);

		MyThread car1 = new MyThread("car01.png", 0, 0);
		MyThread car2 = new MyThread("car02.png", 0, 150);
		MyThread car3 = new MyThread("car03.png", 0, 300);

		car1.start();
		car2.start();
		car3.start();

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		CarGame f = new CarGame();
	}

}
