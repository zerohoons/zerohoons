package com.ict01.grammar02;
class Ex02{
	public static void main(String[] args){
		//문자형 - char : 하나의 글자를 저장 가능
		//문자를 사용하기 위해서는 홑따옴표를 사용한다. = 문자를 표현하는 코드 :ASCII, 유니코드
		//최종 저장은 숫자로 저장되어진다. ( 컴퓨터가 읽을 수 있게 ) 그렇기에 연산이 가능!
		//호출 시에는 입력했던 문자로 나온다.
		char k1;
		k1 = 'a'+ 1;
		System.out.println(k1);

		k1 = 65;
		System.out.println(k1);

		k1 = 1;
		System.out.println(k1);
		
		char k2 = '대'; //한글, 특수문자 등의 언어도 가능.
		System.out.println(k2);

	}
}