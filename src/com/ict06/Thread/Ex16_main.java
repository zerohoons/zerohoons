package com.ict06.Thread;
/* 문제 2) Ex15파생문항
 * 두 개의 Thread를 생성하여, 첫번째의 출력을 1-50까지.
 * 두번째의 출력을 51-100. 다시 첫번째가 101부터 150까지 출력.
 * 두번째가 151에서 200까지 출력. (synchronized / wait / notify 이용)*/
public class Ex16_main {
	public static void main(String[] args) {
		Ex16 t1 = new Ex16();
		
		new Thread(t1,"하나").start();
		new Thread(t1,"둘").start();
		
	}
}
