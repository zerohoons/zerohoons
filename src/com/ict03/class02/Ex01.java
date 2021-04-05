package com.ict03.class02;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String msg = "";
		
		String msg10 = "ButteredReader";
		int k1 = msg10.indexOf("er");//처음으로 나오는 er 찾기
		System.out.println(k1);
		k1 = msg10.indexOf("er",msg10.indexOf("er")+1);//두번째 나오는 er 찾기
		System.out.println(k1);
		k1 = msg10.lastIndexOf("er");
		System.out.println(k1);
		
		boolean k2 = msg10.contains("e");
		System.out.println(k2);
		
//12. isEmpty() : boolean == 비어있니? -> 비어있으면 true
		String msg11 = "";
		String msg12 = "java";
		
		System.out.println(msg11.isEmpty()); //null 에서는 사용불가
		System.out.println(msg12.isEmpty());

//13. length() : int
//	  문자열의 길이를 숫자로 표시
		
		System.out.println(msg11.length());
		System.out.println(msg12.length());
		System.out.println();
		
/*14. replace(char oldChar, char newChar)
 * 	  replace(String target, String replacement)
 * 	  문자나 문자열을 받아서 치환 => String 
 * 	  char -> char / String -> String. 상호 교환은 불가능*/
		String msg13 = "대한민국";
		String msg14 = msg13.replace("대한민국","Korea");
		String msg15 = msg13.replace('한','韓'); 
		System.out.println(msg13);
		System.out.println(msg14);
		System.out.println(msg15);

/* 15. split(String regex) : String[]
 *	-> 구분자를 받아서 배열로 나눈다. (배열크기는 자동으로)
 *	   split(String regex, int limit) : String[]
 *	-> 구분자를 받아 배열로 나눈다. 단 limit 가 배열 크기.*/

		String msg17 = "사과, 딸기, 망고, 오렌지, 파인애플";
		String [] res = msg17.split(","); // 방을 나눌 기준을 넣어줌.
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		System.out.println();
		String [] res2 = msg17.split(",", 2);
// , 기준으로 하되 두개로 나누기 때문에 첫 , 이후가 전부 하나로
		for (int i = 0; i < res2.length; i++) {
			System.out.print(res2[i] + " / ");
		}
		System.out.println();
		String [] res3 = msg17.split(",", 3);
		for (int i = 0; i < res3.length; i++) {
			System.out.print(res3[i] + " / ");
		}
		System.out.println();
		
// 기준(,)의 갯수보다 많은 수의 나눔을 요구했을 때 -> 가능한만큼만 진행.
		String[]res4 = msg17.split(",", 10);
		for (int i = 0; i < res4.length; i++) {
			System.out.print(res4[i]+ " / ");
		} System.out.println();

/* 16. substring(int beginIndex) : String
*	-> 시작위치를 받아, 해당 문자열 끝까지 문자열을 추출
*	   substring(int beginIndex, int endIndex)
*	   시박위치를 받아 끝 위치 전까지 해당 문자열 추출*/
		
		String msg18 = "가나-다라-마바사";
		System.out.println(msg18.substring(2));
		System.out.println(msg18.substring(2, 7)); // 끝 위치인 "마" 포함 안됨. 문자열 길이를 입력하면 끝까지 가능.
		System.out.println(msg18.substring(msg18.indexOf("-")+1,msg18.lastIndexOf("-")));
		
		String msg19 = "000301";
		//태어난 연도 추출
		String res7 = msg19.substring(0, 2);
		System.out.println();
		//태어난 달 추출
		String res8 = msg19.substring(2, 4);
		
		//Q) 010 - 7777 - 9999 -> 010 - XXXX - 9999 / 010 - 7777 - XXXX
		String quiz = "010-7777-9999";
		String[] anser = quiz.split("-");
		anser[1] = anser[1].replace(anser[1],"XXXX");
		for (int j = 0; j < anser.length; j++) {
			System.out.print(anser[j]);
		}
		System.out.println();
//		String anser3 = anser[0]+ "anser[2]"+ anser[2]);
		
/* 17/18. toLowercase / toUppercase
 * 		-> 해당 문자열의 모든 문자를 변경 ( 대문자 -> 소문자 / 소문자 -> 대문자 ) */
		
		String msg20 = "자바8 java8 JAVA8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();
		
		System.out.println(res9);
		System.out.println(res10);
