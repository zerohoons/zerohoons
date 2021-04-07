package com.ict06.Thread;

//Runnable interface는 run()만 가지고 있다.
public class Ex08 implements Runnable {
	@Override
	public void run() {
		while(true) {
			
			System.out.println(Thread.currentThread().getName()+"222222222");
		}
	}
}
