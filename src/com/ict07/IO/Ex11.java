package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11 {
	public static void main(String[] args) {
		//C:\\Study\\util\\java_1.png ������ C:\\Study\\util\\res�� ����.
		
		//�д� ��ġ ����
		String pathname1 = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"java_1.png";
		
		//���� �б� ����
		File read_file = new File(pathname1);
		
		//���� �� ��ġ ����
		String pathname2 = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"res"+File.separator+"����_1.png";
		//�ѱ۷� ���Ӱ� �ۼ��ϴ� �� ����.
		
		File write_file = new File(pathname2);
		
		//���� �о ����
		//input Stream
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		//output Stream
		FileOutputStream fos =null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(write_file);
			bos = new BufferedOutputStream(fos);
		
		//�׸�, �Ҹ�, ������ ���ϵ��� ó���ϱ�.
		//������ 1byte�� ó���ؾ���.
		int k = 0;
			//1byte�� �б�.
			while((k=bis.read())!=-1) {
				//1byte�� ����
				bos.write(k);
			}
		bos.flush();
		
		} catch (Exception e) {
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				
			//�̵� �Ϸ� ��, ���� ���� ����
			//������ �������¿����� ������ �� ����.
			read_file.delete();
			
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
		//C:\\Study\\util\\java_2.png ������ ����
		
	}
}
