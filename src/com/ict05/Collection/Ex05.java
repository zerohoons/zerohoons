package com.ict05.Collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	/*List interface를 구현한 class들 : Stack, ArrayList, Vector;
	 * 	Stack : 마지막에 들어온 Data가 가장 먼저 나감. : LIFO
	 * 	주요 메소드
	 * 	add, push, addElement : 추가 메소드
	 * 	add(index, E) : 삽입 메소드
	 * 	pop : 맨 위에 존재하는 객체를 반환하고 삭제한다.
	 *	peek :	맨 위에 존재하는 객체를 반환. 하지만 삭제는 하지 않는다. -> 무한루프에 빠질 위험성 존재.
	 *	search : 검색(오른쪽, 1부터)
	 *	indexOf : 검색(왼쪽, 0부터) -> 배열방식.
	 *	elementAt(index) : 위치값을 받아서 해당 객체 추출
	 *	get(index) : 위치값을 받아서 해당 객체 추출
	 *	firstElement : 맨 처음 요소 추출
	 *	lastElement	 : 맨 마지막 요소 추출
	 *	setElement(Element, index) : 치환 */
	public static void main(String[] args) {
	Stack<String> stack = new Stack<String>();
	stack.add("둘리"); 			//추가
	stack.addElement("공실이"); //추가
	stack.push("마이콜");		//추가
	System.out.println(stack);  
	
	stack.add(1, "도우너");	//삽입
	System.out.println(stack);
	
	stack.add(0, "또치");	//삽입
	stack.add(1, "희동이"); //삽입한 위치에 다시 삽입하는 것도 가능. -> 중복X
	System.out.println(stack);

	stack.add(1, "공실이"); //중복 -> 사용가능
	System.out.println(stack);
	System.out.println("====================");
	//마지막객체보기.
	//peek
	System.out.println(stack.peek());
	System.out.println(stack);
	//pop
	System.out.println(stack.pop());
	System.out.println(stack); //-> pop후에는 마지막 객체가 사라짐
	System.out.println("====================");
	//contains, indexOf, search, get, elementAt, firstElement, lastElement
	if(stack.contains("희동이")) {
		System.out.println("존재함");
		//해당 객체의 위치값 알아내기
		System.out.println(stack.indexOf("희동이") + " 번째에 위치함 / indexOf"); //indexOf와 search는 세는 방향과 시작 숫자가 달라 결과가 다르다.
		System.out.println(stack.search("희동이") + " 번째에 위치함 / search");
		
		//해당 위치의 객체 꺼내기
		System.out.println(stack.get(2)); //get : 값을 끄집어 냄. 위치는 indexOf와 동일.
		System.out.println(stack.get(stack.indexOf("희동이"))); 
		System.out.println(stack.elementAt(stack.indexOf("희동이"))); 
		System.out.println(stack.firstElement()); //위치 0인 객체
		System.out.println(stack.lastElement());  //마지막 위치의 객체
		
	}else {
		System.out.println("존재하지않음");
	}
	System.out.println("====================");
	//size
	System.out.println(stack.size() + "요소가 존재합니다.");
	//setElementAt : 요소값 치환
	stack.setElementAt("마이콜", 3);
	System.out.println(stack);
	//set : 치환
	stack.set(3, "뚜치"); //setElementAt과 입력 순서가 다름.
	System.out.println(stack);
	System.out.println("====================");
	//하나씩 꺼내기.
	//방법1) 개선된 for 문 -> 데이터 유지
	for (String k : stack) {
		System.out.println(k);
	}
	System.out.println(stack.size() + "요소가 존재합니다.");
	System.out.println();
	//방법2) iterator -> 데이터 유지 
	Iterator<String> it = stack.iterator();
	while (it.hasNext()) {
		String msg = (String) it.next();
		System.out.println(msg);
	}
	System.out.println(stack.size() + "요소가 존재합니다.");
	System.out.println();
	//방법3) pop -> 데이터가 삭제됨.
	while(!stack.isEmpty()) {
		String k = stack.pop();
		System.out.println(k + " 삭제됨, 크기는 "+ stack.size());
	}
	System.out.println(stack.size() + "요소가 존재합니다.");
	}
}