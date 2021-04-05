package com.ict03.class03;

public class Ex04 {
	public static void main(String[] args) {
		Ex03 t1 = new Ex03();
		//객체생성의 경우, 자식 클래스를 부르더라도 우선 실행되는 것은 부모 클래스이다.
		System.out.println(t1);
		
		//멤버 이용 우선 순위 (지역변수 -> 권역번수 -> 상속변수 ->상속의 상속의 상속~~~~~)
		//부모와 자식이 같은 이름의 필드를 갖고 있으면 자식클래스 멤버필드를 우선으로 이용한다.
		System.out.println(t1.name);
		//자식클래스에 존재하지 않는 멤버의 경우, 부모클래스의 멤버를 이용한다.
		System.out.println(t1.addr);
		
		//메소드 역시 이와 마찬가지이다.
		t1.sound();
		t1.study();
		
		//자식과 부모가 같은 메소드를 가지고 있다면, (오버라이딩의 경우) 자식클래스 메소드를 우선사용.
		t1.poppy();
		System.out.println("=====================");
		
		//static은 객체 생성과 상관없다.
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
	}
}
