package com.ict03.class07;

interface Test{
	int data = 1000;
	void printData();
}
//��� �޾� ���.
class Test02 implements Test{
	public void printData() {
		System.out.println("data : "+data);
	};
}

//��ӹ��� �ʰ� ���
class Test03{
	Test t = new Test(){
		public void printData() {
			System.out.println("data : "+data);
		}
	};
}

//��ӹ��� �ʰ� �޼ҵ忡 �ֱ�
class Test04{
	public void play() {
		new Test() {
			
			@Override
			public void printData() {
				System.out.println("data : "+data);
			}
		}.printData();//Ŭ���� ��
	}//�޼ҵ� ��
}

//��ӹ��� �ʰ� �޼ҵ� ���ڿ� �ֱ�
class Test05{
	public void sound(Test test) {
		test.printData();
	}
}
public class Ex08 {
	public static void main(String[] args) {
		//��ӹ޾� ����� ��� ȣ���
		Test02 test = new Test02();
		test.printData();
		
		//��ӹ��� ���� ��� ȣ���
		Test03 test2 = new Test03();
		test2.t.printData(); //Ŭ����ȣ��.���.���ϴ� �޼ҵ�
		
		//�޼ҵ� �ȿ� �ִ� ���.
		Test04 test3 = new Test04();
		test3.play();
		
		//�޼ҵ� ���ڿ� �ִ� ���. -> �̺�Ʈ ó����
		Test05 test4 = new Test05();
		test4.sound(new Test() {
			
			@Override
			public void printData() {
				System.out.println("data : "+data);
			}
		});
	}
}
