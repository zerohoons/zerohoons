package com.ict05.Collection;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		//로또 : 1-45 (랜덤, 6자리, 중복안됨)
		HashSet<Integer> lotto = new HashSet<Integer>();
		
			for (int j = 0; j < 6; j++) {
				int k = (int)(Math.random()*45)+1; //1-45
				boolean b = lotto.add(k);
				if(!b) {
					j--;
				}
			}
			System.out.println(lotto);
		}
	}

