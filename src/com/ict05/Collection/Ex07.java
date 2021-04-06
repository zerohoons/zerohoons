package com.ict05.Collection;

import java.util.LinkedList;

public class Ex07 {
	public static void main(String[] args) {
		//Queue(ť) interface�� ������ class : LinkedList
		//FIFO (First In First Out) : ���� ���� ������ ���� ������.
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		//�߰� / ���� : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedlist.add("����ȣ");
		linkedlist.offer("�ڼ���");
		linkedlist.add("�����");
		System.out.println(linkedlist);
		
		linkedlist.addFirst("�豤��");
		System.out.println(linkedlist);

		linkedlist.offerFirst("�Ѹ�");
		System.out.println(linkedlist);
		
		//��� ã��
		if(linkedlist.contains("�ڼ���")) {
			//��ġ ã��
			System.out.println(linkedlist.indexOf("�ڼ���"));
			//���� ��ġ�� �ִ� �� ã��
			System.out.println(linkedlist.get(3));
			System.out.println(linkedlist.get(linkedlist.indexOf("�ڼ���")));
			System.out.println(linkedlist.getFirst());
			System.out.println(linkedlist.getLast());
		}
		
		//size
		System.out.println(linkedlist.size() + " ��Ұ� ������");
		
		//�Ѹ��� �̴�ȣ�� ��������.
		if(linkedlist.contains("�Ѹ�")) {
			linkedlist.set(linkedlist.indexOf("�Ѹ�"), "�̴�ȣ");
			System.out.println(linkedlist);
		}else {
			System.out.println("�Ѹ��� �����ϴ�.");
		}
		
		//���� : remove, removeFirst, removeLast
		linkedlist.removeFirst();
		System.out.println(linkedlist);
	
		linkedlist.removeLast();
		System.out.println(linkedlist);
	
		System.out.println(linkedlist.remove(1)); //remove�� �����Ǵ� ���� �������� ������ ��� ����. 
		System.out.println(linkedlist);
	}
}
