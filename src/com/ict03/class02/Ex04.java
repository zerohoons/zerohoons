package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;
//���������� ����
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int com = rand.nextInt(2)+1;
		int hum = 0;
		int game = 0;
		int win = 0;
		game:
		while(true) {
		System.out.println("1. ���� / 2. ���� / 3. ��");
		System.out.print("����� ������? >>>>>");
		hum = sc.nextInt();
		if(hum >= 4 || hum <=0) {
			System.out.println("�߸��� ����Դϴ�. ����˴ϴ�."); 
			break;
		}else { game++;	
			if(com < hum) {
					win++;
					System.out.println("�¸�!");
				} else if (hum == 1 && com == 3) {
					win++;
					System.out.println("�¸�!");
				}
					else if (com==hum) {
					System.out.println("���º�.");
				} else if (hum < com) {
					System.out.println("�й�!");
				} else if (hum==3 && com == 1) {
					System.out.println("�й�!");
				}
			
			System.out.println("����Ͻðڽ��ϱ�? : 1.��� / 2.�׸�" );
			int con = sc.nextInt();
			if (con == 1) {
				continue game;
			}else {
				double point = (double)(win)/(double)(game) *100;
				System.out.println(win);
				System.out.println("������ ����Ǿ����ϴ�.");
				System.out.println("�� "+game + " �� �߽��ϴ�.");
				System.out.println("�·��� " + point +" % �Դϴ�.");
				break game;
			}
			
		
		}
		
	}
}
}
