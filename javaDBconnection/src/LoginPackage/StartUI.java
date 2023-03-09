package LoginPackage;

import javax.swing.JOptionPane;

import JavaDB_Connection.MemberDAO2;
import 화면DB_Connection2.MemberVo;

public class StartUI {
	public static void main(String[] args) {
		String id =JOptionPane.showInputDialog("아이디 입력");
		String pw =JOptionPane.showInputDialog("패스워드 입력");
		
		MemberDAO2 dao = new MemberDAO2();
		MemberVo bag = new MemberVo();
		
		
		bag.setId(id);
		bag.setPw(pw);
		int result = dao.login(bag);
		if(result ==1 ) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			BbsUI5 bbs = new BbsUI5();
			bbs.open();
			
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
			MemberUI5 member = new MemberUI5();
			member.open();
		}
	}
	
	
}
