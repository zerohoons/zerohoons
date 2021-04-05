package com.ict01.grammar02;
class Ex03{
	public static void main(String[] args){
		//정수형 : 소숫점이 없는 숫자. - byte<short<int<long
		//정수형의 기본 값은 int
		//byte, short를 연산하면 결과는 무조건 int 이상.

		//byte = -128 ~ 127 사이의 정수만 이용가능
		byte b = -128;
		System.out.println(b);
		b = -129+3; //이용 가능 범위를 넘어가면 오류가 뜸
		System.out.println(b);

		//short = -32,768 ~ 32,767 사이의 정수만 가능
		//short s = 32760 + 100; 연산 후 값이 short의 값을 넘어서기 때문에 오류발생
		short s = 32767;
		System.out.println(s);
		
		//int/long = 범위가 정해져 있긴 하지만, 외울 필요는 없음.
		//일반적인 정수는 int를 이용. 단, 아주 큰 정수를 이용할 경우 long을 사용한다.
		//long 은 숫지 뒤에 L/l 을 사용할 수 있기 때문에 (생략도 가능)
		int i =117;
		long l1 = 117L;
		long l2 = 117l;
		long l3 = 117;
		System.out.println(i);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

		double d1 =3.14;
		System.out.println(d1);
		double d2 = 117; //자료형 형태로 보았을때는 오류이지만, 형 변환으로 인해 오류가 아님.
		System.out.println(d2);

		//실수 = 모든 수. 소수점 포함. 정수보다 무조건 크다 (크기가 아닌, 표현 범위 기준)
		//float는 숫자 뒤에 F/f를 붙인다. 단, 생략 불가능. 반드시 표기할 것!
		//정수(byte<short)<char<정수(int<long)<실수(float < double
		//float f =3.14; f 누락으로 인한 오류 발생
		float f = 3.14f; //f는 출력되지 않음
		System.out.println(f);
	
		
	}
}