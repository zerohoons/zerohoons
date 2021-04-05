package com.ict01.grammar03;
class Ex11 {
	public static void main(String[] args){
	// 다중 if 문 : 조건식이 거짓일 때 다시 조건식을 사용한다.
	// if (조건식 1) {
	//	조건식 1이 참일때 실행;
	//}else if (조건식 2){
	//	조건식 1은 거짓, but 조건식 2가 참일 때 실행;
	//}else if (조건식 3){
	//	조건식 1, 2는 거짓, but 조건식 3이 참일때 실행;
	//}else{
	//조건식이 전부 거짓일 때 실행;
	//}

	// int k1 의 점수가 90 이상이면 a 80이상은 b 70이상은 c 나머지는 f
		int k1 = 90;
		String ans = "A";
		if(k1>=90){
		ans = "A";
		} else if (k1>=80) {
		ans = "B";
		} else if (k1 >=70) {
		ans = "C";
		} else {
		ans = "F";
		}
		System.out.println(ans);

	// char k2 가 대문자 소문자 숫자 기타문자인지 판별

		char k2 = '3';
		String ans2 = " ";
		if (k2>='0' && k2 <='9') {
		ans2 = "숫자";
		} else if(k2>='a' && k2 <='z'){
		ans2 = "소문자";
		} else if(k2>='A' && k2 <='Z'){
		ans2 = "대문자";
		}else {
		ans2 = "기타문자";
		}
		System.out.println(ans2);

	// char k3가 A,a이면 아프리카 B,b면 브라질 C,c면 캐나다 나머지한국
	
		char k3 = 'a';
		String ans3 = " ";
		if(k3 == 'a'||k3 == 'A'){
		ans3 = "아프리카";
		} else if (k3 == 'b' || k3 == 'B'){
		ans3 = "브라질";
		} else if (k3 == 'c' || k3 == 'C'){
		ans3 = "캐나다";
		}else {
		ans3 = "한국";
		}
		System.out.println(ans3);	

	// menu가 1이면 카페모카 3500, 2이면 라떼 4000원 3이면 아메리카노 3000 4면 과일주스 3500원
	// 친구와 2잔을 만원내고 먹었다. 잔돈은 얼마?

		int menu = 3;
		int change = 0;
		int how = 2;
		int moca = 3500;
		int late = 4000;
		int ame = 3000;
		int fruit = 3500;
		double tax = 1.10;
		if (menu == 1){
		change = 10000 - (int)(tax*(how*moca));
		} else if (menu == 2){
		change = 10000 - (int)(tax*(how*late));
		} else if (menu == 3){
		change = 10000 - (int)(tax*(how*ame));
		} else if (menu == 4){
		change = 10000 - (int)(tax*(how*fruit));
		}
		System.out.println(change);
	}
}