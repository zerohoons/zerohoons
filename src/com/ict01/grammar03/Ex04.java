package com.ict01.grammar03;
class Ex04{
	public static void main(String[] args){
		//삼항 연산자 ( 조건연산자 = if~else문과 같다.)
		// 저장변수 = 조건식 ? 참일때 실행할 문장; 거짓일때 실행할 문장
		// 조건식에는 boolean, 논리연산, 비교연산이 들어간다.
		// 저장변수, 참일때 실행문장, 거짓일때 실행 문장은 전부 같은 데이터 타입이어야한다.
		// (단, 저장변수가 다른 두 자료형 보다 더 큰 자료형이면 문제없다.)
		// byte < short < char < int < long < float < double ;

		int result = true ? 14 : 10;
		System.out.println("결과 : " + result);
		
		result = false ? 14 : 10;
		System.out.println("결과 : " + result);

		int result2 = false ? 14 : 'C';
		System.out.println("결과 : " + result2);
		System.out.println("결과 : " + (char)(result2));

		//주어진 sum이 80 이상이면 합격, 불학격
		int sum = 81;
		String result3 = (sum >= 80) ? "합격" : "불합격";
		System.out.println("결과 : " + result3 );

		double avg = 87.0 ;
		double result4 = (avg >= 90) ? 'A' : 'B';
		System.out.println("결과 : " + (char)(result4));
	}
}