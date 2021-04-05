package com.ict03.class01;

public class Ex11 {
/*
 생성자 : 클래스를 객체로 만들 때, 자동으로 한 번 호출되어진다.
 - 목적 : 멤버필드(변수와 상수)의 초기화를 목적으로 한다.
 - 특징 : 생성자 이름과 클래스 이름은 동일하다.
 		: 클래스이름(인자=매개변수); == 생성자
 		: 반환형이 없는 메소드라고도 한다.
 		: 생성자를 따로 만들지 않으면 기본 생성자를 객체로 생성
 		  -> 기본생성자 없이 다른 생성자를 만드는 경우 -> 기본생성자 입력 오류.
 		  why? 기본생성자가 아닌 다른 생성자가 자리를 잡고 있기 때문에.
 		  그렇기 때문에 다른 생성자로 객체 생성을 진행해야 한다.
 		: 기본 생성자란 인자가 없는 생성자를 말한다.
 		  -> 클래스이름 () == 기본 생성자
 		: 생성자 역시 오버로딩이 가능하다.
 		  -> 그렇기에 하나의 클래스에 여러개의 생성자가 존재할 수 있다.
 		  -> 오버로딩의 경우, 인자의 종류나 갯수, 순서는 달라야한다.
 		  *오버로딩? 하나의 클래스 안에 같은 이름의 메소드가 여러개 존재하는 경우.
 		  *단, 메소드의 종류, 갯수, 순서는 다르다.
 		: 클래스 안에서 생성자를 만든 경우, 만들어진 생성자를 사용해야한다.
 */
	
	private String name = "둘리";
	private int age = 24;
	private boolean gender = true;
	//생성자 오버로딩 - 기본생성자, 임의 생성자 2개 전부 공존가능
	//인자 값이나 위치, 갯수가 다르기 때문에 전부 다른 생성자로 인식
	
	//기본생성자 - 멤버필드를 초기화 시킨다. -> 생성자 안 입력 내용이 1순위.
	public Ex11() { //ctr+spacebar -> constructor
		System.out.println("기본생성자");
		name = "태권브이";
		age = 43;
		gender = false;
	}
	
	//기본생성자가 아닌 경우. (인자가 있는 생성자)
	//생성자의 목적은 동일
//	public Ex11(String name, int age) { 
//		//새롭게 입력된 값. 기존 private 의 인자들과는 다름.
//		//대입시켜주기 위해서는
//		this.name = name;
//		this.age = age;
//		
//	}
	public Ex11(String name, int age) {
		System.out.println(1);
		this.name = name;
		this.age = age;
	}
	public Ex11( int age, String name) {
	//인자의 순서를 바꾸는 것만으로도 생성자는 달라짐.
		System.out.println(2);
		this.name = name;
		this.age = age;
	}
	//getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
