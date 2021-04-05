package com.ict03.class01;

public class Ex07 {
	private String name = "둘리";
	private int age = 13;
	private double height = 135.15;
	private boolean gender = true;
	private char rank = 'A';
	
	//getter 또는 setter 호출하기.
		//menu -> Source -> Generate getter and setter
		//get이름 == getter / set이름 == setter *boolean 형의 경우 getter은 get이 아닌 is
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //=> this.전역변수 = 지역변수; 
		//지역변수(대입할 변수)와 전역변수(대입받을 변수)의 이름이 같을 때, 전역변수에 this를 붙힌다.
		//지역변수와 전역변수의 이름이 같을 때 우선순위는 지역변수이다.
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public char getRank() {
		return rank;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
}
