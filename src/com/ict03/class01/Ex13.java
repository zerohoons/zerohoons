package com.ict03.class01;

public class Ex13 {
	private String name = "흰둥이";
	private int age = 3;
	private String addr = "서울";
	
	//생성자 오버로딩
	//기본 생성자 ctrl + spacebar
	
	public Ex13() {
		/* this : 객체 내부에서 객체 자신을 지칭하는 예약어
		 * this.변수 : 전역변수
		 * this.() : 생성자가 생성자를 호출할 때 사용하는 예약어. 반드시 생성자 첫줄에만 사용가능*/
		//this("공실이", 21, "남극");
		System.out.println("기본생성자 : " + this);
		//System.out.println(this.name);
		//System.out.println(this.getName());
	}
	
	//source 메뉴
	public Ex13(String name, int age) {
		
	}
}
