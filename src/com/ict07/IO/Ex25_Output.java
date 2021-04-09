package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex25_Output {
	public static void main(String[] args) {
		//파일 위치 지정
		String pathname = "C:"+File.separator + "Study_YH"+File.separator+"util"+File.separator+"성적.ser";
		File file = new File(pathname);
		
		//입력받기 설정
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<Ex25_VO> list = new ArrayList<Ex25_VO>();

			String name = null;
			int kor;
			int eng;
			int math;
			while(true) {
				
			System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요.");
			
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			Ex25_VO vo = new Ex25_VO(name, kor, eng, math);
			
			list.add(vo);
			
			while (true) {
				
			System.out.println("계속 입력 할까요? 1. 계속 . 2, 그만");
			
			int a = sc.nextInt();
			
			re:
			if(a==2) {
				break;
			} else if(a==1) {
				continue;
			}else {
				System.out.println("잘못된 접근입니다. 다시 입력해주세요.");
				continue;
			}
			}
			break;
			}

			System.out.println("종료되었습니다.");
			
			//객체 직렬화
			oos.writeObject(list);
			
			oos.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
