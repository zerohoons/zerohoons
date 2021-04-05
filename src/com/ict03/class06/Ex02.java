package com.ict03.class06;

enum Type{
	WALKING,RUNNING,TRACKING,HIKING
}
public class Ex02 {
	String name;
	int size;
	Type type;
	
	public static void main(String[] args) {
		//System.out.println(name); -> 객체를 만들지 않았기 때문에.
		
		Ex02 shose = new Ex02();
		shose.name = "나이키";
		shose.size = 275;
		shose.type = Type.WALKING;
		System.out.println("브랜드명 : "+ shose.name);
		System.out.println("사이즈 	 : "+ shose.size);
		System.out.println("신발타입 : "+ shose.type);
	}
}
