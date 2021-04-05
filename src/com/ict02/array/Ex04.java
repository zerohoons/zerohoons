package com.ict02.array;

import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		//순위 구하기.
		//1. 모든 사람의 순위를 1등으로 초기화 한다.
		//2. 모든 사람들과 비교해야한다. (단 자기 자신과는 비교하지 않는다.)
		//3. 나보다 남이 크면 내 순위를 증가한다.
		
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
