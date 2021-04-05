package com.ict01.grammar03;
import java.util.Scanner;
class Ex10{
	public static void main(String[] args){
	//if ~ else ~ : 조건식이 참일때와 거짓일때 각각 나누어 처리한다 = 삼항연산자 =?:
	//형식 : if(조건식){ 조건식이 참일 때 실행할 문장 } else { 조건식이 거짓일 때 실행할 문장}
	Scanner sc = new Scanner(System.in);
	//int k1 이 60 이상이면 합격 아니면 불합격

	int k1 = 60;
	String ans = " ";
	if (k1<=60){
		ans = "불합격";
	} else {
	ans = "합격";
	}
	System.out.println(ans);

	//int k2 가 홀수인지 짝수인지 판별하자
	
	int k2 = 3;
	String ans2 = " ";
	if((k2 % 2)==0) {
		ans2 = "짝수";
	}else {
	ans2 = "홀수";
	}
	System.out.println(ans2);
	

	//char k3 가 대문자인지 대문자가 아닌지

	char k3 = 'D';
	String ans3 = " ";
	if(k3<='A' || k3>='Z'){
	ans3 = "대문자가 아님";
	}else {
	ans3 = "대문자";
	}
	System.out.println(ans3);

	//k4가 1또는 3이면 남자 아니면 여자
	
	int k4 = 2;
	String ans4 = " ";
	if (k4 == 2 || k4 == 4){
	ans4 = "여자";
	}else {
	ans3 = "남자";
	}
	System.out.println(ans4);
	
	//근무시간 8시간까지는 시간당 8720, 초과하면 1.5배. 지금 10시간 근무. 받을금액 얼마?
	
	double time = 10;
	double pay = 8720;
	int sum = 0;
	
	if (time > 8) {
	sum = (int)(((time-8)*(pay*1.5)) + (pay*8));
	}else {
	sum = (int)(pay*time);
	}
	System.out.println(sum);
	
	}	
}