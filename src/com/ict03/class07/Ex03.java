package com.ict03.class07;

/*
 * 
 */
public class Ex03 {
	String name = "둘리";
	int hight = 160;
	public Ex03() {
		System.out.println("외부 : " + this);
	}
	
	public void sound() {
		String addr = "서울";
		System.out.println("호이~ 호이~");
	}
	//내부클래스를 담은 메소드
	public void play() {
		int age = 24;
		class Inner02{ //메소드 안 내부클래스 public 사용 불가
			String name = "희동이";
			int age = 5;
			public Inner02() {
				System.out.println("내부 : "+this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(hight);
				//System.out.println(addr); 자신이 속한 메소드가 아니면 사용할 수 없음.
				System.out.println(age);
			}
		} //내부 클래스 끝
	Inner02 in02 = new Inner02(); //외부멤버
	System.out.println(name); //외부 메소드
	sound();
	in02.hobby();
	} //외부 메소드 끝
}
