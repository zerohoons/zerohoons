package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		//static 객체 생성과 상관없이 사용가능
		//클래스 이름. 멤버필드 / 멤버 메소드
		
		System.out.println(Ex05.s3); 
		//s4는 왜 안되는가.
		//private 이기 때문에 static 이어도 접근 불가능.
		
		Ex05 test = new Ex05();
		System.out.println(test.s1);
		System.out.println(test.s3);
		//s2와 s4역시 private 이기 때문에 접근 불가능.
		
		test.add();
	//	test.add2();	
		//메소드 역시 private면 접근할 수 없음.
		test.add3();
		//메소드를 통해 private 메소드에는 접근 할 수 있음.
	}
}
