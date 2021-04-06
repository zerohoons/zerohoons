package com.ict05.Collection;
/* 제네릭 - 컬렉션의 집합체. == 타입
 * 컬렉션 - 특정 객체로만 구성이 되어져 있는 것. == 자료구조
 * 객체 - 클래스로 만들어짐
 * -> 제네릭 - 클래스로 만들어진 특정 객체 그룹들의 집합체.
 */
public class Ex01 {
/*	제네릭과 컬렉션(자료구조)
 * 	Genetic	   : Collection이 어떤 객체들로 이루어졌는지를 표시하는 객체 타입.
 * 	Collection : 객체들을 모아서 관리하는 인터페이스를 구현한것.
 * 	API		   : <T> - 객체 타입. type , <E> - 요소. elements (Collection 안에 존재하는 객체 하나)	
 *			  	 Map 형식에서는 <K, V> - Key, Value 
 *				 Key와 Value가 1:1 대응으로 Key를 호출하면 Value가 나온다.
 *
 *	형식	   : Collection<Genetic>
 *	최상위 Collection : Collection<E>, Map<K,V>
 *	Collection<E>를 상속받은 인터페이스 : Set<E>, List<E>, Queue<E> */
	
/*	Collection<E>의 주요 메소드.
 * 	1. 	add(E e) : boolean 형 ->  해당 Collection에 값을 추가. 성공시 true.
 * 	2. 	addAll(Collection <? extends E<c) : boolean형 -> Collection<? extends E> : 어떠한(?) 요소를 상속받은 컬렉션 c : ?는 요소가 특정되어 있지 않을 때 사용.
 *  	-> 특정 클래스에 있는 모든 요소들을 다른 Collection에 추가.
 *  3. 	clear() : void -> 모든 요소를 삭제
 *  4. 	contains(Object o) : 해당 Collection에 인자로 들어온 객체가 존재하면 true 아니면 false
 *  5. 	containsAll(Collection <?> c : boolean 형 -> 지정된 Collection의 요소가 이 Collection에도 포함된 경우 true
 *  6. 	equal(Object o) : boolean 형 -> 지정된 객체와의 Collection이 동일한지 비교.
 *  7. 	isEmpty() -> 해당 Collection이 비어있으면 true
 *  8. 	iterator() : Iterator<E>
 *  	-> Collection 안에 존재하는 요소에 순서대로 접근할 수 있는 Iterator 객체를 반환
 *  	-> Collection 안에 존재하는 요소들을 하나씩 꺼내서 작업할 때 사용함.
 *  9. 	remove(Object o) -> 인자로 들어온 객체를 삭제할 때 사용. 성공 시 true
 *  10.	size() : int -> Collection 안에 존재하는 요소들의 수 (for문에 사용가능)
 *  11.	toArray() : Object[] -> Collection을 배열로 만들 때 사용함.
 */
}
