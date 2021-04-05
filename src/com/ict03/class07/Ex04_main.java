package com.ict03.class07;

import com.ict03.class07.Ex04.Inner03;

public class Ex04_main {
	public static void main(String[] args) {
		//static안에 내부 class는 그냥 호출 가능
		System.out.println(Inner03.i4);
		System.out.println(Inner03.i3);
		
		//static 내부 클래스 중 static이 없는 멤버는
		//객체 생성 후 사용가능 (외부클래스 사용안함)
		Inner03 t1 = new Inner03();
		System.out.println(t1.name);
		System.out.println(t1.i2);
		t1.play();
		
	}
}
