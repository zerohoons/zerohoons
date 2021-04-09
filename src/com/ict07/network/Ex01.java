package com.ict07.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* Class InetAddress
 * - 자바에서 IP주소를 표현하는 class.
 * - 생성자가 존재하지만, 사용하지 않는다.
 *  ※localhost : 현재 내가 사용하고 있는 컴퓨터
 * - 6개의 static 메소드를 이용한다.
 * 	 static 메소드 : getAllByName(String host), getByAddress(byte[] addr),getByAddress(String host, byte[] addr)
 * 				 	getByName(String host)	getLocalHost()	getLoopbackAddress()  */
public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getByName("www.naver.com"); //new 사용하지 않음.
			System.out.println("이름 : " + add.getHostName());
			System.out.println("주소 : "+ add.getHostAddress());
			System.out.println("toString : " + add.toString());
			System.out.println("=============================");
			
			//내 컴퓨터 정보
			add = InetAddress.getLocalHost();
			System.out.println("이름 : " + add.getHostName());
			System.out.println("주소 : "+ add.getHostAddress());
			System.out.println("toString : " + add.toString());
			System.out.println("=============================");
			
			InetAddress[] addrs = InetAddress.getAllByName("www.daum.net");
			for (InetAddress k : addrs) {
				
				System.out.println("이름 : " + k.getHostName());
				System.out.println("주소 : "+ k.getHostAddress());
				System.out.println("toString : " + k.toString());
				System.out.println("=============================");
			}
			System.out.println("=============================");
			
			//125.209.222.137
			byte[] b = {(byte)223,(byte)130,(byte)195,(byte)200}; //128 이상의 수는 오류 -> byte로 형변환
			add = InetAddress.getByAddress(b);
			System.out.println("이름 : " + add.getHostName());
			System.out.println("주소 : "+ add.getHostAddress());
			System.out.println("toString : " + add.toString());
			System.out.println("=============================");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}
}
