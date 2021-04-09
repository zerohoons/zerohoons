package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex25_Output {
	public static void main(String[] args) {
		//���� ��ġ ����
		String pathname = "C:"+File.separator + "Study_YH"+File.separator+"util"+File.separator+"����.ser";
		File file = new File(pathname);
		
		//�Է¹ޱ� ����
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
				
			System.out.println("�̸�, ����, ����, ���� ������ �Է��ϼ���.");
			
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			Ex25_VO vo = new Ex25_VO(name, kor, eng, math);
			
			list.add(vo);
			
			while (true) {
				
			System.out.println("��� �Է� �ұ��? 1. ��� . 2, �׸�");
			
			int a = sc.nextInt();
			
			re:
			if(a==2) {
				break;
			} else if(a==1) {
				continue;
			}else {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			}
			break;
			}

			System.out.println("����Ǿ����ϴ�.");
			
			//��ü ����ȭ
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
