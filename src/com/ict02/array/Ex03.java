package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		//�迭 �����ϱ� (��������)
		int [] su = {3,5,1,2,4,6,7,9,8,10};
		int temp;
		for (int i = 0; i< su.length-1;i++) {
			for(int j = i+1; j<su.length;j++) {
			//������ ���� ũ�� �ڸ����� su[i]<su[j]
			//������ ���� ������ �ڸ����� su[i]>su[j]
				if(su[i]>su[j]) {
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}else if(i==j) {
					continue;
				}
			}	
		}
		for(int i =0; i<su.length; i++){
			System.out.println(su[i]);
		}
		
		System.out.println();
			//Arrays.sort Ȱ���� �迭 �����ϱ� (��������)
			int [] su2 = {3,5,1,2,4,6,7,9,8,10};
			Arrays.sort(su2); //���� Ŭ����
			//sort �޼ҵ�� �ش� �迭�� �������� �ϴ� ���
			for (int i = 0; i < su2.length; i++) {
				System.out.println(su2[i]);
				}
			
			System.out.println();
			//Arrays.sort Ȱ���� �迭 �����ϱ� (��������)
			//Integer [] ���߿� ���
			//Ŭ������ �ڷ��� �迭�� ���.(���� �ڷ��� �迭 �϶�, �������� ����)
			Integer [] su3 = {3,5,1,2,4,6,7,9,8,10};
			Arrays.sort(su3, Collections.reverseOrder()); //���� Ŭ����
			//sort �޼ҵ�� �ش� �迭�� �������� �ϴ� ���
			for (int i = 0; i < su3.length; i++) {
				System.out.println(su3[i]);
				}
			
			
	}
}
