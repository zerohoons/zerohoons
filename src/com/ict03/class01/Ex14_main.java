package com.ict03.class01;

public class Ex14_main {
	public static void main(String[] args) {
		Ex14 t1 = new Ex14();
		System.out.println(t1.su1);
		System.out.println(t1.su2);
		System.out.println(Ex14.su2); //static은 선언하지 않고서도 불러올 수 있다.
		System.out.println();
		
		Ex14 t2 = new Ex14();
		System.out.println(t2.su1); //인스턴스는 메소드 종료 후 값이 복귀
		System.out.println(t2.su2); //static은 클래스 종료 전까지 값이 복귀되지 않음.
		System.out.println(Ex14.su2);
		System.out.println();
		
		Ex14 t3 = new Ex14();
		System.out.println(t3.su1);
		System.out.println(t3.su2);
		System.out.println(Ex14.su2);
		System.out.println();
	}
}
