package com.ict05.Collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	/*List interface�� ������ class�� : Stack, ArrayList, Vector;
	 * 	Stack : �������� ���� Data�� ���� ���� ����. : LIFO
	 * 	�ֿ� �޼ҵ�
	 * 	add, push, addElement : �߰� �޼ҵ�
	 * 	add(index, E) : ���� �޼ҵ�
	 * 	pop : �� ���� �����ϴ� ��ü�� ��ȯ�ϰ� �����Ѵ�.
	 *	peek :	�� ���� �����ϴ� ��ü�� ��ȯ. ������ ������ ���� �ʴ´�. -> ���ѷ����� ���� ���輺 ����.
	 *	search : �˻�(������, 1����)
	 *	indexOf : �˻�(����, 0����) -> �迭���.
	 *	elementAt(index) : ��ġ���� �޾Ƽ� �ش� ��ü ����
	 *	get(index) : ��ġ���� �޾Ƽ� �ش� ��ü ����
	 *	firstElement : �� ó�� ��� ����
	 *	lastElement	 : �� ������ ��� ����
	 *	setElement(Element, index) : ġȯ */
	public static void main(String[] args) {
	Stack<String> stack = new Stack<String>();
	stack.add("�Ѹ�"); 			//�߰�
	stack.addElement("������"); //�߰�
	stack.push("������");		//�߰�
	System.out.println(stack);  
	
	stack.add(1, "�����");	//����
	System.out.println(stack);
	
	stack.add(0, "��ġ");	//����
	stack.add(1, "����"); //������ ��ġ�� �ٽ� �����ϴ� �͵� ����. -> �ߺ�X
	System.out.println(stack);

	stack.add(1, "������"); //�ߺ� -> ��밡��
	System.out.println(stack);
	System.out.println("====================");
	//��������ü����.
	//peek
	System.out.println(stack.peek());
	System.out.println(stack);
	//pop
	System.out.println(stack.pop());
	System.out.println(stack); //-> pop�Ŀ��� ������ ��ü�� �����
	System.out.println("====================");
	//contains, indexOf, search, get, elementAt, firstElement, lastElement
	if(stack.contains("����")) {
		System.out.println("������");
		//�ش� ��ü�� ��ġ�� �˾Ƴ���
		System.out.println(stack.indexOf("����") + " ��°�� ��ġ�� / indexOf"); //indexOf�� search�� ���� ����� ���� ���ڰ� �޶� ����� �ٸ���.
		System.out.println(stack.search("����") + " ��°�� ��ġ�� / search");
		
		//�ش� ��ġ�� ��ü ������
		System.out.println(stack.get(2)); //get : ���� ������ ��. ��ġ�� indexOf�� ����.
		System.out.println(stack.get(stack.indexOf("����"))); 
		System.out.println(stack.elementAt(stack.indexOf("����"))); 
		System.out.println(stack.firstElement()); //��ġ 0�� ��ü
		System.out.println(stack.lastElement());  //������ ��ġ�� ��ü
		
	}else {
		System.out.println("������������");
	}
	System.out.println("====================");
	//size
	System.out.println(stack.size() + "��Ұ� �����մϴ�.");
	//setElementAt : ��Ұ� ġȯ
	stack.setElementAt("������", 3);
	System.out.println(stack);
	//set : ġȯ
	stack.set(3, "��ġ"); //setElementAt�� �Է� ������ �ٸ�.
	System.out.println(stack);
	System.out.println("====================");
	//�ϳ��� ������.
	//���1) ������ for �� -> ������ ����
	for (String k : stack) {
		System.out.println(k);
	}
	System.out.println(stack.size() + "��Ұ� �����մϴ�.");
	System.out.println();
	//���2) iterator -> ������ ���� 
	Iterator<String> it = stack.iterator();
	while (it.hasNext()) {
		String msg = (String) it.next();
		System.out.println(msg);
	}
	System.out.println(stack.size() + "��Ұ� �����մϴ�.");
	System.out.println();
	//���3) pop -> �����Ͱ� ������.
	while(!stack.isEmpty()) {
		String k = stack.pop();
		System.out.println(k + " ������, ũ��� "+ stack.size());
	}
	System.out.println(stack.size() + "��Ұ� �����մϴ�.");
	}
}