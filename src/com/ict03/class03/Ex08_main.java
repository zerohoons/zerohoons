package com.ict03.class03;

public class Ex08_main {
	public static void main(String[] args) {
		//일반적인 객체 생성
		Ex06_MP3 mp3 = new Ex06_MP3();
		mp3.call();
		System.out.println("실행 전 : " + mp3.s_sms);
		mp3.sms(); //메소드 실행
		System.out.println("실행 후 : " + mp3.s_sms);
		
		//일반적인 객체생성
		Ex07_Dca dca = new Ex07_Dca();
		dca.call();
		System.out.println("실행 전 : " + dca.s_sms);
		dca.sms(); //메소드 실행
		System.out.println("실행 후 : " + dca.s_sms);
		
		//상속관계에서는 부모클래스를 가지고 선언할 수 있다.
		//단. 자식클래스의 메소드는 사용할 수 없다.
		Ex05 p1 = new Ex06_MP3(); //그렇기 때문에 객체 생성을 다음과 같이 한다.
		//-> Ex05 클래스를 p1이라는 참조변수로 만드는 데 기능은 Ex06을 통해서 만든다.
		
		p1.call();
		p1.sms();
		System.out.println(p1.s_sms);
		
		//p1.sound(); 단 이 경우, p1은 Ex06의 고유 메소드인 sound는 실행할 수 없다.
	}
}
