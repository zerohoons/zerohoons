package com.ict03.class01;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08 coffee = new Ex08(); //���� Ŭ������ ����� ���뱸���� �����ϴ�.
		coffee.setName("Ŀ��");	  
		coffee.setPrice(1800);
		
		Ex08 ion = new Ex08();	  //Ŭ������ ������ �����ϴ�. ������ �̸�����.
		ion.setName("�̿�����");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("ź������");
		cola.setPrice(2000);
		
		Ex08 juice = new Ex08();
		juice.setName("��������");
		juice.setPrice(2200);
		
		//�迭���� Ȱ���� ����
		//�ڷ��� [] �̸� = new �ڷ��� ����
		 /*
		Ex08[] arr = new Ex08[4]; //Ŭ������ �ڷ������� �̿��� �Ѵ� = �����ڷ���
		arr[0] = coffee;
		arr[1] = ion;
		arr[2] = cola;
		arr[3] = juice;
		*/
		Ex08[] arr = {coffee, ion, cola, juice}; //�̷��Ե� �迭 ����
		
		//arr �迭�� ���� �̸�, ������ �������.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+" , " +arr[i].getPrice());
		}
		
		
		//���� ����
		//1500�� �̻� -> ���� ����(�ݾ׿� ���� ������) / 1500�̸� -> �ݾ׹̴�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �����ϼ���");
		int money = sc.nextInt();
		
		first:
		while(true) {
		if(money >= 1500) {
				//System.out.println("1. Ŀ��\t2.�̿�\t3.ź��\t4.�ֽ�");
				for (int i = 0; i < arr.length; i++) {
					if(arr[i].getPrice()<=money) {
						System.out.print((i+1)+"."+arr[i].getName()+" (O) ");
					}else {
						System.out.print((i+1)+". "+arr[i].getName()+" (X) ");
					}
				}
			}else {
				System.out.println("�ݾ׺���");
		}
		System.out.println();
		System.out.print("��ȣ�� �����ϼ��� >> ");
		
		int sel = sc.nextInt();
		int change = 0;
		for (int i = 0; i < arr.length; i++) {
			if(sel == (i+1)) {
				change = money - arr[i].getPrice();
				System.out.println(arr[i].getName()+" �� �ܵ� "+change+ "�� �Դϴ�.");
				if(change>=1500) {
					continue first;
				}
			else {
				break first;
			}
		}
		/*
		 for �� ������� �ʰ�, if�� �ϳ��ϳ� �Է��ص� ����.
		 */	
		}
	}
	}
}

