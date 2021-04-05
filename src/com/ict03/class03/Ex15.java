package com.ict03.class03;

public class Ex15 extends Ex14 {
	String name = "홍일점";
	int id = 2410;
	public Ex15() {
		super("영심이", 13);//super() 생략되어있음.
		System.out.println("자식클래스 생성자 " + this);
		name = "홍두께";
		id = 1004;
	}
	public Ex15(String name) {
		super("태권브이" , 25);
		this.name = name;
	}
	
	public void prn() {
		String name = "홍시";
		// 지역, 전역, 부모 모두 같은 이름을 같고 있기 때문에 반드시구분!
		System.out.println("지역변수이름 : "+name);
		System.out.println("전역변수이름 : "+this.name);
		System.out.println("부모변수이름 : "+super.name);
		
		//부모만 가지고 있는 변수 -> 구분할 필요 없음.
		System.out.println("지역변수이름 : "+age);
		System.out.println("전역변수이름 : "+this.age);
		System.out.println("부모변수이름 : "+super.age);
		
		//전역변수만 가지고 있는 변수
	//	-> 부모를 지나서 전역변수를 보기때문에 super에서 오류 발생.
		System.out.println("지역변수이름 : "+id);
		System.out.println("전역변수이름 : "+this.id);
	//	System.out.println("부모변수이름 : "+super.id)
	}
}
