package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex27_Output {
	public static void main(String[] args) {
		String path = "C:" + File.separator + "Study_YH"+File.separator+"util"+File.separator + "ict09.ser";
		File file = new File(path);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<Ex27_VO> list = new ArrayList<Ex27_VO>();
			String name = null;
			int kor;
			int eng;
			int math;
			
			re:
			while(true) {
				System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요.");
				
				name = sc.next();
				kor = sc.nextInt();
				eng = sc.nextInt();
				math = sc.nextInt();
				
				Ex27_VO vo = new Ex27_VO(name, kor, eng, math);
				
				list.add(vo);
				
				re2:
				while(true) {
					System.out.println("계속하시겠습니까?" );
					int a = sc.nextInt();
					if(a==1) {
						continue re;
					} else if (a == 2) {
						break re;
					} else {
						System.out.println("잘못된 선택입니다.");
						continue re2;
					}
				}
			}
			System.out.println("종료되었습니다.");
			
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				
				oos.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