/* 19. toString() : String
 *	-> String의 toString : 문자열 자체를 반환
 *	-> Object의 toString : 모든 객체에서 사용가능. 객체의 정보나 값들을 문자열로 리턴할 때 사용. (오버라이딩에서 이용) */
		
		String msg21 = "java8 JAVA8 자바8";
		String res11 = msg21.toString();
		System.out.println(msg21);
		System.out.println(res11);
/* 20. trim() : String
 * 	-> 해당 문자열 앞, 뒤에 있는 공백을 제거. 중간은 제거안함.*/
		
		String msg22 = "                 java 자바      JAVA         ";
		System.out.print(msg22);
		System.out.println(" : "+msg22.length());
		System.out.print(msg22.trim());
		System.out.println(" : "+msg22.trim().length());
/* 21. valueOf(각종자료형) : static String
 *	-> 어떤 자료형이든지 String 으로 변경시킨다. */
		boolean p1 = true;
		char p2 = 'd';
		int p3 = 100;
		long p4 = 10l;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		//각종 자료형에 +1
		
		//System.out.println(p1+1); 오류 -> boolean은 연산 불가.
		System.out.print("boolean" + "/ "); //char + 정수 = 정수
		System.out.print(p2+1 + " / "); //char + 정수 = 정수
		System.out.print(p3+1 + " / ");
		System.out.print(p4+1 + " / ");
		System.out.print(p5+1 + " / ");
		System.out.println(p6+1 + " / ");
		System.out.print(String.valueOf(p1)+1 + " / "); 
		System.out.print(String.valueOf(p2)+1 + " / "); 
		System.out.print(String.valueOf(p3)+1 + " / ");
		System.out.print(String.valueOf(p4)+1 + " / ");
		System.out.print(String.valueOf(p5)+1 + " / ");
		System.out.println(String.valueOf(p6)+1 + " / ");
		
/*  Wrapper Class : valueOf의 반대역할. (각종 자료형을 또 다른 자료형으로 변경.)
 * 	-> Boolean, Integer, Double (Byte, Short, Long, Float, Character도 존재는 함)
 * 	-> 각 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경시키는 클래스.
 * 	-> 원래 의미는 기본자료형을 객체로 만들 때 사용하는 클래스. 
 * 	-> 기본 자료형 -> 객체형으로 자동 변경 : 오토박싱
 * 	-> 객체형 -> 기본 자료형으로 자동 변경 : 오토언박싱 */ 

//  1) boolean 형태의 String을 Boolean(클래스) 형으로 변경.
//		-> Boolean.parseBoolean("true" / "false")를 이용해 boolean을로 변경
//		-> 이때 String 값이 true 나 false를 제외한 값이라면, 전부 false값으로 나옴.
		msg = "true";
		/*	boolean 형이 아니기에 오류가 발생
		 *  if(msg){
		 *  	break;
		 *  }
		 */
		
		//boolean a1 = Boolean.parseBoolean(msg); //parseBoolean 은 static 메소드이기 때문에 클래스 생성 필요없음.
		
		if( Boolean.parseBoolean(msg)) {
			System.out.println("변경성공");
		}
		
//	2) int 형태의 String을 int형으로 변경 : Integer.parseInt(String s)
		
		msg = "100";
		int a2 = Integer.parseInt(msg);
		System.out.println(msg + 1);
		System.out.println(a2 + 1);
		
//	3) double 형태의 String 을 double로 변경 : Double.parseDouble(string s)
		
		msg = "100.00";
		double a3 = Double.parseDouble(msg);
		System.out.println(msg + 1);
		System.out.println(a3 + 1);
		
//	4) char 형태의 String을 char 형으로 변경할 수 있는 메소드는 존재하지않음.
// 		-> Character 클래스는 존재함.
//		-> 문자열에서 charAt(위치값)을 이용하면 변경이 가능하다.
		
		msg = "c";
		char a4 = msg.charAt(0); //char로 바꿀 값의 위치값 입력
		
		System.err.println(msg + 10);
		System.err.println(a4 + 10);

		//Q) 주민번호 앞자리를 받았을 때 나이를 구하자.
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		String gender = "1";
		
		//앞의 두자리
		String year = jumin.substring(0,2);
		
		//19나 20을 붙이기.
		
		if(gender == "1" || gender.equals("2")) {
			year = "19" + year;
		}else if(gender == "3" || gender.equals("4"))  {
			year = "20" + year;
		}
		
		//나이 구하기.
		
		int age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(year) + 1;
		System.out.println(age);

		
	}
}
