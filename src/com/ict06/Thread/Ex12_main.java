package com.ict06.Thread;

public class Ex12_main {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		/*join() : 현재 Thread는 join()을 호출한 Thread가 끝날 때까지 대기상태에 빠진다.
		 		   이후, join()을 호출한 Thread가 종료가 되면, 다시 실행된다.
		 		   즉. join()을 호출한 Thread가 작업을 종료할 때까지 현재 Thread는 대기상태*/
		
		//join() 입력하는 법
		try { thread1.join();
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName()+ " : "+i);
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 끝");
		
		
	}
	
}
