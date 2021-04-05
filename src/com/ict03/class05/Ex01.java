package com.ict03.class05;

/*	interface.
 *  interface는 제공하는 서비스의 목록과 같은 것이다.
 *  상수와 추상메소드로만 이루어져있다.
 *  생성자가 존재하지 않는다 -> 객체생성이 불가능하다. -> 실제 사용이 불가능 -> 다중상속이 가능.
 *  실제 사용을 위해서는 interface를 상속받는 class를 두고 그 class를 이용해 사용한다.
 *  ★'interface가 같다.' 라는 말은 대체(호환)가 가능하다라는 의미★이다.*/

public interface Ex01 {
	//인터페이스는 상수와 추상메소드만 가지고 있다.
	//인터페이스 안에서 예약어는 필요치 않다.
	
	//상수
	final int s1 = 10;
	static final int s2 = 20;
	int s3 = 30;
	static int s4 =40;
	//위 네개의 멤버 필드는 모두 static final이다.
	//why? -> interface 내의 멤버 필드는 모두 static final로 입력 되어진다.
	
	//메소드
	public void play(); //abstract를 선언하지 않아도 추상메소드이다. -> interface내에 위치해 있기 때문에.
	public void like(); 	
	public void sound(); 	
}
