package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {
		
//		System.out.println(test); 	// 주소
//		System.out.println(test.k1);
//		System.out.println(test.k2);
//		System.out.println(test.K3);
//		System.out.println(test.K4);
//		test 클래스를 만들기 전이기 때문에 오류.
		
		//static은 객체 생성과 상관없이 미리 만들어진다.
		//호출하는 방법 : 클래스이름.static 메소드/ 변수
		//System.out.println(Ex02.k1); instance 의 경우, 오류발생!
		System.out.println(Ex02.k2);
		//System.out.println(Ex02.K3);
		System.out.println(Ex02.K4);
		
		//void의 경우, 정보가 넘어오지 않음.
		Ex02.prn02();
		//void가 아닐 경우, 반환형에 맞춰서 저장하자.
		double su1 = Ex02.prn04();
		System.out.println(su1);
		
		System.out.println("===============객체생성전후================");
	//1. Ex02 클래스를 사용하기 위해서 클래스를 객체로 만들자.
	//	클래스 만드는 방법
	//	클래스 참조변수 = new 생성자;
	//	생성자가 없는 경우 기본 생성자 == 클래스이름()
		Ex02 test = new Ex02();
	//	Ex02 클래스의 경우 생성자가 존재하지 않음. -> 기본생성자 이용.
		System.out.println(test); 	// 주소
		System.out.println(test.k1);
		System.out.println(test.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
	
	//메소드 실행
		//static 의 경우 참조변수가 아닌 클래스명으로 실행이가능하다.
		//구분하기 쉽게 하기위해 static은 클래스명 실행을 추천!
		test.prn01();
		test.prn02();
		Ex02.prn02();
		int su2 = test.prn03();
		System.out.println(su2);
		double su3 = Ex02.prn04(); //static이니까 class 명으로 하자.
		System.out.println(su3);
	}
}
