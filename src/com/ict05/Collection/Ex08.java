package com.ict05.Collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		/*	Map : interface
		 *  -> Key �� Value�� mapping �ϴ� ������ �̷����.
		 *  -> Key�� �ߺ��� �� ����. -> �ڵ����� ��������� ������ ���� �� �� ����.
		 *  -> Key�� ȣ���ϸ� Value�� ���´�.
		 *  -> Key�� set Collection�� ������ �����Ѵ�.
		 *  
		 *  �ֿ�޼ҵ�
		 *  add()�� �߰�, ������ �� �� ����.
		 *  ���� : put(K key, V value)
		 *  key�� set���� ���� : keySet()
		 *  containsKey(Object key) : boolean -> ���ڷ� ���� Key�� �����ϸ� true
		 *  containsValue(Object value) -> ���ڷ� ���� Value�� �����ϸ� true 
		 *  get(Object key) : Ű�� �޾Ƽ� Value���� ����
		 *  remove(Object key) : Ű�� �޾Ƽ� ����
		 *  replace(K key, V value) : ġȯ*/
		
		//	Key�� �����ִ� ���ڷ� ����� for�� ��� ����.
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "�ѱ�");
		map1.put(2, "�̱�");
		map1.put(3, "�߱�");
		map1.put(4, "����");
		map1.put(5, "�±�");
		map1.put(6, "�ѱ�"); //Value���� �ߺ� ����.
		System.out.println(map1);
		
		map1.put(6, "�Ϻ�");
		System.out.println(map1);
		
		//�ϳ��� �����ϱ�.
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println(map1.get(6));
		System.out.println();
		
		for (int i = 1; i <= map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		
		System.out.println();
		// ������ for�� ��� = keySet()�� �̿��ؾ��Ѵ�.
		for (Integer s : map1.keySet()) { //keySet�� �̿����� ������ ���Ұ�!
			System.out.println(map1.get(s));
		}
		
		System.out.println();
		
		//itetator ����ؼ� ����
		
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int s1 = (int) it.next();
			System.out.println(map1.get(s1));
		}
		
		System.out.println("==============================");
		//	Key�� ���ڷ� ����� ��½� iterator�� ����ؾ��Ѵ�.
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("�̸�","��浿");
		map2.put("����", "34");
		map2.put("�ּ�", "������");
		map2.put("����", "��");
		map2.put("���", "���ڱ�");
		
		System.out.println("�̸�");
		System.out.println("����");
		System.out.println("�ּ�");
		System.out.println("����");
		System.out.println("���");
		System.out.println();
		
		//Key�� ���ڰ� �ƴϸ� ����ϱⰡ ���ŷӰ�, �׷��⿡ keySet()�� �̿��Ѵ�.
		for (String s : map2.keySet()) {
			System.out.println(map2.get(s));
		}
		System.out.println();
		
		Iterator<String> it2 = map2.keySet().iterator();
		while (it2.hasNext()) {
			String s = (String) it2.next();
			System.out.println(map2.get(s));
		}
	}
}
