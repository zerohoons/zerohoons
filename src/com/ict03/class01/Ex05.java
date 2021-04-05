package com.ict03.class01;

public class Ex05 {
	//접근제한자 : 외부에서 접근하여 사용할 수 있는 단계를 구분. (public > protected > default(생략) > private)
	// public	 : 누구든 다 접근 가능
	// protected : 같은 패키지이거나 다른패키지이지만 상속관계인 경우 접근 가능
	// 생략		 : 같은 패키지에서만 접근 가능
	// private	 : 외부에서는 접근 불가. 내부에서만 가능
	
	public int s1 = 10;
	private int s2 = 20;
	public static int s3 = 30;
	private static int s4 = 40;
	
	public void add() {
		s1 = s1+10;
		s2 = s2+10;
		s3 = s3+10;
		s4 = s4+10;
	// private는 클래스 내부에서는 접근이 가능하다.	
	}
	
	private void add2() {
		s1 = s1+10;
		s2 = s2+10;
		s3 = s3+10;
		s4 = s4+10;
	}
	//메소드가 메소드를 호출함으로써 private 에 접근.
	//메소드는 메소드를 호출 할 수 있다.
	void add3() {
		add2();
	}
}
