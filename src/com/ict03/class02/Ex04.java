package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;
//가위바위보 게임
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
		System.out.println("1. 가위 / 2. 바위 / 3. 보");
		System.out.print("당신의 선택은? >>>>>");
		hum = sc.nextInt();
		if(hum >= 4 || hum <=0) {
			System.out.println("잘못된 결과입니다. 종료됩니다."); 
			break;
		}else { game++;	
			if(com < hum) {
					win++;
					System.out.println("승리!");
				} else if (hum == 1 && com == 3) {
					win++;
					System.out.println("승리!");
				}
					else if (com==hum) {
					System.out.println("무승부.");
				} else if (hum < com) {
					System.out.println("패배!");
				} else if (hum==3 && com == 1) {
					System.out.println("패배!");
				}
			
			System.out.println("계속하시겠습니까? : 1.계속 / 2.그만" );
			int con = sc.nextInt();
			if (con == 1) {
				continue game;
			}else {
				double point = (double)(win)/(double)(game) *100;
				System.out.println(win);
				System.out.println("게임이 종료되었습니다.");
				System.out.println("총 "+game + " 판 했습니다.");
				System.out.println("승률은 " + point +" % 입니다.");
				break game;
			}
			
		
		}
		
	}
}
}
