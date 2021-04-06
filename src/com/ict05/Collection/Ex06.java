package com.ict05.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {
	public static void main(String[] args) {
		/*List interface�� ������ class�� : Stack, ArrayList, Vector;
		 * ArrayList �� Vector : �迭�� ���� ����� ����. ��, �迭�� �޸� ����, ����, �߰��� �����Ӵ�.
		 * 					   : ũ�⸦ �̸� �����ϴ� ���ŷο��� ����.
		 * 					   : ArrayList�� ����ȭ �������� ������, Vector�� ����ȭ�� �����Ѵ�.
		 *  #����ȭ��? ���ͳ� Ƽ����ó�� �ϳ��� ������ ���� �Է��� ���� ��, ����ȭ�� ���� �ϳ��� �Է°��� �Է½�Ų��.
		 * Set ������ ����X , �ߺ� X
		 * List ������ ���� O, �ߺ� O -> Stack, ArrayList, Vector ���� ���� O, �ߺ� O */
		
		//ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		//�߰� : add
		list.add("����ȣ");
		list.add("������");
		list.add("�����");
		System.out.println(list);
		
		//���� : add
		list.add(1,"�߽ż�");
		System.out.println(list);
		
		//contains Ȱ��
		if(list.contains("�����")) {
			//�˻� : ��ġ�� �˻�
			System.out.println(list.indexOf("�����")+ " ��° ��ġ");
			
			//�˻� : �ش� ��ġ�� �����ϴ� ��ü�� �˻�
			System.out.println(list.get(3));
			System.out.println(list.get(list.indexOf("�����")));
			//elementAt, firstElement, lastElement �� ����.	
		}else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		
		
		//size
		System.out.println(list.size() + "��Ұ� ������");
		
		//ġȯ : set
		list.set(3, "�̴�ȣ");
		System.out.println(list);
		
		//�����غ���. ( �߽ż��� ������, �߽ż��� ���������� �ٲ㺸��.)
		
		if(list.contains("�߽ż�")) {
			list.set(list.indexOf("�߽ż�"), "������");
			System.out.println(list);
		}else {
			System.out.println("�߽ż��� �����ϴ�.");
		}
		
		//�ϳ��� ��������.
		//��� 1) ������ for��
		
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println();
		//��� 2) iterator
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1);
		}
		System.out.println("=========================================");
		//Vector
		Vector<String> vector = new Vector<String>();
		
		//�߰�
		vector.add("�Ѹ�");
		vector.add("�����");
		vector.addElement("��ġ");
		System.out.println(vector);
		
		//����
		vector.add(2, "����");
		System.out.println(vector);
		
		//contains Ȱ��
		
		if(vector.contains("�Ѹ�")) {
			//�˻� : ��ġ�� �˻�
			System.out.println(vector.indexOf("�Ѹ�")+ " ��° ��ġ");
			
			//�˻� : �ش� ��ġ�� �����ϴ� ��ü�� �˻�
			System.out.println(vector.get(0));
			System.out.println(vector.get(vector.indexOf("�Ѹ�")));
			//elementAt, firstElement, lastElement �� ����.	
		}else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		
		//size
		System.out.println(vector.size() + "��Ұ� ������");
		
		//ġȯ
		vector.set(0, "������");
		System.out.println(vector);
		
		//�ϳ��� ��������
		//��� 1) ������ for��
		
				for (String k : vector) {
					System.out.println(k);
				}
				System.out.println();
				//��� 2) iterator
				Iterator<String> its = vector.iterator();
				while (its.hasNext()) {
					String s1 = its.next();
					System.out.println(s1);
				}
	
	}
}
