package com.ict06.Thread;
/*Thread ����.
- �ΰ��� Thread�� �����Ͽ�, ù��°�� ����� 1-100.
  �ι�°�� ����� 101-200���� ����϶�. (synchronized ���)
*/
public class Ex15_main {
	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		
		new Thread(t1, "�ϳ�").start();
		new Thread(t1, "��").start();
	}
}
