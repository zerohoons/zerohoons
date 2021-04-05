package com.ict03.class03;

//extends Ex02를 입력함으로서, 두 개를 상속관계로 지정함. -> 자식만 부모를 이용할 수 있음.
public class Ex03 extends Ex02{
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";
	
	public Ex03() {
		System.out.println("자식클래스 생성자" +this);
	}
	
	public void sound() {
		System.out.println("자식클래스 메소드");
	}
	
	public void study() {
		System.out.println("공부 장소 : " +addr );
		System.out.println("우리집 애완동물 : " + dog); //상속관계여도 private 는 사용불가
		System.out.println("name : " +this.name); //this는 선택사항.
		System.out.println("name : " +super.name ); //변수 이름 같은 게 있을 경우 부모 클래스 것을 호출 할때는 super
	}
	
	//오버라이딩 - 부모메소드의 겉모양은 그대로 사용하면서 내용만 변경하는 것.
	@Override
	public void poppy() {
		System.out.println("부모 메소드를 그대로 불러와서 내용은 내가 바꾼다. == 오버라이드.");
	}
	
//	public final void walk() { 
//		System.out.println("하루에 무조건 1시간은 걸어다닌다.");
//	} -> final이 붙은 것들은 오버라이딩이 불가능하다.
	// 부모메소드에 final이 있으면 override 할 수 없다.
	
}
