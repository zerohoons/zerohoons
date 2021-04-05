package com.ict01.grammar02;
class Ex07{
	public static void main(String[] args){
	//이름이 홍길동인 사람의 국어 90, 영어 80, 수학 90이다.
	// 총점과 평균을 구하시오 (평균은 소숫점 첫째자리까지 구한다.)
	// 원하는 정보를 받기 : 입력
	
	String name = "홍길동";
	int hk = 90;
	int he = 80;
	int hm = 90;
	
	int sum = hk+he+hm;
	double ave = (double)(sum)/3.0;
	ave = (int)(ave*10);
	ave = ave/10.0;
	System.out.println("이름 : " + name);
	System.out.println("총점 : " + sum);
	System.out.println("평균 : " + ave);
	
	
 	}
}