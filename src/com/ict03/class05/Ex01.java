package com.ict03.class05;

/*	interface.
 *  interface�� �����ϴ� ������ ��ϰ� ���� ���̴�.
 *  ����� �߻�޼ҵ�θ� �̷�����ִ�.
 *  �����ڰ� �������� �ʴ´� -> ��ü������ �Ұ����ϴ�. -> ���� ����� �Ұ��� -> ���߻���� ����.
 *  ���� ����� ���ؼ��� interface�� ��ӹ޴� class�� �ΰ� �� class�� �̿��� ����Ѵ�.
 *  ��'interface�� ����.' ��� ���� ��ü(ȣȯ)�� �����ϴٶ�� �ǹ̡��̴�.*/

public interface Ex01 {
	//�������̽��� ����� �߻�޼ҵ常 ������ �ִ�.
	//�������̽� �ȿ��� ������ �ʿ�ġ �ʴ�.
	
	//���
	final int s1 = 10;
	static final int s2 = 20;
	int s3 = 30;
	static int s4 =40;
	//�� �װ��� ��� �ʵ�� ��� static final�̴�.
	//why? -> interface ���� ��� �ʵ�� ��� static final�� �Է� �Ǿ�����.
	
	//�޼ҵ�
	public void play(); //abstract�� �������� �ʾƵ� �߻�޼ҵ��̴�. -> interface���� ��ġ�� �ֱ� ������.
	public void like(); 	
	public void sound(); 	
}
