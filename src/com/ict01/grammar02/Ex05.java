package com.ict01.grammar02;
class Ex05{
	public static void main(String[] args){
		//자료형 : DataType : 자바에서 정보를 처리할 때 구분하는 형태
		//1. 기본자료형 : 컴파일러에 의해서 해석되는 자료형
		//		-> boolean, char, byte, short, long, float, double
		//2. 참조자료형 : 클래스를 자료형으로 선언하는 자료형
		// 		-> 그 중 String 은 참조자료형이지만, 기본자료형처럼 사용됨.

		String str = "Hello Java";
		System.out.println(str);

		//String + 연산 : 실제로 더하기와 같은 연산을 하지는 않지만, 문자를 연결하는 역할을 함.
		//		 -> String에서 +연산을 하더라도 결과는 String
		String k1 = "1000";
		int k2 = 1000;
		System.out.println(k1+10);
		System.out.println(k2+10);

		int s1 =20;
		int s2 =4;
		System.out.println(s1 + s2);
		System.out.println("결과 : "+s1 + s2); //사칙연산 순서에 따라 결과 + s1을 먼저 진행하게 됨.
		System.out.println("결과 : "+(s1 + s2)); //괄호를 이용해서 연산 우선순위 설정
	}
}