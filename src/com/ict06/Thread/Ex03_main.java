package com.ict06.Thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 test = new Ex03();
		test.go();
		System.out.println("수고하셨습니다.");
		System.out.println("===============");
		
		//Thread 처리를 위해서 start()를 호출
		//-> 큰 차이 없이 위와 동일한 결과 -> Thread 처리 실패.
		//why? run()으로 가야하지만, start()가 class안에 존재하기 때문에 우선적으로 start()로 가게됨.
		//how? Ex03 class에 존재하는 start()를 지우면(주석처리) -> run()으로 정상 Thread 처리가 됨.
		System.out.println(Thread.currentThread().getName());
		test.start(); // Thread는 자신 대신 일을 할 존재를 두고 바로 다음 문장을 진행. -> 실행결과 아래 문장이 start()메소드보다 빠르게 실행됨.
		System.out.println("수고하셨습니다.");
		System.out.println("===============");
		test.run();
		System.out.println("수고하셨습니다.");
		System.out.println("===============");
	}
}
