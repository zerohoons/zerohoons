package com.ict03.class04;

public abstract class Ex01 { //추상메소드를 지니고 있기 때문에 클래스 역시 abstract!
	/* 추상 클래스 : 한 개 이상의 추상메소드를 가지고 있는 클래스를 추상클래스라고 한다.
	 * 				-> 일반적인 메소드와 필드를 가질 수 있다.
	 * 				-> 추상클래스는 abstract 예약어를 사용한다. */
	
	/* 추상 메소드 : 구체화가 되지 않은 메소드를 의미한다.
	 * 				-> body블록이 존재하지 않는 메소드이다. => 실행문을 지니지 않았음을 의미함. => 구체화가 되지 않음.
	 * 				-> 반드시 abstract 예약어를 사용한다. */
	
	/* 다형성	   : 하나의 메소드나 클래스가 존재할 때, 다양한 방법으로 동작시키는 것을 의미한다. */
	
	int s1 = 10;
	static int s2 = 10;
	final int s3 = 10;
	static final int s4 = 10;
	
	public void play() {
		System.out.println("인스턴스 메소드");
	}
	public static void prn() {
		System.out.println("static 메소드");
	}
	
	//추상메소드
	public abstract void sound(); //바디가 존재하지 않음 -> {}가 없음
}
