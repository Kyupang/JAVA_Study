package 화면DB_Connection2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import JavaDB_Connection.MemberDAO;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(520, 700);
		f.getContentPane().setBackground(Color.green);
		// JLabel l1 = new JLabel("<<네이버 회원가입화면>>");

		JLabel l1 = new JLabel("<<<네이버 회원가입>>>");
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

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		l1.setFont(font);
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

		t1.setBackground(Color.white);
		t2.setBackground(Color.white);
		t3.setBackground(Color.white);
		t4.setBackground(Color.white);

		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);

		f.add(l1);
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

		
		//회원가입기능
		b1.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();

				MemberDAO dao = new MemberDAO();
				
				if(id.equals("")) {
					JOptionPane.showMessageDialog(f, "id는 필수입력 항목입니다.");
				}
				
				try {
					int result = dao.insert(id, pw, name, tel);
					if(result !=0) {
						JOptionPane.showMessageDialog(f, "회원가입 처리가 완료 되었습니다.");
					}
					else {
						JOptionPane.showMessageDialog(f, "회원가입 처리가 실패하였습니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});

		//탈퇴기능
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();

				MemberDAO dao = new MemberDAO();
				try {
					dao.delete(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				JOptionPane.showMessageDialog(f, "회원 탈퇴가 완료되었습니다.");

				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		
		
		//회원정보 수정기능 
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();

				MemberDAO dao = new MemberDAO();
				try {
					dao.update(tel, id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				JOptionPane.showMessageDialog(f, "전화번호가 수정되었습니다.");
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
