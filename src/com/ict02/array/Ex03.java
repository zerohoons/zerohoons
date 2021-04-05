package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		//배열 정렬하기 (오름차순)
		int [] su = {3,5,1,2,4,6,7,9,8,10};
		int temp;
		for (int i = 0; i< su.length-1;i++) {
			for(int j = i+1; j<su.length;j++) {
			//나보다 남이 크면 자리변경 su[i]<su[j]
			//나보다 남이 작으면 자리변경 su[i]>su[j]
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
			//Arrays.sort 활용한 배열 정렬하기 (오름차순)
			int [] su2 = {3,5,1,2,4,6,7,9,8,10};
			Arrays.sort(su2); //정렬 클래스
			//sort 메소드는 해당 배열을 오름차순 하는 기능
			for (int i = 0; i < su2.length; i++) {
				System.out.println(su2[i]);
				}
			
			System.out.println();
			//Arrays.sort 활용한 배열 정렬하기 (내림차순)
			//Integer [] 나중에 배움
			//클래스를 자료형 배열로 사용.(참조 자료형 배열 일때, 내림차순 가능)
			Integer [] su3 = {3,5,1,2,4,6,7,9,8,10};
			Arrays.sort(su3, Collections.reverseOrder()); //정렬 클래스
			//sort 메소드는 해당 배열을 오름차순 하는 기능
			for (int i = 0; i < su3.length; i++) {
				System.out.println(su3[i]);
				}
			
			
	}
}
