package com.ict06.Thread;

public class Ex18_Producer implements Runnable {
	//Ŭ������ �ڷ������� ���. (���� �ڷ���)
	private Ex17_Car car;
	
	//�����ڿ��� ���� ���ڴ� ������ ���������� ������.
	public Ex18_Producer(Ex17_Car car) {
		//���������� ���������� �̸��� ���� �� �������� �տ��� this
		this.car = car;
	}
	
	public void run() {
			String carName = null;
			for(int i = 0; i<30; i++) {
				//�ڵ��� ����
				carName = car.getCar();
				//����� �ڵ����� â�� �ֱ�
				car.puch(carName);
				try {
					Thread.sleep((int)(Math.random()*300));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
