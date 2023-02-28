package ClassApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Diary{
	//멤버 변수 - 안써도 됨
	//멤버 메서드
	public void open() {
		//jframe 화면이 보이게하자. 
		JFrame f = new JFrame();
		f.setTitle("내 일기장 작성화면");
		f.setSize(500, 400);
		f.getContentPane().setBackground(Color.yellow);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("D2coding", 1, 30);
		
		JLabel day = new JLabel("오늘의 날짜 : ");
		JLabel title = new JLabel("오늘의 제목 : ");
		JLabel content = new JLabel("오늘의 내용 : ");
		
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);

		JTextField dayText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		JTextArea contentText = new JTextArea(5,10);
		dayText.setFont(font);
		titleText.setFont(font);
		contentText.setFont(font);
		
		JButton save = new JButton("파일 저장");
		save.setFont(font);
		
		f.add(day);
		f.add(dayText);
		f.add(title);
		f.add(titleText);
		f.add(content);
		f.add(contentText);
		f.add(save);
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String day1 = dayText.getText();
				String title1 = titleText.getText();
				String content1 = contentText.getText();
				
				System.out.println(day1+" "+title1+" "+content1);
				//파일도 만들어주고, 자바프로그램과 file간에 연결통로(스트림)을 만들어준다.
				//외부에 있는 파일, 네트워크나 cpu등을 자바에서 연결할 때는 
				//아주 위험한 상황이라고 인식!!
				//예외처리를 해줘야함! 
				try {
					FileWriter file = new FileWriter(day1 +".txt");
					file.write("날짜: "+day1+ "\n");
					file.write("제목: "+title1+ "\n");
					file.write("내용: "+content1+ "\n");
					file.close();
				} catch (IOException e1) {
					System.out.println("파일로 저장하는 중 문제가 생김.");
				}
			}
		});
		
		f.setVisible(true);
	}
}
