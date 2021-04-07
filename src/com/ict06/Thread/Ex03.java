package com.ict06.Thread;

/*	Thread는 start() -> run() 의 이동을 보인다.
 *			 start() -> start() / run() -> run() 의 이동은 Thread가 아니다.*/

/*	Thread 실행방법.
 *	1)Thread class 상속받기. => start(), run() 모두 갖고 있다.
 *	2)Runnable interface 상속받기. => run()만 보유하고 있다. start() 없음.*/
public class Ex03 extends Thread{
	
	public void go(){ //싱글처리. go()->go() 
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
//	@Override
//	public void start(){
//		for (int i = 1; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName()+" "+i);
//		}
//	}
	
	@Override
	public void run(){
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
