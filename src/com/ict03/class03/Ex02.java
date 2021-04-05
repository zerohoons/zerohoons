package com.ict03.class03;

public class Ex02 {
	String name =  "차범근";
	int age = 57;
	String addr = "서울";
	/*private*/ String dog = "댕댕이"; //상속관계여도 private 는 사용불가
	static int car = 2;
	
	public Ex02() {
		System.out.println("부모클래스 생성자" + this);
	}
	
	public void prn() {
		System.out.println("부모클래스 메소드");
	}
	
	public static void play() {
		System.out.println("부모 클래스 static 메소드");
	}
	
	public void poppy() {
		System.out.println("멍멍");
	}
	
	public final void walk() { //final ~ 마지막의~ -> 자식클래스에서 정정할 수 없음.
		System.out.println("하루에 무조건 1시간은 걸어다닌다.");
	}
}
