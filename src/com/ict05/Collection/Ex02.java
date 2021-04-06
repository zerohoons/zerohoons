package com.ict05.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		//	Set interface�� ��ӹ��� class : HashSet, TreeSet
		//	HashSet�� TreeSet�� ������� ��� ����.
		//	�׷��� TreeSet�� ���ο��� �׻� �������� ���Ļ��¸� �����Ѵ�.
		//	set�� Ư�� �������� ������ �� �� ����.
		//	HashSet, TreeSet ��� �ߺ� �ȵ�
		
		//	�÷��� ����
		//	HashSet<Genetic Type = ��üŸ�� = ���� Class> �������� = new HashSet<Genetic Type>();
		//	HashSet<Genetic Type = ��üŸ�� = ���� Class> �������� = new HashSet<>();
		
		HashSet<String> h1 = new HashSet<>(); // String -> ���ڿ��� ��ü ����
		HashSet<Integer> h2 = new HashSet<Integer>(); // Integer -> ������ ��ü ����. <��>�� ���� ����.
		HashSet<Double> h3 = new HashSet<>(); // Double -> ������ ��ü ����. <��>�� ���� ����.
		HashSet<Boolean> h4 = new HashSet<>(); // Boolean -> ���� ��ü ����
		
		// h2(������)�� ��ü�� �߰��ϴ� ���
		// ���1) �⺻�ڷ����� ��ü�� ���� �ֱ�. => Boxing
			Integer k1 = new Integer(10);
			Integer k2 = new Integer("10");
			
		//���2) �⺻�ڷ����� �׳� �ִ´�
		//�⺻ �ڷ������� �Է� �� -> �ڵ������� ��ü�� ��ȯ�Ǿ �־���. : AutoBoxing
			h2.add(k1); //���1															//true
			h2.add(k2); //���1															//false
			h2.add(10); //���2 -> �⺻�ڷ��� �ִ� ���									//false
			h2.add(new Integer(10));//���3 -> Ŭ������ �ִ� ���						//false -> �ߺ��� ������� �ʱ� ������ ù ���� �Է��� �ǰ� �������� �Ѱܳ�.
			//h2.add('A'); -> Genetic Ÿ�� �ٸ��� ���� : �ڷ��� ũ�����̿� ��� ����.	
			
			h3.add(3.14);
			h3.add(new Double(31.4));
			//h3.add(14); ���� Genetic Ÿ���� �ƴϸ� ������ ����
			
		//���뺸�� (��ü ���� ����)
			System.out.println(h2); //�ߺ��� ������� �ʱ� ������ ���� ���� �ϳ��� ���� �� ����.
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
			
		//�ϳ��� ������ ����ϱ�
		//���1) ������ for�� (�Ϲ� for���� ��� �Ұ� -> index�� ����.)
			for (String k : h1) {
				String msg = k;
				System.out.println(msg);
			}
			System.out.println("========================");
		//���2) iterator()
		Iterator<String> it = h1.iterator(); //h1�� ���ʴ�� �����ϴ� ������ it
		while (it.hasNext()) {					//hasNext() : ������ �����ϸ� true �ƴϸ� false
			String string = (String) it.next();	//�ϳ��� ���������� �ѱ�鼭 ����.
			System.out.println(string);
		}
	}
}
