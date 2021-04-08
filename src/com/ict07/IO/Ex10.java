package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* ���蹮��
 * C:\\Study\\util\\test100.txt 
 * 1. �� ���Ͽ� �̸� : ������ ����:���� ��ȭ��ȣ : ~~~ �� ���� �о��.
 * 
 * 2. �� ���Ͽ� �׸� / ���� ������ �ٸ� ���(C:\\Study\\util\\res)�� �����ϰų� �̵��ϱ�. 
 * 
 */
public class Ex10 {
 public static void main(String[] args) {
	/*	C:\\Study\\util\\test100.txt ������ �о��. */
	 
	//��ġ�� ���.
		 String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"test100.txt";
		 
		 //���� ��fis bis ����
		 File file = new File(pathname);
		 FileInputStream fis = null;
		 BufferedInputStream bis = null;
		 
		 try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (Exception e) {
		}finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 
}
}
