package com.ict12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
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
			
			//3. ������
			//custid�� 7�� ����� �̸��� ����ȣ, ���ѹα� ����� ����.
			
			String sql = "update customer set name='����ȣ', address = '���ѹα� ����'"
					+ "where custid = 7";
			
			//���� DB�� ������
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println(result + "�� �۾� ����");
				
				sql = "select * from customer";

				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
					
			}}else {
				System.out.println("����");
			}
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
}
}
