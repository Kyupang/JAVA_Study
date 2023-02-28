package arrayStudy;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class array7 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String header[] = { "a", "b", "c" };
		String contents[][] = {
//				{{"1","2","3"},{"1","2","3"},{"1","2","3"}},
//				{{"1","2","3"},{"1","2","3"},{"1","2","3"}},
//				{{"1","2","3"},{"1","2","3"},{"1","2","3"}}
				// 3차원 배열은 주소만 반환하는군,,ㅎ
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" } };

		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
