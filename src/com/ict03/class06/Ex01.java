package com.ict03.class06;

/*	������(enum) : ����� �ϳ��� ��ü�� �ν��ϰ�, �������� ��� ��ü���� �� ���� ��� �� �ϳ��� ���� */

public class Ex01 {
	static final int JAVA = 100;
	static final int DB = 200;
	
	//enum
	public enum Lesson{
		JAVA, JSP, SPRING, ANDROID, HTML
	}
	
	public static void main(String[] args) {
		
		//�Ϲ����� ��� ȣ��
		System.out.println("JAVA : "+Ex01.JAVA);
		
		//enum ȣ��
		System.out.println("enum JAVA : " + Lesson.JAVA);
		
		//�迭�� ����� �̿��ϱ�.
		Lesson[] arr = Lesson.values();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
