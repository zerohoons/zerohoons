package com.ict06.Thread;

//Runnable interface�� run()�� ������ �ִ�.
public class Ex08 implements Runnable {
	@Override
	public void run() {
		while(true) {
			
			System.out.println(Thread.currentThread().getName()+"222222222");
		}
	}
}
