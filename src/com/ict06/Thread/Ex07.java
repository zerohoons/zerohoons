package com.ict06.Thread;

//Runnable interface는 run()만 가지고 있다.
public class Ex07 implements Runnable {
	@Override
	public void run() {
		while(true) {
		System.out.println(Thread.currentThread().getName()+"1111111111");
	
		}
	}
}
