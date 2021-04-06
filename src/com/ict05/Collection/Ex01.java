package com.ict05.Collection;
/* ���׸� - �÷����� ����ü. == Ÿ��
 * �÷��� - Ư�� ��ü�θ� ������ �Ǿ��� �ִ� ��. == �ڷᱸ��
 * ��ü - Ŭ������ �������
 * -> ���׸� - Ŭ������ ������� Ư�� ��ü �׷���� ����ü.
 */
public class Ex01 {
/*	���׸��� �÷���(�ڷᱸ��)
 * 	Genetic	   : Collection�� � ��ü��� �̷���������� ǥ���ϴ� ��ü Ÿ��.
 * 	Collection : ��ü���� ��Ƽ� �����ϴ� �������̽��� �����Ѱ�.
 * 	API		   : <T> - ��ü Ÿ��. type , <E> - ���. elements (Collection �ȿ� �����ϴ� ��ü �ϳ�)	
 *			  	 Map ���Ŀ����� <K, V> - Key, Value 
 *				 Key�� Value�� 1:1 �������� Key�� ȣ���ϸ� Value�� ���´�.
 *
 *	����	   : Collection<Genetic>
 *	�ֻ��� Collection : Collection<E>, Map<K,V>
 *	Collection<E>�� ��ӹ��� �������̽� : Set<E>, List<E>, Queue<E> */
	
/*	Collection<E>�� �ֿ� �޼ҵ�.
 * 	1. 	add(E e) : boolean �� ->  �ش� Collection�� ���� �߰�. ������ true.
 * 	2. 	addAll(Collection <? extends E<c) : boolean�� -> Collection<? extends E> : ���(?) ��Ҹ� ��ӹ��� �÷��� c : ?�� ��Ұ� Ư���Ǿ� ���� ���� �� ���.
 *  	-> Ư�� Ŭ������ �ִ� ��� ��ҵ��� �ٸ� Collection�� �߰�.
 *  3. 	clear() : void -> ��� ��Ҹ� ����
 *  4. 	contains(Object o) : �ش� Collection�� ���ڷ� ���� ��ü�� �����ϸ� true �ƴϸ� false
 *  5. 	containsAll(Collection <?> c : boolean �� -> ������ Collection�� ��Ұ� �� Collection���� ���Ե� ��� true
 *  6. 	equal(Object o) : boolean �� -> ������ ��ü���� Collection�� �������� ��.
 *  7. 	isEmpty() -> �ش� Collection�� ��������� true
 *  8. 	iterator() : Iterator<E>
 *  	-> Collection �ȿ� �����ϴ� ��ҿ� ������� ������ �� �ִ� Iterator ��ü�� ��ȯ
 *  	-> Collection �ȿ� �����ϴ� ��ҵ��� �ϳ��� ������ �۾��� �� �����.
 *  9. 	remove(Object o) -> ���ڷ� ���� ��ü�� ������ �� ���. ���� �� true
 *  10.	size() : int -> Collection �ȿ� �����ϴ� ��ҵ��� �� (for���� ��밡��)
 *  11.	toArray() : Object[] -> Collection�� �迭�� ���� �� �����.
 */
}
