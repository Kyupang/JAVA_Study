package 화면DB_Connection2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(530, 700);
		f.getContentPane().setBackground(Color.green);
		//JLabel l1 = new JLabel("<<네이버 회원가입화면>>");
		
		ImageIcon i1 = new ImageIcon("1.png");
		  		
		
		JLabel l2 = new JLabel("ID  ");
		JLabel l3 = new JLabel("PW  ");
		JLabel l4 = new JLabel("NAME");
		JLabel l5 = new JLabel("TEL ");

		Font font = new Font("D2coding", Font.BOLD, 40);

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");
		JButton b5 = new JButton();
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		b5.setIcon(i1);

		
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);

		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);

		t1.setBackground(Color.white);
		t2.setBackground(Color.white);
		t3.setBackground(Color.white);
		t4.setBackground(Color.white);

		
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);

		f.add(b5);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);		
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
