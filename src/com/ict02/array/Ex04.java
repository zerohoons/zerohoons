package com.ict02.array;

import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		//���� ���ϱ�.
		//1. ��� ����� ������ 1������ �ʱ�ȭ �Ѵ�.
		//2. ��� ������ ���ؾ��Ѵ�. (�� �ڱ� �ڽŰ��� ������ �ʴ´�.)
		//3. ������ ���� ũ�� �� ������ �����Ѵ�.
		
		int [] su = {270, 265, 285, 290, 285};
		int [] rank = {1, 1, 1, 1, 1};
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if(su[i]<su[j]) {
					rank[i]+=1;
				}else if(i==j)continue;
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
	}
}
