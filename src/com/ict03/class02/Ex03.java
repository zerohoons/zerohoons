package com.ict03.class02;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		//Random : Math.random(); Random 클래스
		 
		//1. Random 클래스
		Random rand = new Random();
		
		//각종 자료형의 데이터를 무작위로 추출.
		System.out.println("====================");
		System.out.println("boolean 형 " + rand.nextBoolean());
		System.out.println("int 형 " + rand.nextInt());
		System.out.println("long 형 " + rand.nextLong());
		
		//실수형태는 0.0~1.0미만이 기본
		System.out.println("====================");
		System.out.println("float 형 " + rand.nextFloat());
		System.out.println("double 형 " + rand.nextDouble());
		
		//특정 범위를 지정해서 사용하는 방법
		//1) nextInt(정수) : 0 ~ 정수 전까지 랜덤의 수 발생/
		
		System.out.println("====================");
		int s1 = rand.nextInt(3); //0 ~ 2 중 랜덤
		System.out.println(s1);
		
		//2) (int)(nextDouble()*정수) : 0 ~ 정수전까지 랜덤의 수 발생
		
		System.out.println("====================");
		int s2 = (int)(rand.nextDouble()*3); // 0 - 2 중 랜덤 수 발생
		System.out.println(s2);
		
		//2. Math 클래스 - 생성자가 없음 -> 모든 메소드가 static -> 객체 생성없이 호출 가능.
		
		//1) random() : 0.0 ~ 1.0 미만
		
		System.out.println("====================");
		System.out.println(Math.random());
		
		//특정 범위를 지정해서 사용하는 방법
		//2) (int)(Math.random()*정수) : 0 ~ 정수전까지 랜덤의 수 발생
		
		System.out.println("====================");
		int s3 = (int)(Math.random()*3);
		System.out.println(s3); // 0 - 2 중 랜덤 수 발생
		
		//3) abs : 절대값 반환
		
		System.out.println("====================");
		System.out.println(Math.abs(-100));
		System.out.println(Math.abs(100));
		
		//4) ceil, round, floor : 올림, 반올림, 버림
		
		System.out.println("====================");
		System.out.println(Math.ceil(3.45));
		System.out.println(Math.ceil(3.55));
		System.out.println("====================");
		System.out.println(Math.round(3.45));
		System.out.println(Math.round(3.55));
		System.out.println("====================");
		System.out.println(Math.floor(3.45));
		System.out.println(Math.floor(3.55));
		System.out.println("====================");
		
		//5) max / min : 두개의 값 중에 크거나 작은값을 찾음.
		
		System.out.println("max : "+ Math.max(44.9,45));
		System.out.println("min : "+Math.min(-44.5, -45));
		System.out.println("====================");
		
		//6) pow(double a, double b) : 제곱 == a의 b승
		
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(3, 2));
		}
}
