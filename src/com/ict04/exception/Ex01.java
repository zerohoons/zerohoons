package com.ict04.exception;

public class Ex01 {
	public static void main(String[] args) {
		/* �Ϲ�������, �ڹٿ����� ������ �߻��ϸ� ���α׷��� ������ �����Ű�µ�,
		 * ����� ������ ������ ������ ���, ������ ó���ϴ� ����� ����ϸ�
		 * ���α׷��� ������ ����Ǵ� ���� �ƴ�, ���� ���Ḧ �ϰ� �ȴ�. �̷��� ����� ����ó����� �Ѵ�.*/
		
		//try ~ catch ��
		/*try{
		 * ���ܰ� �߻� ������ ����} catch(����Ǵ� ���� ��ü ������{
		 * �ش� ���ܰ� �߻��� ������ ����. }
		 * ���ܰ� �߻����Ұ�� ������.
		 * 
		 * ���� ĳġ��
		 * try{
		 * }catch(1){
		 * }catch(2){
		 * }catch(3){ }*/
		try {
		int [] ver = { 10, 20, 30};
		for (int i = 0; i <= ver.length; i++) {
			System.out.println(1);
			System.out.println(1);
			System.out.println("ver[" + i + "] = "+ver[i]);
			System.out.println(3);
			System.out.println(4);
		} } catch(Exception e) {

		}
		System.out.println("�����ϼ̽��ϴ�.");
	
	}
}
