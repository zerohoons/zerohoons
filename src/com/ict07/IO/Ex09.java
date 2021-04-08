package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* ���蹮��
 * C:\\Study\\util\\test100.txt 
 * 1. �� ���Ͽ� �̸� : ������ ����:���� ��ȭ��ȣ : ~~~ �� ���� �о��.
 * 
 * 2. �� ���Ͽ� �׸� / ���� ������ �ٸ� ���(C:\\Study\\util\\res)�� �����ϰų� �̵��ϱ�. 
 * 
 */
public class Ex09 {
 public static void main(String[] args) {
	/*	C:\\Study\\util\\test100.txt ���Ͼȿ�
	 * 	�̸� : 
	 * 	���� :
	 * 	��ȭ��ȣ :
	 * 	���� ������ ������ �ۼ��ϱ�.
	 */
	 
	 //��ġ�� ���.
	 String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"test100.txt";

	 
	 //���� ��fos bos ����
	 File file = new File(pathname);
	 FileOutputStream fos = null;
	 BufferedOutputStream bos = null;
	 
	 //trycatch �Է� ��, �� �ۼ� �غ�
	 try {
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		
		String msg = "�̸� : ������\r���� : 27��\r��ȭ��ȣ : 010-6880-7344";
		byte[] b = msg.getBytes(); //��Ʈ���� ����Ʈ�� ����
		bos.write(b);
		bos.flush();
		
	} catch (Exception e) {
	}finally {
		try {
			bos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	 
}
}
