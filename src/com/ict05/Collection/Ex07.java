package com.ict05.Collection;

import java.util.LinkedList;

public class Ex07 {
	public static void main(String[] args) {
		//Queue(큐) interface를 구현한 class : LinkedList
		//FIFO (First In First Out) : 먼저 들어온 정보가 먼저 나간다.
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		//추가 / 삽입 : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedlist.add("박찬호");
		linkedlist.offer("박세리");
		linkedlist.add("김미현");
		System.out.println(linkedlist);
		
		linkedlist.addFirst("김광현");
		System.out.println(linkedlist);

		linkedlist.offerFirst("둘리");
		System.out.println(linkedlist);
		
		//요소 찾기
		if(linkedlist.contains("박세리")) {
			//위치 찾기
			System.out.println(linkedlist.indexOf("박세리"));
			//지정 위치에 있는 값 찾기
			System.out.println(linkedlist.get(3));
			System.out.println(linkedlist.get(linkedlist.indexOf("박세리")));
			System.out.println(linkedlist.getFirst());
			System.out.println(linkedlist.getLast());
		}
		
		//size
		System.out.println(linkedlist.size() + " 요소가 존재함");
		
		//둘리를 이대호로 변경하자.
		if(linkedlist.contains("둘리")) {
			linkedlist.set(linkedlist.indexOf("둘리"), "이대호");
			System.out.println(linkedlist);
		}else {
			System.out.println("둘리는 없습니다.");
		}
		
		//삭제 : remove, removeFirst, removeLast
		linkedlist.removeFirst();
		System.out.println(linkedlist);
	
		linkedlist.removeLast();
		System.out.println(linkedlist);
	
		System.out.println(linkedlist.remove(1)); //remove는 삭제되는 값을 내보내기 때문에 출력 가능. 
		System.out.println(linkedlist);
	}
}
