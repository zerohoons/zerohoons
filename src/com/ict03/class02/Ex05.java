package com.ict03.class02;
/*
 * StringBuffer, StringBuilder
 */
public class Ex05 {
	public static void main(String[] args) {
		//StringBuffer, StringBuilder
		
		//String�� �Һ��� �Ӽ��� ���ϰ� �־�, �޸𸮿� ���ο� ������ �����ؼ� Ȯ���س�����.
		String msg = "hello";
		System.out.println(msg);
		msg = msg + " java"; //String�� ���� �߰��ϸ� ���ο� �޸�. ���� ���� ��� ������޸𸮰� ��.
		//���� msg �� ������ �޸𸮷�, ���ο� msg�� ���ο� �޸𸮸� �����Ѵ�.
		System.out.println(msg);
		
		//StringBuffer, StringBuilder�� �̿��� ���, �߰��� ���� ���� �޸𸮿� ���Ž�Ŵ.
		//StringBuffer, StringBuilder�� ������ �Ӽ��� ���ϰ� �ֱ� ������ �޸� ���� ���Ž�ų �� �ִ� ���̴�.
		
		StringBuffer sb = new StringBuffer("Wellcome");
		System.out.println(sb);
		
		//StringBuffer, StringBuilder������ ������ �߰��� �� append("���ڿ�"); �� �̿���.
		sb.append(" JAVA");
		//���� �޸� �������� �߰��Ѵ�.
		System.out.println(sb.toString());
	}
}
