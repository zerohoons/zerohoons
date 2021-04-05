package com.ict01.grammar03;
class Ex02{
	public static void main(String[] args){
		// || => 논리합, OR
		// 주어진 조건 중 하나라도 true 이면 결과는 true
		// 조건 중 true를 만나면 이후 연산은 실행하지 않는다.

		int s1 = 10;
		int s2 = 7;
		boolean result = false || false ;
		System.out.println("결과 : " + result);
		
		result = (s1 >= 15) || (s2 <= 5); 
		System.out.println(result);

		result = true || false ; //뒤가 거짓이지만 앞이 참이기에 참.
		System.out.println(result);
		System.out.println();
		result = (s1>=15) || (s2>=5); // 앞이 거짓이나, 뒤 조건이 참이기에 결과는 참.
		System.out.println(result);

		//OR은 true를 만나면 뒤에 연산을 하지 않는다.
		result = ((s1 = s1 + 2) > 20) || (s1 == (s2 = s2 + 5));
		System.out.println(result);
		System.out.println(s1);
		System.out.println(s2);

		result = ((s1 = s1 + 2) < 20) || (s1 == (s2 = s2 + 5));
		System.out.println(result);
		System.out.println(s1);
		System.out.println(s2); // 앞 조건이 참이어서 계산 되지 않았기 때문에 값의 변화가 없음.

		//! => NOT, 논리부정
		// - 주어진 논리값을 반대로 만듦 (스위칭기법)
		// -true -> ! -> false / false -> ! -> true

		result = true;
		System.out.println(!result);   //true -> false
		System.out.println(!!result);  // false -> true
		System.out.println(!!!result); //true -> false
	}
}