package com.ict03.class07;

import com.ict03.class07.Ex02.Inner01;

public class Ex02_main {
	public static void main(String[] args) {
		//Inner01 t1 = new Inner01(); 내부class는 별도로 객체를 생성하지 못함
		//외부 class를 통해서 내부 class사용 가능
		
		Ex02 t1 = new Ex02();
		Ex02.Inner01 t2 = t1.new Inner01(); //이런식으로 외부class를 통해서 객체를 생성.
		//실행 시 주소에 $이 나오는 데, 이는 내부class라는 표시
		
		System.out.println(t2.name);
		System.out.println(t2.i2);
		System.out.println(t2.i4);
		t2.play();
		System.out.println();
		
	}
}
