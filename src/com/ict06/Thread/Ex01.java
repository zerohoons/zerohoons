package com.ict06.Thread;

public class Ex01 {
	/* Thread 생성자
	 *	Thread = 일꾼 
	 * Thread() : 기본생성자
	 * Thread(Runnable target) : Runnable interface를 인자로 받아서 처리. -> 익명 내부클래스를 사용할 수 있다.
	 * Thread(Runnable target, String name) : 이 때 name은 Thread 이름으로 지정 가능. Runnable interface를 인자로 받아서 처리.
	 * Thread(String name) : 이 때 name은 Thread 이름으로 지정할 수 있다.
	 * 
	 *	주요 메소드
	 *	-join() : 현재 Thread는 join()메소드를 호출한 Thread가 끝날때까지 대기상태로 빠지고
	 *			  join()을 호출한 Thread가 끝나야 다시 실행된다.
	 *			  즉, join()을 호출한 Thread가 끝날 때까지 실행할 수 없다.
	 *	-start(): start()를 실행하면 run()을 호출한다. (만약, start()가 있다면 start()를 우선으로 간다.)
	 *	-run()  : start()가 호출하면 run()이 실행된다. 이를 Thread 처리를 했다 라고 한다.
	 *	-sleep(long millis) : 1000이 1초를 의미하고, 잠시 대기상태로 빠져있는 것을 말함.
	 *  -yield(): 수행 중인 Thread 중 우선순위가 같은 다른 Thread에게 제어권을 넘긴다.
	 *  -getName() : Thread의 이름 구하기.
	 *  -setName() : Thread의 이름 설정.
	 *  -currentThread() : 현재 수행되는 Thread 객체를 리턴한다. (static)*/
	
	//앞에서 만든 모든 처리는 main Thread가 혼자서 다 처리하고 있었는데 이를 싱글Thread라고 한다.
	
	//지금 일하는 Thread가 main인걸 확인해보자. : JVM이 main 메소드를 호출하면 main Thread가 무조건 일을한다.
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Ex02 test = new Ex02();
		System.out.println("1" + Thread.currentThread().getName());
		test.add(5,8);
		System.out.println("4" + Thread.currentThread().getName());
		int result = test.sub(8,5);
		System.out.println("7" + Thread.currentThread().getName());
		System.out.println(result);
	}
}
