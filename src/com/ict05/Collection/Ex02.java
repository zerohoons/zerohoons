package com.ict05.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		//	Set interface를 상속받은 class : HashSet, TreeSet
		//	HashSet과 TreeSet의 사용방법은 모두 같다.
		//	그러나 TreeSet은 내부에서 항상 오름차순 정렬상태를 유지한다.
		//	set은 특정 기준으로 정렬을 할 수 없다.
		//	HashSet, TreeSet 모두 중복 안됨
		
		//	컬렉션 생성
		//	HashSet<Genetic Type = 객체타입 = 같은 Class> 참조변수 = new HashSet<Genetic Type>();
		//	HashSet<Genetic Type = 객체타입 = 같은 Class> 참조변수 = new HashSet<>();
		
		HashSet<String> h1 = new HashSet<>(); // String -> 문자열형 객체 모임
		HashSet<Integer> h2 = new HashSet<Integer>(); // Integer -> 정수형 객체 모임. <안>은 생략 가능.
		HashSet<Double> h3 = new HashSet<>(); // Double -> 정수형 객체 모임. <안>은 생략 가능.
		HashSet<Boolean> h4 = new HashSet<>(); // Boolean -> 논리형 객체 모임
		
		// h2(정수형)에 객체를 추가하는 방법
		// 방법1) 기본자료형을 객체로 만들어서 넣기. => Boxing
			Integer k1 = new Integer(10);
			Integer k2 = new Integer("10");
			
		//방법2) 기본자료형을 그냥 넣는다
		//기본 자료형으로 입력 시 -> 자동적으로 객체로 변환되어서 넣어짐. : AutoBoxing
			h2.add(k1); //방법1															//true
			h2.add(k2); //방법1															//false
			h2.add(10); //방법2 -> 기본자료형 넣는 방법									//false
			h2.add(new Integer(10));//방법3 -> 클래스를 넣는 방법						//false -> 중복을 허용하지 않기 때문에 첫 값만 입력이 되고 나머지는 쫓겨남.
			//h2.add('A'); -> Genetic 타입 다르면 오류 : 자료형 크기차이와 상관 없음.	
			
			h3.add(3.14);
			h3.add(new Double(31.4));
			//h3.add(14); 같은 Genetic 타입이 아니면 무조건 오류
			
		//내용보기 (전체 내용 보기)
			System.out.println(h2); //중복을 어용하지 않기 때문에 같은 값은 하나만 들어올 수 있음.
			System.out.println(h3);
			System.out.println(h4);
		
			h1.add("java");
			h1.add("Java");
			h1.add("JAVA");
			h1.add("jsp");
			h1.add("Jsp");
			h1.add("JSP");
			h1.add("spring");
			h1.add("SPRING");
			
			System.out.println(h1);
			
		//하나씩 꺼내서 사용하기
		//방법1) 개선된 for문 (일반 for문은 사용 불가 -> index가 없음.)
			for (String k : h1) {
				String msg = k;
				System.out.println(msg);
			}
			System.out.println("========================");
		//방법2) iterator()
		Iterator<String> it = h1.iterator(); //h1에 차례대로 접근하는 변수명 it
		while (it.hasNext()) {					//hasNext() : 다음이 존재하면 true 아니면 false
			String string = (String) it.next();	//하나씩 다음것으로 넘기면서 지정.
			System.out.println(string);
		}
	}
}
