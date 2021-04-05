package com.ict03.class01;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 test = new Ex06();
		//System.out.println(t.name); // name이 private이기 때문에 오류
	
		//private 의 정보를 메소드를 이용해서 불러옴
		//이 때의 메소드를 getter 메소드라고 부름
	
		String name = test.namae();
		int age = test.tosi();
		double height = test.sei();
		char rank = test.tani();
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println(" 키  : "+height);
		System.out.println("성적 : "+(char)(rank));
		
		//private 메소드는 변경이 불가능하다.
		//이때 다른 메소드를 이용해서 이를 변경 하는데, 이 메소드를 setter 메소드라 부름.
		test.m1("김길동");
		test.m2(55);
		test.m3(176.8);
		test.m4('B');
		
		name = test.namae();
		age = test.tosi();
		height = test.sei();
		rank = test.tani();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println(" 키  : "+height);
		System.out.println("성적 : "+(char)(rank));
		
	
	}
}