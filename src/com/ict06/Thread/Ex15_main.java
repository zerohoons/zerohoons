package com.ict06.Thread;
/*Thread 문제.
- 두개의 Thread를 생성하여, 첫번째의 출력을 1-100.
  두번째의 출력은 101-200까지 출력하라. (synchronized 사용)
*/
public class Ex15_main {
	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		
		new Thread(t1, "하나").start();
		new Thread(t1, "둘").start();
	}
}
