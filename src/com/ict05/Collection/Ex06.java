package com.ict05.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {
	public static void main(String[] args) {
		/*List interface를 구현한 class들 : Stack, ArrayList, Vector;
		 * ArrayList 와 Vector : 배열과 가장 흡사한 구조. 단, 배열과 달리 삽입, 삭제, 추가가 자유롭다.
		 * 					   : 크기를 미리 지정하는 번거로움이 없다.
		 * 					   : ArrayList는 동기화 지원하지 않지만, Vector는 동기화를 지원한다.
		 *  #동기화란? 인터넷 티케팅처럼 하나의 공석에 여러 입력이 있을 때, 동기화를 통해 하나의 입력값만 입력시킨다.
		 * Set 구조는 순서X , 중복 X
		 * List 구조는 순서 O, 중복 O -> Stack, ArrayList, Vector 역시 순서 O, 중복 O */
		
		//ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		//추가 : add
		list.add("박찬호");
		list.add("류현진");
		list.add("손흥민");
		System.out.println(list);
		
		//삽입 : add
		list.add(1,"추신수");
		System.out.println(list);
		
		//contains 활용
		if(list.contains("손흥민")) {
			//검색 : 위치값 검색
			System.out.println(list.indexOf("손흥민")+ " 번째 위치");
			
			//검색 : 해당 위치에 존재하는 객체를 검색
			System.out.println(list.get(3));
			System.out.println(list.get(list.indexOf("손흥민")));
			//elementAt, firstElement, lastElement 는 없음.	
		}else {
			System.out.println("존재하지 않습니다.");
		}
		
		
		//size
		System.out.println(list.size() + "요소가 존재함");
		
		//치환 : set
		list.set(3, "이대호");
		System.out.println(list);
		
		//연습해보자. ( 추신수가 있으면, 추신수를 이종범으로 바꿔보자.)
		
		if(list.contains("추신수")) {
			list.set(list.indexOf("추신수"), "이종범");
			System.out.println(list);
		}else {
			System.out.println("추신수는 없습니다.");
		}
		
		//하나씩 꺼내보자.
		//방법 1) 개선된 for문
		
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println();
		//방법 2) iterator
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1);
		}
		System.out.println("=========================================");
		//Vector
		Vector<String> vector = new Vector<String>();
		
		//추가
		vector.add("둘리");
		vector.add("도우너");
		vector.addElement("또치");
		System.out.println(vector);
		
		//삽입
		vector.add(2, "희동이");
		System.out.println(vector);
		
		//contains 활용
		
		if(vector.contains("둘리")) {
			//검색 : 위치값 검색
			System.out.println(vector.indexOf("둘리")+ " 번째 위치");
			
			//검색 : 해당 위치에 존재하는 객체를 검색
			System.out.println(vector.get(0));
			System.out.println(vector.get(vector.indexOf("둘리")));
			//elementAt, firstElement, lastElement 는 없음.	
		}else {
			System.out.println("존재하지 않습니다.");
		}
		
		//size
		System.out.println(vector.size() + "요소가 존재함");
		
		//치환
		vector.set(0, "공실이");
		System.out.println(vector);
		
		//하나씩 꺼내보기
		//방법 1) 개선된 for문
		
				for (String k : vector) {
					System.out.println(k);
				}
				System.out.println();
				//방법 2) iterator
				Iterator<String> its = vector.iterator();
				while (its.hasNext()) {
					String s1 = its.next();
					System.out.println(s1);
				}
	
	}
}
