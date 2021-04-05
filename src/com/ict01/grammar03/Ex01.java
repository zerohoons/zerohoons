package com.ict01.grammar03;
class Ex01{
	public static void main(String[] args){
		// �� ������ : &&(and, ����) ||(or, ����), !(not, ������)
		// ���Ǵ� �ڿ� : boolean��, �񱳿���, ������ = ���� True/False �� �͵�
		// ����� boolean�� => ���ǽĿ� ���ȴ�.
		
		//&&(and, ����, ������) - �־��� ������ ��� True �� ���� ����� True
		// �־��� ���ǵ� �߿� false�� ������ ���� ��� false
		// false�� ������ ���Ŀ� �ִ� ������ ���� ����.

		boolean result = true && true;;
		System.out.println(result);
		
		int s1 = 10;
		int s2 = 7;
		result = (s1>=7) && (s2>=5);
		System.out.println(result);

		result =  (s2<=5) && (s1>=7); //false �� ������ ���� �������� �ʴ´�.
		System.out.println(result);

		result = ((s1 = s1+ 2) > s2) && (s1 == (s2 = s2 +5));
		System.out.println(result);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		result = ((s1 = s1+ 2) < s2) && (s1 == (s2 = s2 +5));
		System.out.println(result);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		//&& �� ������ ��� ������ ������ �� �ִ�.
		// a>= 10 && a<=20 ;  => 10<=a<=20
		s1 = 24;
		result = (s1>=20) && (s1<=30);
		System.out.println("��� : "+ result);
	
		//char c1�� �ҹ����ΰ�.
		char c1 = 'D';
		char a = 'a';
		char z = 'z';
		result = (c1>=a) && (c1<=z);
		System.out.println(result);
	}
}