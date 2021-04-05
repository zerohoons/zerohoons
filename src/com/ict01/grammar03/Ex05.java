package com.ict01.grammar03;
class Ex05{
	public static void main(String[] args){
		//int k1이 60 이상이면 합격 아니면 불합격
		
		int k1 = 60;
		String pass = (k1 >= 60) ? "합격" : "불합격";
		System.out.println("k1 : " + pass);
 
		//int k2가 홀수인지 짝수인지 판별하자
		
		int k2 = 3;
		String pare = ((k2 % 2) == 1) ? "홀수" : "짝수";
		System.out.println("k2 : " + pare);

		//char k3가 대문자인지 소문자인지 판별하자

		char k3 = 'c';
		String big = ('a'<=k3 && k3<='z')? ("소문자") : ("대문자");
		System.out.println("k3 : "+big);
		
		//근무시간이 8시간까지는 시간당 8720원이고, 8시간을 초과한 시간만큼은 1.5배이다.
		//현재 근무한 시간이 10시간이다. 얼마를 받아야하는가?

		int nom = 8720;
		int ot = (int)(nom*1.5);
		int time = 10;
		int time2 = time - 8;
		int mon = (time2 > 0) ? ((nom * (time-time2)) + (ot * time2)) : nom*time;
		System.out.println("급여 : " + mon);

	}
}