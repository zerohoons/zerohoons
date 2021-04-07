package com.ict06.Thread;

//데몬 스레드 : 일반 Thread의 작업을 돕는 보조적인 역할을 수행하는 Thread
//				일반 Thread가 종료되면 데몬 Thread는 강제적으로 종료됨.
public class Ex11_main {
	public static void main(String[] args) {
		//데몬 Thread 만들기. Daemon Thread
		System.out.println(Thread.currentThread().getName()+ " 시작");
		Ex10 t1 = new Ex10();
		Ex11 t2 = new Ex11();
		
		Thread thread1 = new Thread(t1);
		thread1.setDaemon(true); // 데몬 Thread 설정
		thread1.start();
		
		//new Thread(t2).start(); 이 형식에선 데몬 Thread 설정 불가능.
		Thread thread2 = new Thread(t2);
		thread2.setDaemon(true); // 데몬 Thread 설정
		thread2.start();
		
		
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName()+" " + i);
		}
		System.out.println(Thread.currentThread().getName()+ " 끝");
		
		//일반 Thread에서 실제로는 시작, 끝이 정상적으로 작동이 되었지만 빠른 일처리 속도로 확인 불가능
		//Daemon Thread의 경우 main이 끝나면 Thread도 종료되기 때문에 확인 가능.
	}
}
