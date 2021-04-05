package com.ict03.class07;

// Anonymous 내부 클래스
//	-> 대상이 보통 추상클래스나 인터페이스에 많이사용
abstract class Car {
	abstract void run();
}

class Bus extends Car{
	@Override
	void run() {
	System.out.println("80으로 달린다!");
	}
}

class Taxi extends Car{
	@Override
	void run() {
	System.out.println("160으로 달린다!");	
	}
}

class Police extends Car{
	
	@Override
	void run() {
	System.out.println("200으로 달린다!");	
	}
}

class Ex05{
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		System.out.println();
		
		Car car = new Taxi();
		car.run();
		
		//Anonymous 내부 클래스란 이런것!
		Car car2 = new Car() {
			
			@Override
			void run() {
				System.out.println("Anonymous 내부클래스입니다.");
				
			}
		};
		car2.run();
	}
}