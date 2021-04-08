package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* ����ڿ��� ���� ���� �����, res�� ���ο� ���Ϸ� �����ϴ� ���α׷�
 * ������ҿ� ���ϸ��� ���� -> ���� ��ҿ� ���ϸ��� ���� -> ����.
 */
public class Ex19_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��� ��ġ �ޱ�.
		System.out.println("������ ������ �ִ� ��ġ�� �����ּ���.");
		String pathname = sc.next();
		//���ϸ�ޱ�
		System.out.println("������ ���ϸ��� �����ּ���.");
		String copy = sc.next();
		
		//�������� ��ġ �ޱ�
		System.out.println("�������� ��ġ�� �����ּ���");
		String pathname2 = sc.next();
		System.out.println("������ ���ϸ��� �˷��ּ���.");
		String paste = sc.next();
		//���ϸ�� ��ġ ��ġ��
		pathname = pathname + File.separator + copy;
		pathname2 = pathname2 + File.separator +paste;
		
		//���� �б� ����
		File r_file = new File(pathname);
		File w_file = new File(pathname2);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileReader fr = null;
		BufferedReader br = null;
		
//		FileInputStream fis = null;
//		BufferedInputStream bis = null;
//		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(r_file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
		
			fr = new FileReader(r_file);
			br = new BufferedReader(fr);
			
//			fis = new FileInputStream(w_file);
//			bis = new BufferedInputStream(fis);
//			dis = new DataInputStream(bis);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg= br.readLine())!=null) {
				dos.writeBytes(msg);
			}
			
			dos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
//				dis.close();
//				bis.close();
//				fis.close();
				dos.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
		
	}
}
