package com.ict06.Thread;

public class Ex13 implements Runnable {
	/* 임계영역 : 멀티Thread에서 공통으로 사용되는 영역
	 * 			  현재 수행중이 Thread가 순식간에 다른 Thread에게 제어권을 빼앗기는 문제 발생 -> 동기화 처리를 통해 해결
	 * 동기화처리 : 임계 영역의 synchronized 예약어를 사용해서 이뤄진다.
	 * 				사용할 경우, 현재 실행중인 Thread가 끝날 때까지 다른 Thread가 임계영역에 접근해서 제어권을 빼았을 수 없다. 
	 */
	
	public synchronized void run() {  //synchronized 로 동기화 처리
		int x = 0;
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+ (++x));
		}
	}
	
}
