package com.ict03.class05;

/* interface ���
 * 1. �Ϲ� class�� interface�� ����Ѵٸ�, ������ �������̵��� �ʼ�!
 * 2. �߻� class�� interface�� ����Ѵٸ�, �� �� �߻��̱� ������ �������̵� �ʿ����.
 * 3. interface�� inetrface�� ����Ѵٸ�, ���� �����̱⿡ �������̵� �ʿ����.
 * 4. interface�� ���߻���� �����ϴ�.
 * 	->�ڽ� interface extends �θ�interface1, 2, 3; 
 * 5. �Ϲ� class�� �θ� class�� �θ� interface�� ���� ����Ϸ���,
 * 	-> class �̸� extends �θ�class implements interface;
 * 6. interface -> interface, class -> class : extends ����� ��� : �ڽ� -> �θ�
 * 	  class -> interface : implements ����� ���. interface -> class�� ��� �Ұ���
 */
class Ex03 implements Ex01 {
	
	//class�� interface�� �θ�� �α� ������ override �ʼ�!
	public void like() {
		// TODO Auto-generated method stub
		
	}public void play() {
		// TODO Auto-generated method stub
		
	}public void sound() {
		// TODO Auto-generated method stub
		
	}
}

//�߻�class �� interface ����ϴ� ���
abstract class Ex04 implements Ex01{
	//override �ʿ� ����.
}

//interface�� interface�� ����ϴ� ���
interface Ex05 extends Ex01{
	//override �ʿ����
}