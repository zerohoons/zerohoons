package com.ict03.class01;

public class Ex01 {
	public static void main(String[] args) {
		//클래스
		//정의 : 객체(오브젝트, 인스턴스화)를 만들기 위한 모든 정보를 가지고 있는 것.
		//형태 : 파일형태로 되어 있으면 *클래스를 객체로 만들어야만 사용이 가능*하다.
		
		//클래스가 가지고 있는 것들 : 데이터(상태값, 속성, 정보), 기능(동작), 생성자.
		//데이터 => 상태값, 속성 => 변수와 상수 => 멤버필드
		//기능 => 동작, 작동 => 메소드 => 멤버 메소드
		//생성자 => 클래스를 객체로 만들 때 호출된다. => 생성자 이름 == 클래스 이름
		//생성자 이름 == 클래스 이름 == 저장이름
		//생성자 클래스이름() ->괄호는 메소드의 특징 => 클래스 역시 메소드계열
		//생성자는 멤버필드(데이터)의 초기화가 목적. 
		
		//클래스의 구조 : 헤더, 멤버필드, 멤버메소드, 생성자
		//1. 헤더 : [접근제한자 : public] [클래스종류] class 클래스이름
		// -> 접근 제한자 : 외부에서 접근할 수 있는 권한을 말한다.
		//					클래스, 멤버필드, 멤버 메소드, 생성자는 모두 맨 앞에 표시 (생략도)가능
		//		1) public	 : 누구나 다 접근 가능.
		//		2) protected : 같은 패키지이거나 상속관계에서 접근 가능.
		//		3) 생략		 : 같은 패키지에서만 접근 가능.
		//		4) private	 : 외부에서는 무조건 접근 불가.
		//					 : 내부멤버(필드, 메소드)끼리만 접근 가능.
		
		//클래스의 종류 : 일반적인 클래스의 경우, 이 부분을 생략.
		//				  but, 특정 클래스의 경우 해당 예약어를 사용. (final / abstract)
		//class	: 클래스임을 나타내는 예약어
		//클래스이름 == 저장이름 == 생성자
		// => 첫글자 대문자 나머지 소문자. (두단어 이상일때 단어의 첫글자는 대문자)
		// => 특수문자는 사용불가. 숫자는 중간이나 끝에 사용가능.
		// => JavaTest01, Button01Test
		
		//2. 멤버필드(변수와 상수) : 상태값, 데이터, 속성, 특징
		// -> 변수	: 언제든지 변할 수 있는 데이터를 저장하는 공간.
		// 		=> 첫글자 소문자, 두단어 이상일 때 두번째부터 첫글자는 대문자
		// 		=> 특수문자 사용불가, 숫자는 중간이나 끝에 사용가능
		// 		=> javaTest01, button01Test
		// -> 상수	: 한번 저장하면 변경할 수 없는 데이터를 저장하는 공간
		//		=> 모든 글자가 대문자, 단어와 단어 사이에 _를 사용가능
		//		=> JAVA_TEST_01, BUTTON_01_TEST
		
		//3. 멤버메소드 : 동작, 기능, 작동하는 것
		//		=> 메소드이름 뒤에 무조건 '()'이 존재.
		//		=> 해당 메소드를 호출하면 해당 메소드가 실행됨
		//		=> 실행이 끝난 메소드는 자기를 호출한 곳으로 되돌아간다.
		//		=> main() 는 JVM이 호출한다. (main()가 끝나면 JVM으로 되돌아간다.== 프로그램 종료)
		//		=> JVM으로 main()가 되돌아가면 프로그램은 종료된다.
		// -> 메소드 구성 : [접근제한자][메소드종류] 반환형 메소드이름([인자 =매개변수]){	}
		//		1) 접근제한자 : 클래스 접근제한자와 동일함.
		//			 		  : public > protected > default(생략) > private
		
		// 		2) 메소드종류 : instance 메소드와 static 메소드로 나누어짐.
		//					    instance 메소드가 일반메소드로 이 부분을 생략한다.
		//					    static 메소드는 반드시 static 예약어를 사용한다.
		
		//	  **3) 반환형	  : 메소드는 자기를 호출한 곳으로 되돌아간다.
		//					  	이 때, 실행한 결과를 가지고 가는데, 이 자료형을 반환형이라고 한다.
		//						만일, 실행한 결과를 가지고 못가게 하기 위해서는 반환형에 void라고 쓴다.
		//						예) public static void main(String[] args) {	}
		//						=> 누구나 다 접근할 수 있고, static 메소드이며, 되돌아갈때 결과를 지참하지 않는다.
		
		//		4) 인자 == 매개변수 : 메소드가 동작을 할 때 필요한 정보를 외부에서 받아 사용할 때, 필요한 도구.
		//		   오버로딩	  : 같은 클래스 안에서 메소드 이름은 동일하지만, 인자 / 인자의 자료형 / 갯수가 다른 메소드.
		
		//		5) *getter / setter* 
		//			*->getter() : 호출하는 입장에서 메소드를 이용해서 멤버 필드의 데이터를 얻어낼 수 있다.
		//			*->setter() : 호출하는 입장에서 메소드를 이용해서 멤버 필드의 데이터를 설정할 수 있다.
		
		//4. 생성자 : 클래스를 객체로 만들 때, 한번 호출되는 것.
		//		=> 멤버 필드(변수와 상수)의 초기값을 지정하는 데에 목적을 둔다.
		//		=> 클래스 이름과 이름이 동일하기 때문에 '클래스 이름()'로 표시한다. 
		//		=> 반환형이 없는 메소드와 동일 하다.
		//		=> 클래스를 객체로 만드는 방법
		//		=> Scanner 	  sc    =   new 	  Scanner(System.in);
		//		   클래스  참조변수 = 객체생성		생성자(인자) ;
		//		=> 참조변수를 이용해서 객체가 가지고 있는 멤버필드나 멤버 메소드를 사용할 수 있다.
		//		=> 객체를 만들기 위해서는 생성자를 호출해야 하고, 반드시 해당 클래스가 가지고 있는 것만 호출이 가능하다.
		//		모든 클래스는 반드시 생성자를 가지고 있다. (인터페이스는 제외)
		//		-> 생성자가 보이지 않는 클래스는 기본 생성자로 객체를 생성하게 된다.
		//		-> 기본 생성자란 인자가 없는 생성자를 말한다. 예) '클래스이름 ()'
		//		만들어진 객체 안에 존재하는 멤버필드나 멤버메소드를 사용하는 방법
		//		-> 참조변수.멤버필드, 참조변수.멤버메소드  => scan.next(), scan.nextInt();
		//		생성자도 오버로딩이 가능하다 => 즉 하나의 클래스 안에 여러개의 생성자가 존재할 수 있다.
		
		
		//	멤버메소드와 멤버 필드는 크게 두가지 종류가 있다.
		//	instance 메소드 / 필드, static 메소드 / 필드
		//	클래스에는 일반적으로 static을 사용할 수 없다. (내부 클래스는 예외)
		//	- instance : 일반적인 메소드나 필드를 말한다.
		//			   : 객체가 생성될 때 같이 생성된는 메소드나 필드를 일컫는다.
		//	  호출방법 => 객체를 만들 때 해당 참조변수를 사용하는 데,
		//				  참조변수.메소드, 참조변수.필드
		
		//	- static   : static이 붙어있는 메소드나 필드를 말한다.
		//			   : 객체 생성과 상관없이 미리 만들어진 메소드나 필드를 말한다.
		//	  호출방법 => 객체를 만들지 않기 때문에
		//				  클래스 이름. 메소드, 클래스이름. 필드
	}
}
