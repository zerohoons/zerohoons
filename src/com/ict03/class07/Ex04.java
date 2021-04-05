package com.ict03.class07;

public class Ex04 {

		String name = "홍길동";
		private static int age =24;
		static String addr ="제주도";
		
		public Ex04() {
			System.out.println("외부클래스 생성자 : " + this);
		}

//		public void sound() {
//			int money = 1000;
//			final int time = 2;
//			//지역변수는 static 사용불가.
//			//static int numer = 12;
//			//static final int number2 = 12;
//			System.out.println("외부클래스 메소드 : "+name + ", money :" + money);
//		}
		
		public static class Inner03{
			String name = "홍일점";
			final int i2 = 10;
			//내부클래스는 static 사용불가
			//static int i3 = 20;
			//정 사용하고 싶다면? -> 클래스를 static으로 바꾼다.
			static int i3 = 20;
			static final int i4 = 30; //-> static 상수는 가능
		
			public Inner03() {
				System.out.println("내부클래스 생성자 : "+this);
			}
			
			//내부 class는 외부 class의 메소드와 필드를 마음대로 사용가능
			//내부클래스 메소드
			public void play() {
				int money = 50000;
				System.out.println("name : " + name + "\rmoney : "+ money);
				//외부 클래스의 필드 static을 붙여야 사용 가능
				System.out.println( "age : " + age);
				//외부 클래스의 메소드도 static을 붙여야함.
//				sound();
			}
		}
		
	}


