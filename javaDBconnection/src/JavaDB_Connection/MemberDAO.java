package JavaDB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	
	
	public void insert(String id, String pw, String name, String tel) {
		try {
			// 1. 오라클 11g 와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver"); // **
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자(java---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: 오라클 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "insert into HR.MEMBER VALUES(?,?,?,?)"; //** 이거 ?가 문법이야.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			
			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			int result = ps.executeUpdate(); //**
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(String id) {
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
			String sql = "DELETE FROM HR.MEMBER WHERE ID = ? ";
			PreparedStatement ps= con.prepareStatement(sql); //**
			ps.setString(1, id);
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			int result = ps.executeUpdate();  //**
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(String tel, String id) {
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
			String sql = "UPDATE HR.MEMBER SET TEL =? WHERE ID= ? ";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);
			
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