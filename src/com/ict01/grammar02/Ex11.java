package com.ict01.grammar02;
class Ex11{
	public static void main (String[] args){
		//비교 연산자 : 변수나 상수의 값을 비교할때 사용
		//결과는 항상 boolean -> 조건식에 사용된다.
		//String 에서의 사용은 하지말자.
		
		int s1 = 90;
		int s2 = 80;
		boolean res = s1>= s2; // 선언 -> 계산 -> 저장 의 단계로 이루어짐
		System.out.println("결과 : "+ res); //왼쪽 값을 기준.

		char s3 ='c';
		char s4 = 'a';
		res =s3>=s4;
		System.out.println("결과 : "+ res); // char도 숫자이기 때문에 비교가 가능
		res = s3 !=s4;
		System.out.println("결과 : "+ res);
		
		//char 과 int 비교
		res = 'a'>=97;
		System.out.println("결과 : "+ res); // char도 숫자이기 때문에 비교가 가능

		//int와 double 비교
		res = 97 ==97.0;
		System.out.println("결과 : "+ res);
		res = 97 == 97.0000001;
		System.out.println("결과 : "+ res);
		System.out.println();
		String str1 = "대한민국";
		String str2 = "대한민국";
		//res = str1 >= str2; 부등호는 오류
		//System.out.println("결과 : "+ res);
		//res = str1 > str2;
		//System.out.println("결과 : "+ res);
		res = str1 == str2;
		System.out.println("결과 : "+ res); // 결과는 나오지만 사용하지 말 것. class이기 때문에 답이 고정적이지 않음.
	}
}