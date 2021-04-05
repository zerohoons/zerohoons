package com.ict03.class04;

//일반 클래스는 추상클래스를 상속할 때 반드시 추상클래스의 추상메소드를 오버라이딩 해야한다.
public class Ex02 extends Ex01 {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}

//오버라이딩을 하지 않는 방법
//1) 자식 클래스를 abstract 클래스로 만든다.
//	-> 부모의 추상메소드를 구체화 하지 않음.

abstract class Ex03 extends Ex01{
	public void song() {
		
	}
}

//2) 자식클래스에 추상메소드를 만든다.
//	->부모의 추상메소드를 구체화 하지 않음.
abstract class Ex04 extends Ex01{
	public void Music() {
		System.out.println("음악");
	}
	public abstract void Pop();
}
