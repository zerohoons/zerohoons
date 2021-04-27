package com.ict12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement statm = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://203.236.220.101:3306/test02?characterEncoding=UTF-8&serverTimezone=UTC";
			String users = "test02";
			String pasw = "2222";
			
			conn = DriverManager.getConnection(url, users, pasw);
			
			String sql = "insert into students (No, name, det, addr, tel)" 
					+"values(6, '기', '기계공학','경상','010-6666-6666');";
			
			statm = conn.createStatement();
			result = statm.executeUpdate(sql);
			
			
			if(result !=0) {
				System.out.println(result + "개의 작업이 완료되었습니다.");
				String sql2 = "select * from students";
				rs = statm.executeQuery(sql2);
				while(rs.next()) {
					System.out.print(rs.getInt("No")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("det")+"\t");
					System.out.print(rs.getString("addr")+"\t");
					System.out.println(rs.getString("tel"));
				}
			} else {
				
				System.out.println("작업실패");
			}			
		} catch (Exception e) {
			System.out.println("작업실패 : " + e);
			// TODO: handle exception
		}finally {
			try {
				rs.close();
				statm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
