package com.ict01.grammar04;
class Ex01{
	public static void main(String[] args){
		//switch ~ case 문 : if문과 같은 분기문(조건에 의해 나누어짐)
		//if문은 조건식에 boolean형, 비교연산, 논리연산을 사용하는 반면,
		//switch ~ case 문은 byte, short, char, int, String 을 사용한다.
		//if문은 범위식을 사용할 수 있지만,switch ~ case 문은 사용할 수 없다.
		//이러한 특징으로 switch ~ case 문은 if문으로의 변환이 가능하다.
		//역산의 경우 if문이 어떠한 특징을 지녔느냐에 따라 다르다.
		//형식은 : switch(인자값 = char, int, String){
		//		case(조건값1 = 인자값이 조건값 1과 같을 때): => 세미콜론이 아닌 콜론을 사용한다.
		// 		인자값 == 조건값1일때 실행할 문장; break;
		//		case(조건값2):
		// 		인자값 == 조건값2일때 실행할 문장; break;
		//		case(조건값3):
		// 		인자값 == 조건값3일때 실행할 문장; break;
		//		case(조건값4):
		// 		인자값 == 조건값4일때 실행할 문장; break;
		//		}
		//		*break 문 = 해당 switch ~ case 문을 빠져나가는 역할을 함.
		// 		 break가 없을 경우, 모든 실행문을 실행 (break를 만날때까지)
		
		//char k1이 A이면 아프리카, B이면 브라질, C이면 캐나다, 나머지 한국
		
		char k1 = 's';
		String ans =" ";
		switch (k1){
		case'A': case'a': ans = "아프리카"; break;
		case'B': case'b': ans = "브라질"; break;
		case'C': case'c': ans = "캐나다"; break;
		default: ans = "대한민국"; break;
		}
		System.out.println("결과 : " + ans);

		// int k2 가 1또는 3이면 남자 2또는 4이면 여자
		int k2 = 3;
		String str2 = " ";
		switch(k2){
		case 1: case 3: str2 = "남자"; break;
		case 2: case 4: str2 = "여자"; break;
		}
		System.out.println("결과 : " + str2);


		// String k3가 한국이면 서울, 중국이면, 베이징, 일본이면 도쿄
		String k3 = "한국";
		String str3 = " ";
		switch(k3){
		case "한국": str3 = "서울"; break;
		case "일본": str3 = "도쿄"; break;
		case "중국": str3 = "베이징"; break;
		}
		System.out.println("결과 : " + str3);
	}	
}