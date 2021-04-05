package com.ict03.class07;

/* 내부class : class 안에 다른 class가 정의되어 있는 클래스
 * 			  : Member, Local, Static, Anonymous 로 총 네가지가 존재.
 *  1. Member : 외부class {멤버필드, 생성자, 멤버 메소드, 내부class {......}}
 *  	-> 내부 class가 외부 class의 멤버 필드와 메소드를 마음대로 사용. (상속과 비슷하다. 외부 = 부모, 내부 = 자식)
 *  	-> 상속은 private인 경우 상속할 수 없지만, 내부class의 경우 private 도 사용 가능.
 *  	-> 내부 class를 별도로 생성할 수 없다. (외부class를 통해서만 생성 가능.
 *  
 *  2. Local : 외부 class 메소드 안에 내부 class가 존재한다.
 *  	-> 지역변수처럼 사용되어진다. (외부class의 메소드가 호출이 되야만 내부클래스를 생성할 수 있다. 또한 메소드를 벗어나면 내부클래스는 삭제된다.)
 *  
 *  3. static : Member 내부class처럼 외부 class 안에 내부 class가 존재한다.
 *  	-> 단, 내부 class의 멤벼 변수는 static을 사용할 수 없다.
 *  	-> 어쩔 수 없이, 멤버 변수에 static을 사용하고자 할 때에는
 *  	-> 해당 내부class에 static을 붙힌다. => 내부class 멤버는 일반 static처럼 사용 가능하다. (객체 생성 X) => 바로 접근 가능
 *  												(클래스 이름.변수, 클래스이름.메소드)로 
 * 	4. 익명 (Anonymous) : 정의된 class의 이름이 없는 내부class
 * 					-> 한번 호출하면 다시 호출 할 수 없다.
 * 					-> 일회용으로 한번 사용하고 다시 사용할 수 없다 -> 이벤트처리에 많이 활용.
 */
public class Ex01 {

}
