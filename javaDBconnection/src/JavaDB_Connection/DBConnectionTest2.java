package JavaDB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnectionTest2 {

	public static void main(String[] args) {
	try {
		//1. 오라클 11g 와 연결할 부품 설정 
		Class.forName("oracle.jdbc.driver.OracleDriver"); //**
		System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
		
		//2. 오라클 11g에 연결해보자(java---- oracle)
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String password = "oracle";
		Connection con = DriverManager.getConnection(url, user, password); //**
		System.out.println("2: 오라클 연결 성공.");
		
		//3. SQL 문 만들고
		String sql = "insert into HR.BBS VALUES('화요일','WIN2','WIN2','WIN2')";
		PreparedStatement ps= con.prepareStatement(sql);
		
		System.out.println("3: SQL만들기 성공.");
		
		
		//4.DB로 전송
		int result = ps.executeUpdate();
		System.out.println(result);
		System.out.println("4: DB로 전송 성공.");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	}

}