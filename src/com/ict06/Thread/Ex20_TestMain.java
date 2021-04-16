package com.ict06.Thread;

public class Ex20_TestMain {
	public static void main(String[] args) {
		//공통자원 = 임계영역 -> 동기화처리
		
		Ex17_Car car = new Ex17_Car();
		
		Ex18_producer producer = new Ex18_producer(car);
		Ex19_Customer customer = new Ex19_Customer(car);
		
		new Thread(producer).start();
		new Thread(customer).start();
		
	}
}
