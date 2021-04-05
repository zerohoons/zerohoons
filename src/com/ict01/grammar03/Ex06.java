package com.ict01.grammar03;
class Ex06{
	public static void main(String[] args){
		//중첩 삼항 연산자 : 삼항 연산자가 중첨 된 것
	//char k1 이 대문자인지, 소문자인지, 기타문자인지 판별하자.

	char k1 = '_';
	String res1 = ('A'<= k1 && k1 <= 'Z') ? "대문자" : ('a'<= k1 && k1 <= 'z')? "소문자" : "기타문자";
	System.out.println(res1);
	
	//int k2가 90 이상이 A학점, 80이상이면 B학점, 나머지는 F학점
	
	int k2 =58;
	String res2 = (k2 >=90) ? "A학점" : (k2>=80) ? "B학점" : "F학점";
	System.out.println(res2);

	//int k3이 1또는 3이면 남자 2또는 4이면 여자, 나머지는 외국인

	int k3 = 6;
	String res3 = (k3 <=4 && k3 >=0)? ((k3 % 2)==1) ? "남자" : "여자" :"외국인";
	System.out.println(res3);

	}
}