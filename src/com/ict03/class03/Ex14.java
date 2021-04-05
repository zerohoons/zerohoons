package com.ict03.class03;

public class Ex14 {
	String name = "홍길동";
	int age = 27;
	/*
	public Ex14() {
		System.out.println("부모클래스 생성자 "+ this);
	}
	*/
	
	//기본 생성자가 아닌 다른 생성자로 만들경우
	public Ex14(String name , int age) {
		this.name = name;
		this.age = age;
	}
	//기본생성자 호출이 불가능 해지기 때문에 자식생성자에서 오류 발생.
	//이를 막기 위해 super를 활용 ->Ex15 13줄
}
