package com.ict06.Thread;

//Runnable interface�� run()�� ������ �ִ�.
public class Ex09 implements Runnable {
	@Override
	public void run() {
		while (true) {
			
			System.out.println(Thread.currentThread().getName()+"333333333");
		}
	}
}
