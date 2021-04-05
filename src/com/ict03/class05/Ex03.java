package com.ict03.class05;

/* interface 상속
 * 1. 일반 class가 interface를 상속한다면, 무조건 오버라이딩이 필수!
 * 2. 추상 class가 interface를 상속한다면, 둘 다 추상이기 때문에 오버라이딩 필요없다.
 * 3. interface가 inetrface를 상속한다면, 동일 계통이기에 오버라이딩 필요없다.
 * 4. interface는 다중상속이 가능하다.
 * 	->자식 interface extends 부모interface1, 2, 3; 
 * 5. 일반 class가 부모 class와 부모 interface를 같이 상속하려면,
 * 	-> class 이름 extends 부모class implements interface;
 * 6. interface -> interface, class -> class : extends 예약어 사용 : 자식 -> 부모
 * 	  class -> interface : implements 예약어 사용. interface -> class는 사용 불가능
 */
class Ex03 implements Ex01 {
	
	//class가 interface를 부모로 두기 때문에 override 필수!
	public void like() {
		// TODO Auto-generated method stub
		
	}public void play() {
		// TODO Auto-generated method stub
		
	}public void sound() {
		// TODO Auto-generated method stub
		
	}
}

//추상class 가 interface 상속하는 경우
abstract class Ex04 implements Ex01{
	//override 필요 없음.
}

//interface가 interface를 상속하는 경우
interface Ex05 extends Ex01{
	//override 필요없음
}