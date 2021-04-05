package com.ict03.class01;

public class Ex14 {
	/*static : 객체 생성과 상관없이 미리 만들어지는 필드와 메소드
			   클래스와 지역변수에서는 static을 사용할 수 없다.
			   공유개념으로 모든 객체가 사용이 가능하다.
			   하지만, 접근제한자가 private라면 static이라도 접근할 수 없다. */
	
	int su1 = 10;
	static int su2 = 10;
	
	//기본생성자
	public Ex14() {
		su1 ++;
		su2 ++;
	}
	
	public void prn() {
		int su3 = 10;
		//static int su 4 = 10; -> 오류발생 : 지역변수에서는 static을 사용못함
	}
	
	//static 메소드는 static 변수를 참조할 수 있다.
	public static void prn2() {
//		System.out.println(su1); -> 인스턴스 변수는 참조할 수 없음
		System.out.println(su2);
		int su4 = 10;
//		static int su5 = 10; -> static을 선언하는건 static 메소드도 불가능
	}
}
