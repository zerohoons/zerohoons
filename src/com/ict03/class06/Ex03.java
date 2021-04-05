package com.ict03.class06;

enum Type2 { 
	//순서를 지키자.
	//1. 들어갈 정보
	WALK("워킹화", 270),
	RUN("러닝화", 275),
	TRACK("트래킹화", 265),
	HIK("하이킹화", 260);
	
	//2.전역변수
	final private String name;
	final private int size;
	
	//3. 생성자 -> 통해서 정보 입력 오류 해결
	Type2(String name, int size){
		this.name = name;
		this.size = size;
	}

	//4. getter -> 값을 부르기 위해서
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	
}
public class Ex03 {
	public static void main(String[] args) {
		Type2[] arr = Type2.values();
		for (int i = 0; i < arr.length; i++) { //->카운트를 활용 가능 i==2 등의
			System.out.println(arr[i].getName() + ", "+ arr[i].getSize());
		}
		System.out.println();
		for (Type2 k : arr) { //카운트를 이용 불가능 
			System.out.println(k.getName()+" "+k.getSize());
		}
		System.out.println();
		
		//개선된 for 문 : foreach문 = forin => 배열이나 나중에 배울 컬렉션에서 주로 사용
		/* for (자료형 내부에서 사용할 변수 : 배열){
		 * ':'이란 == 배열이 가지고 있는 값을 처음부터 끝까지 차례대로 내부에서 사용할 변수에 저장하는 역할 }
		 * 단, 배열의 특정한 요소를 처리할 수는 없다. */
		
		String [] msg = {"java", "jsp", "spring", "android"};
		for(String k : msg) { //배열 msg의 값이 순서대로 k에 대입되면서 문장이 작업됨.
			System.out.println(k); 
		}

		
	}
}
