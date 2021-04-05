package com.ict03.class01;

public class Ex02 {
		//클래스 안에는 3가지가 존재한다.
		//멤버필드, 멤버메소드, 생성자
		
		//멤버필드 : 상수와 변수, static과 instance로 나눠진다.
		//static이 없으면 인스턴스 (객체 생성할 때 같이 만들어진다.)
		//static이란 객체 생성과 상관없이 미리 만들어진다.
	
		int k1 = 80;				//인스턴트 변수
		static int k2 = 90;			//static 변수
		final int K3 = 85;			//인스턴트 상수 (final이 붙으면 상수)
		static final int K4 = 95;	//static 상수
		//메소드 밖에서는 System.out.println(); 사용불가능
		
		//상수에는 final이 붙는다!! - 상수는 한번 지정한 값을 변경할 수 없음.
		//멤버메소드 : 동작, 기능
		// => 메소드는 자기를 호출한 곳으로 반드시! 되돌아 간다.
		//void 는 반환형의 유무를 알려준다!!
		public void prn01(){ 				//인스턴스, 반환형이 없는 메소드
			k1 = k1 +20;
			k2 = k2 +15;
			System.out.println("k1 : " + k1);
			System.out.println("k2 : " + k2);
			//K3 = k3+15; K4 = K5+5; K3, K4는 상수이기 때문에 값변경이 불가 -> 오류발생

			//지역변수 : 메소드 안에서 만들어진 변수
			//		     메소드 안에서 만들어진 변수는 메소드를 호출할 때 생성된다.
			//			 메소드가 끝나면 사라진다.
			//			 지역변수는 static 변수를 만들 수 없다.
			int s1 = 10;
			final int s2 = 20;
			//static int s3 = 30; static final int s4 = 40; 지역변수는 static 변수를 만들 수 없음.
			
			s1 = s1+20;
			
			
		}
		
		public static void prn02() {	//static, 반환형이 없는 메소드
			//k1 = k1 +20; K3 = k3+15; static 메소드에서는 instance 변수를 사용할 수 없다.
			k2 = k2 +15;  
			System.out.println("K4 : " + K4); //static 메소드에서 static 상수여도 값은 바꿀 수 없음. 
			
			int s1 = 10;
			final int s2 = 20;
			
			//static int s3 = 30; static final int s4 = 40; 
			//static 메소드라 하더라도, 지역변수는 static 변수를 만들 수 없음.
			
			return;
		}
		
		//반환형의 자료값보다 같거나 작은 자료형은 넣을 수 있음.
		public int prn03() { return 'c'; }	 			//인스턴스, 반환형 있는 메소드, 마지막 줄 return '보낼데이터'
		//=> 반환형 자료형 : int, 들어간 값 char
		public static double prn04() {return 147; }	//static, 반환형 있는 메소드
		//=> 반환형 자료형 : double, 들어간 값 : int
}
