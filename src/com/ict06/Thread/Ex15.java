package com.ict06.Thread;
/*Thread 문제.
- 두개의 Thread를 생성하여, 첫번째의 출력을 1-100.
  두번째의 출력은 101-200까지 출력하라. (synchronized 사용)
*/
public class Ex15 implements Runnable{
	int x = 0;
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ (++x));
		}
	}
}
