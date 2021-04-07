package com.ict06.Thread;
/*	wait() : 동기화 처리를 할 때, 실행 중인 Thread를 강제로 대기상태로 재우는 메소드 -> notify()하지 않으면 대기상태로 프로그램 종료.
 *	notify() : wait() 상태의 Thread를 깨워주는 메소드  
 *	notifyAll() : 모든 wait() 상태의 Thread를 깨우는 메소드 */
public class Ex14 implements Runnable {
	int x = 0;
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+ " : "+ (++x));
			
			if(x==25) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
	}
}
