package basic;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.nio.FloatBuffer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFramePracti {

	public static void main(String[] args) {
		// 프레임을 만들어라
		JFrame f = new JFrame();
		//사이즈는 300 300으로
		f.setSize(800, 800);
		
		//물 흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야함
		FlowLayout flow = new FlowLayout();
		//f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);
		
			
		//버튼을 만들어라 
		JButton b1 = new JButton();
		//버튼에 들어갈 텍스트를 정해라
		b1.setText("나는 버튼1");
		
		JButton b2 = new JButton();
		b2.setText("나는 버튼2");
		
		// 글씨를 넣어볼까?
		JLabel text1 = new JLabel();
		text1.setText("아이디");

		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		//글 넣는 곳..
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		//폰트를 바꿔보자.
		Font font = new Font("궁서", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b2.setForeground(Color.red);
		b2.setForeground(Color.white);
		text1.setForeground(Color.pink);
		text1.setForeground(Color.green);
		
		//이미지 객체를 만든다.
		ImageIcon icon = new ImageIcon("5.jpg");
		ImageIcon icon2 = new ImageIcon("6.jpg");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		// f(프레임)에 추가해줘 
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		//보여줘~
		f.setVisible(true);
		
	}

}
