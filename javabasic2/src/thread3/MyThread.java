package thread3;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//public class MyThread extends Thread{
//	int x,y;
//	JLabel label;
//	
//	public MyThread(String file, int x, int y) {
//		this.x = x;
//		this.y = y;
//		ImageIcon icon = new ImageIcon(file);
//		label = new JLabel();
//		label.setIcon(icon);
//		label.setBounds(x, y, 100, 100);
//	}
//	
//	@Override
//	public void run() {
//		Random r = new Random();
//		int move = 0;
//		for (int i = 0; i < 200; i++) {
//			move = r.nextInt(20);
//			x += move;
//			label.setBounds(x, y, 100, 100);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("CPU에 문제가 생김");
//			}
//		}
//		
//	}
//}
