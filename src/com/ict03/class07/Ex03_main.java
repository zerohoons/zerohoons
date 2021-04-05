package com.ict03.class07;

public class Ex03_main {
	public static void main(String[] args) {
		// 	내부 class는 별도로 개체생성을 할 수 없다.
//		 	Inner02 t1 = new Inner02();
		
// 메소드 안에 있기 때문에 class 안 내부 class 처럼 객체 생성 불가능
		Ex03 t1 =new Ex03();
//		Ex03.Inner02 t2 = t1.new Inner02();
		
// 내부클래스를 포함하는 메소드를 실행해야만 내부클래스를 만들 수 있다.
		t1.play();
		
// 내부클래스의 끝과 내부클래스가 속한메소드의 끝 사이에서 
// 객체를 생성하고 실행해야한다.
	}
}
