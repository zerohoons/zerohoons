package com.ict03.class05;

public class Ex02 {
public static void main(String[] args) {
	//Ex01 멤버필드가 static이라는 증거.
	System.out.println(Ex01.s1); //객체 생성 없이 이용가능
	System.out.println(Ex01.s2);
	System.out.println(Ex01.s3);
	System.out.println(Ex01.s4);
	
//	//값변경 역시 불가능하다.
//	System.out.println(Ex01.s1++); -> 변경하려고 할 시, 오류발생.
//	System.out.println(Ex01.s2++);
//	System.out.println(Ex01.s3++);
//	System.out.println(Ex01.s4++);
}
}
