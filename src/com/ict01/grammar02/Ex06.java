package com.ict01.grammar02;
class Ex06{
	public static void main(String[] args){
	// 산술연산자 ; +, -, *, /, %(나머지)
	// byte < short < char < int < long < float < double
	// 작은 자료형과 큰 자료형을 연산하면 큰 자료형으로 변경.
	// int + int = int, long + long = long, float + float = float
	// 예외) byte + byte = byte(X) int
	// 	 short + short = short(X) int
	//	 byte + short = short(X) int

	// 원단위 절삭
	int k1 = 21755;
	int s1 = k1 /10;
	int s2 = s1*10;
	int s5 = (k1/10)*10;
	System.out.println(s2);
	System.out.println(s5);
	// 소숫점 첫째자리까지 구하기.
	double k2 = 24.6843;
	int s3 = (int)(k2*10);
	int s4 = (int)(s3/10.0);
	int s6 = (int)((k2*10)/10.0); // int 이기 때문에 소숫점 첫째자리 무시. 
	double s7 = s3 / 10.0; // 소숫점 첫째자리를 구하기 위해 데이터를 double로 변경.
	System.out.println(s4);
	System.out.println(s6);
	System.out.println(s7);

	// % 는 나눈 나머지를, /는 나눈 결과를 실행하며, int 에서 /는 몫이다.
	int su1 = 7;
	int su2 = 3;
	int res1 = 7/3;
	int res2 = 7%3;
	System.out.println(res1);
	System.out.println(res2);
	
	//어떤수를 2로 나눈 나머지가 1과 같으면 홀수
	//어떤수를 2로 나눈 나머지가 0과 같으면 짝수
	}
}