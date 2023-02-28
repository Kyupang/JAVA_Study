package interfaceStudies;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 이벤트 처리");
		f.setSize(300,200);
		
		JButton b1 = new JButton("나를 눌러");
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 인터페이스에 반드시 actionPerformed()를 쓰라고 규칙이 정해져 있어서 
				// 이걸 구현해야함 , 이름도 바꾸면 안됨. 
				// 구현을 강제함 !! able 
				System.out.println("버튼이 클릭되었음.");
			}
		});
		f.setVisible(true);
		
	}

}
