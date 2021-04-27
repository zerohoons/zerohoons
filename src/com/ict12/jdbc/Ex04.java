package com.ict12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
			//DB ���� �ʿ��� class
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs =null;
			int result = 0;
			
			
		try {
			//1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. ��������
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String pasw = "1111";
			
			conn = DriverManager.getConnection(url, user, pasw);
			
			//3.�����ۼ� - �̸��� ������� ��� ����
			String sql = "delete from customer where name = '�����'";
			
			//4.����
			stmt = conn.createStatement();
			
			//5. ����� DB ������ ��� �ޱ�
			result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("��������");
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
				System.out.println("��������");
			}
		} catch (Exception e) {
			System.out.println("��������");
			// TODO: handle exception
		} finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
			
	}
}
