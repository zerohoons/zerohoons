package com.ict01.grammar03;
import java.util.Scanner;
class Ex07 {
	public static void main(String[] args){
	
		//Scanner 클래스 알아s보기
		//클래스 안에는 constructor(생성자),  method(메소드), Field(필드)
		//java.lang에 소속되어 있는 클래스는 사용이 자유롭지만, 이외의 클래스는 소속을 표시해야한다.
		//소속을 표시할 때 쓰는 것이 바로 import 이다. => import.사용하고자 하는 클래스의 소속;
	
		Scanner scan = new Scanner(System.in);  //키보드에 입력된 내용이 scan에 저장된다.

		System.out.print("당신의 이름 : ");
		
		//저장된 정보를 가져오는 방법 (가져온 정보를 String으로 만드는 법)
		String name = scan.next();  // 기본은 String이지만, 앞에 자료형 지정과, next 뒤에 원하는 자료형을 붙힘으로써 그 자료형으로 만들 수 있음.
						//next의 경우 입력 시, 띄어쓰기를 하면 안됨.
		
		System.out.print("국어점수 : "); // 이처럼 int 네임 = scan.nextInt 로 할 경우 입력받은 값은 int가 됨
		int kor = scan.nextInt();

		System.out.print("영어점수 : ");
		int eng = scan.nextInt();

		System.out.print("수학점수 : ");
		int math = scan.nextInt();

		int sum = kor+eng+math;
		System.out.println("총점 : " + sum);
		
		//들어온 정보를 double로
		System.out.print("당신의 키 : ");
		double hei = scan.nextDouble();
		System.out.println(hei);
		
		//들어온 정보를 boolean으로
		System.out.print("당신은 남성입니까? : (true/false) ");
		boolean gender = scan.nextBoolean();
		System.out.println(gender);
		String str = gender ? "남성입니다." : "여성입니다.";
		System.out.println(str);

	}
}