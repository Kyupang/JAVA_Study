package JavaDB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BbsDAO {
	
	//BBS당 DAO 하나 
	public void insert(String no, String title, String content, String writer) {
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
			String sql = "insert into HR.BBS VALUES(?,?,?,?)"; //** 이거 ?가 문법이야.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			
			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			int result = ps.executeUpdate(); //**
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(String no) {
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
			String sql = "DELETE FROM HR.BBS WHERE \"no\"= ? ";
			PreparedStatement ps= con.prepareStatement(sql); //**
			ps.setString(1, no);
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			int result = ps.executeUpdate();  //**
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(String content, String no) {
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
			String sql = "UPDATE HR.BBS SET CONTENT =? WHERE \"no\"= ? ";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, content);
			ps.setString(2, no);
			
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