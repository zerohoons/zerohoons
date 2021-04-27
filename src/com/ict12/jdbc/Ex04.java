package com.ict12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
			//DB 접속 필요한 class
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs =null;
			int result = 0;
			
			
		try {
			//1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 접속정보
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String pasw = "1111";
			
			conn = DriverManager.getConnection(url, user, pasw);
			
			//3.쿼리작성 - 이름이 손흥민인 사람 삭제
			String sql = "delete from customer where name = '손흥민'";
			
			//4.적용
			stmt = conn.createStatement();
			
			//5. 적용된 DB 보내고 결과 받기
			result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("삭제성공");
				sql = "select * from customer";
				stmt= conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
				}
			}else {
				System.out.println("삭제실패");
			}
		} catch (Exception e) {
			System.out.println("삭제실패");
			// TODO: handle exception
		} finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
			
	}
}
