package thread2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadMain extends JFrame {
	JLabel count, image2, day;

	public static void main(String[] args) {
		ThreadMain f = new ThreadMain(); // ---1
		// 객체 생성시 클래스 이름과 동일한 메서드를 자동호출
		// ==> 생성자 메서드!!
		// 전역변수를 공유할 수는 있지만, 내부클레스가 독립적으로 사용 불가능.
		f.call();
	}

	public void call() { // ----2
		setTitle("내 스레드 그래픽");
		setSize(600, 550);
		getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		Font font = new Font("D2coding", Font.BOLD, 30);

		ImageIcon icon = new ImageIcon("4.jpg");

		count = new JLabel("count 들어갈 자리");
		image2 = new JLabel(icon);
		day = new JLabel("day 들어갈 자리");
		count.setFont(font);
		day.setFont(font);

		add(count);
		add(image2);
		add(day);

		DateThread2 date1 = new DateThread2();
		ImageThread2 image1 = new ImageThread2();
		CountThread2 count1 = new CountThread2();

		count1.start();
		image1.start();
		date1.start();

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public class CountThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트>>" + i);
				// 자바가 외부자원을 연결할 때 위험해! 라는 상황
				// 문제가 생길걸 대비해 줘야함.
				try {
					Thread.sleep(2000);// 2초 재워라
				} catch (InterruptedException e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}

	public class DateThread2 extends Thread {
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				day.setText("타이머>> " + date);
				try {
					Thread.sleep(1000);// 1초 재워라
				} catch (InterruptedException e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}

	public class ImageThread2 extends Thread {
		@Override
		public void run() {
			String[] image = { "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg",
					"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg" };
			for (int i = 0; i < image.length; i++) {
				ImageIcon icon = new ImageIcon(image[i]);
				image2.setIcon(icon);
				try {
					Thread.sleep(5000);// 2초 재워라
				} catch (InterruptedException e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}

	}
}
