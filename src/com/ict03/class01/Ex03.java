package com.ict03.class01;

public class Ex03 {
	//메소드 : 기능, 동작
	//반환형 : *메소드를 호출*하면 해당 메소드가 실행된다. 실행이 끝나면, 자신을 호출한 곳으로 되돌아간다.
	//			되돌아갈 때, 결과를 가지고 가는 경우가 바로 반환형 메소드이다. 반면에 그렇지 않은 경우를 void 라고 한다.
	//			반환형이 있는 경우에는 반드시 "return 결과값(보낼데이터);" 가 마지막줄에 존재해야한다.
	
	int s1 =10;
	int s2 = 5;
	int result = 0;
	
	//반환형이 있는 경우
	public int sub01() {
		result = s1 + result;
		return result;
	}
	//반환형 없음
		public void plus01() {
			result = result + s2;
		}
}
