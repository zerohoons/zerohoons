package com.ict03.class01;

public class Ex11_main {
	public static void main(String[] args) {
		/*
		Ex11 test1 = new Ex11(); //private 정보를 기본생성자 안의 정보로 초기화.
		System.out.println("이름 " + test1.getName());
		System.out.println("나이 " + test1.getAge());
		System.out.println("성별 " + test1.isGender());
		System.out.println();
		*/
		
		Ex11 test2 = new Ex11("똘똘이", 3); 
//생성자 안에서 아무런 작업이 없으면 변화 없음(Ex11 39 참고)
		
		//setter를 이용해 멤버필드 변경 가능
		test2.setName("팔달이");
		System.out.println("이름 " + test2.getName());
		System.out.println("나이 " + test2.getAge());
		System.out.println("성별 " + test2.isGender());
		System.out.println();
		
		//setter를 이용해 멤버필드 변경 가능
		
		Ex11 test3 =new Ex11(45, "공실이");
		System.out.println("이름 " + test3.getName());
		System.out.println("나이 " + test3.getAge());
		System.out.println("성별 " + test3.isGender());
		
		//인자 순서가 다른 것만으로도 생성자는 달라짐 => 오버로딩
	}
}
