package com.ict05.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 coffee = new Ex03();
		
		//setter�� �̿��ؼ� �̸��� ���� ����
		coffee.setName("Ŀ������");
		coffee.setPrice(2500);
		
		//�����ڸ� �̿��ؼ� �̸��� ���� ����.
		Ex03 cola = new Ex03("��   ��",1600);
		Ex03 juice = new Ex03("��������",2300);
		
		//��ü���� �����ϰ� �����ϴ� ��� : Array, Collection
		
		//1. Array
		Ex03[] arr = new Ex03[3]; //ó�� ������ �迭 ���� �̻����� �߰� �Ұ���
		arr[0] = coffee;
		arr[1] = cola;
		arr[2] = juice;
		
		//�̸��� ���� ������
		for (Ex03 k : arr) {
			System.out.print("�̸� : "+k.getName()+" / ");
			System.out.println("���� : "+k.getPrice());
		}
		System.out.println("====================");
		
		//2. Collection
			//����
		HashSet<Ex03> h1 = new HashSet<Ex03>(); //class�� Collection �����ϱ�.
		
			//�߰�
		h1.add(coffee);
		h1.add(cola);
		h1.add(juice); 
			//���� �߰��� ����
		h1.add(new Ex03("�̿�����", 1500));
		h1.add(new Ex03("��   ��", 1000));
		
		//�̸��� ���� ������
		//��� 1) ������ for��
		for (Ex03 k : h1) {
			System.out.print("�̸� : "+k.getName()+" / ");
			System.out.println("���� : "+k.getPrice());
		}
		System.out.println("====================");
		//���2) iterator �̿�
		Iterator<Ex03> it = h1.iterator(); //Ŭ������ �̿��� ���� Ŭ���� ��!
		while(it.hasNext()) {
			Ex03 ex03 = (Ex03)it.next();
			System.out.print("�̸� : "+ex03.getName()+" / ");
			System.out.println("���� : "+ex03.getPrice());
		}
		System.out.println("====================");
		//���Կ��� : contains
		if(h1.contains(coffee)) {
			System.out.println("�ִ�.");
		}else {
			System.out.println("����.");
		}
		//���� : size
		System.out.println(h1.size());
		
		/*���� : remove(Object o), clear()
		 	-> Collection �ȿ� �ش� ��ü�� ������ ����.*/
		
		//cola�� �����غ���.
		if(h1.contains(cola)) {
			h1.remove(cola);
			System.out.println(cola.getName() + " ����");
		} else {
			System.out.println("�̹� �������� ����.");
		}
		
		//ice�� �����غ���.
		if(h1.contains("ice")) {
			h1.remove("ice");
			} else {
			System.out.println("�̹� �������� ����.");
		}
		
		//����ִ��� Ȯ�� : isEmpty()
		if(h1.isEmpty()) {
			System.out.println("����ִ�.");
		}else {
			System.out.println("������� �ʴ�.");
		}
		
		//��ü ����
		h1.clear();
		
		if(h1.isEmpty()) {
			System.out.println("����ִ�.");
		}else {
			System.out.println("������� �ʴ�.");
		}
		
		
	}
}
