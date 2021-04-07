package com.ict06.Thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		//t1.start() : Runnable interface 는 start()가 없음
		
		//실행할 run()메소드를 가질 class, 즉. 타겟을 지정해야한다.
		// -> Thread Thread1 = new Thread(); 기본 생성자는 타겟이 없어서 불가능.
		Thread thread1 = new Thread(t1); //타겟 인자를 지정.
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		//안드로이드에서 주로 쓰는 방법 - 익명 내부 클래스
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName()+"ㅁㅁㅁㅁㅁㅁㅁㅁㅁ");					
				}
			}
		}).start();
		
	}
}
