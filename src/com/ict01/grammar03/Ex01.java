package com.ict01.grammar03;
class Ex01{
	public static void main(String[] args){
		// 논리 연산자 : &&(and, 논리곱) ||(or, 논리합), !(not, 논리부정)
		// 사용되는 자원 : boolean형, 비교연산, 논리연산 = 값이 True/False 인 것들
		// 결과는 boolean형 => 조건식에 사용된다.
		
		//&&(and, 논리곱, 교집합) - 주어진 조건이 모두 True 일 때만 결과가 True
		// 주어진 조건들 중에 false를 만나는 순간 결과 false
		// false를 만나면 이후에 있는 연산은 하지 않음.

		boolean result = true && true;;
		System.out.println(result);
		
		int s1 = 10;
		int s2 = 7;
		result = (s1>=7) && (s2>=5);
		System.out.println(result);

		result =  (s2<=5) && (s1>=7); //false 를 만나면 이후 연산하지 않는다.
		System.out.println(result);

		result = ((s1 = s1+ 2) > s2) && (s1 == (s2 = s2 +5));
		System.out.println(result);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		result = ((s1 = s1+ 2) < s2) && (s1 == (s2 = s2 +5));
		System.out.println(result);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		//&& 는 숫자일 경우 범위를 지정할 수 있다.
		// a>= 10 && a<=20 ;  => 10<=a<=20
		s1 = 24;
		result = (s1>=20) && (s1<=30);
		System.out.println("결과 : "+ result);
	
		//char c1이 소문자인가.
		char c1 = 'D';
		char a = 'a';
		char z = 'z';
		result = (c1>=a) && (c1<=z);
		System.out.println(result);
	}
}