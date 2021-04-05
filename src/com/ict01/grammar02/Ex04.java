package com.ict01.grammar02;
class Ex04{
	public static void main(String[] args){
		// 숫자 크기에 따른 저장원리.
		// char<int<long<float<double;
		//(문자) (정수형) (실수형)
		// 형변환 : 자동 변환/ 강제형 변환
		// 자동형 변환 : 작은 자료형이 큰 자료형에 저장 될 때 이뤄짐. = 프로모션
		// char 을 int에 저장할 수 있다.
		char c1 = 'a';
		System.out.println(c1);
		int s1 = 'a';
		System.out.println(s1);
		int s2 = c1; //변수 c1이 저장 되는 것이 아닌, c1의 데이터인 a가 저장이 됨
		System.out.println(s2);
		
		//int를 long에 저장할 수 있다.
		long l1 = s1;
		System.out.println(l1);
		
		//long을 float / double 에 저장할 수 있다.
		float f1 = l1;
		System.out.println(f1);
		// 강제형 변환 : 큰 자료형을 작은 자료형으로 저장 할 때 나타나는 오류를 없애고 강제로 변환하는 것. 
		//		그렇기에 정보손실이 발생한다. = 디모션
		// =를 기준으로 무조건 왼쪽자료형에 맞춘다. =(왼쪽자료형)(대상)
		
		// byte b1 = 128; 오류발생. 형변환 필요
		 byte b1 = (byte)(128); //강제 형변환 -> byte 진법으로 바뀜 128-> -128
		b1 = (byte)(129); // -127 추출 why? 127이 끝이었기 때문에 제일 적은 값 -128로 돌아가서 다시 세는 것. 
		System.out.println(b1);

		//int를 char 에 넣기
		char c2 = 97; //오류 아님. char는 숫자에서 값을 불러오기 때문에
		System.out.println(c2);
		
		int s3 = 97;
		// char c3 = s3; 오류. char보다 큰 int값(s3)를 char에 넣을 수 없음.
		char c3 = (char)(s3); // 강제 형변환
		System.out.println(c3);

		//float / double 을 int 로 저장
		//int k5 = 87.64; -> 오류 발생 int에 double 값을 대입함.
		int k5 = (int)(87.64); //87 출력 0.64의 정보 손실.
		System.out.println(k5);

		//소숫점 첫째까지 구하자.
		System.out.println(k5/10); // 소숫점 제거.
		System.out.println(k5/10.0); //소숫점 유지.
		
		//1의 자리 절삭
		int k6 =230415;
		k6 = k6/10;
		k6 = k6*10;
		System.out.println(k6);

	}
}