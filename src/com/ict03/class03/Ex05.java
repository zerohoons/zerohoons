package com.ict03.class03;

//phone의 기능을 갖는 클래스
public class Ex05 {
	public void call() {
		System.out.println("전화기능");
	}
	//void가 아닌 경우 변수가 필요하다.
	String s_sms;
	public String sms() {
		s_sms = "문자기능";
		return s_sms; //void 메소드가 아니면 return 필수!
	}
}
